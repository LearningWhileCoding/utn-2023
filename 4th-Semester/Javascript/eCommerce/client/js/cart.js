const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");
const cartBtn = document.getElementById("cart-btn");
const cartCounter = document.getElementById("cart-counter");


const displayCart = () => {

    modalContainer.innerHTML = "";
    modalContainer.style.display = "block";
    modalOverlay.style.display = "block";

    // modal header
    const modalHeader = document.createElement("div");

    const modalClose = document.createElement("div");
    modalClose.innerText = "❌";
    modalClose.className = "modal-close";
    modalHeader.append(modalClose);

    modalClose.addEventListener("click", () => {
        modalContainer.style.display = "none";
    modalOverlay.style.display = "none";

    });

    const modalTitle = document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className = "modal-title";
    modalHeader.append(modalTitle);

    modalContainer.append(modalHeader);

    if(cart.length > 0) {

        // modal body
        cart.forEach((product) => {
            const modalBody = document.createElement("div");
            modalBody.className = "modal-body";
            modalBody.innerHTML = `
            <div class="product">
                <img class="product-img" src="${product.img}" />
                <div class="product-info">      
                    <h4>${product.productName}</h4>
                </div>
                <div class="quantity">
                <span class="quantity-btn-decrease">-</span>
                <span class="quantity-input">${product.quantity}</span>
                <span class="quantity-btn-increase">+</span>
                </div> 
                <div class="price">${product.price * product.quantity} $</div>
                <div class="delete-product">❌</div> 
            </div>
            `;
            

            modalContainer.append(modalBody);

            const decrease = modalBody.querySelector(".quantity-btn-decrease");
            decrease.addEventListener("click", () => {
                if(product.quantity != 1) 
                    product.quantity--;
                    displayCartCounter();
                    displayCart();
                
            });

            const increase = modalBody.querySelector(".quantity-btn-increase");
            increase.addEventListener("click", () => {
                
                product.quantity++;
                displayCartCounter();
                displayCart();
            });

            // delete
            const deleteProduct = modalBody.querySelector(".delete-product");
            deleteProduct.addEventListener("click", () => {
                deleteCartProduct(product.id);
                
            });
        

        });

        // modal footer
        const total = cart.reduce((acu, item) => acu + item.price * item.quantity, 0);
        const modalFooter = document.createElement("div");
        modalFooter.className = "modal-footer";
        modalFooter.innerHTML = `
        <div class="total-price">Total $ ${total}</div>
        <button class="btn-primary" id="checkout-btn"> Go to pay </button>
        <div id="button-checkout"></div>
        `;

        modalContainer.append(modalFooter);

        // Mercadopago
        const mercadoPago = new MercadoPago("APP_USR-d75c24aa-a01c-4c80-9166-b4e19502a8e8", {
            locale: "es-AR",
        });

        const checkoutButton = modalFooter.querySelector("#checkout-btn");

        checkoutButton.addEventListener("click", function() {
            
            checkoutButton.remove();
            
            const orderData = {
                quantity : 1,
                description : "E-Shop Purchase",
                price: total
            };

            fetch("http://localhost:8080/create_preference", {
                method: "POST",
                headers: {
                    "Content-Type":"application/json",
                },
                body: JSON.stringify(orderData),
            })
                .then(function (response) {
                    return response.json();
                })
                .then(function (preference) {
                    createCheckoutButton(preference.id);
                })
                .catch(function(err) {
                    alert("Unexpected error " + err);
                });
        });

        function createCheckoutButton (preferenceId) {

            // Initialize the checkout
            const bricksBuilder = mercadoPago.bricks();

            const renderComponent = async (bricksBuilder) => {
                // if (window.checkoutButton) checkoutButton.unmmount();

                await bricksBuilder.create(
                    "wallet",
                    "button-checkout",
                    {
                        initialization: {
                            preferenceId: preferenceId,
                        },
                        callbacks: {
                            onError: (error) => error,
                            onReady: () => {},
                        },
                    }
                )
            };
            window.checkoutButton = renderComponent(bricksBuilder);
        };
    
    } else {
        const modalText = document.createElement("h2");
        modalText.className = "modal-body";
        modalText.innerHTML = "Your cart is empty.";
        modalContainer.append(modalText)
    }

};


cartBtn.addEventListener("click", displayCart);

const deleteCartProduct = (id) => {
    const index = cart.findIndex((element) => element.id === id);
    cart.splice(index,1);
    displayCart();
    displayCartCounter();
  } 

const displayCartCounter = () => {
    
    if (cart.length > 0) {
        const totalCart = cart.reduce((acu, item) => acu + item.quantity, 0);
        cartCounter.style.display = "block";
        cartCounter.innerText = totalCart;
    } else {
        cartCounter.style.display = "none";
    }
}
const shopContent = document.getElementById('shopContent');
const cart = [];

products.forEach((product) => {
    const content = document.createElement('div');
    content.innerHTML = `
    <img src="${product.img}">
    <h3>${product.productName}</h3>
    <p>$${product.price}</p>
    `;
    shopContent.appendChild(content);

    const buyButton = document.createElement("button");
    buyButton.innerText = "Buy";

    content.append(buyButton);

    buyButton.addEventListener("click", () => {

        const existingProduct = cart.find((cartProduct) => cartProduct.id === product.id);

        if (existingProduct) {
            existingProduct.quantity++; 
            displayCartCounter();
        } else {
            cart.push({
                id: product.id,
                productName: product.productName,
                price: product.price,
                quantity: 1, 
                img: product.img,
            });
            displayCartCounter();
        }   
    })
});

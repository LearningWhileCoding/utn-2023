class Customer extends Person{

    static customerCounter = 0;

    constructor(name, lastname, age, registrationDate ) {
        super(name, lastname, age);
        this._idCustomer = ++Customer.customerCounter;
        this._registrationDate = registrationDate;
    }

    get idCustomer() {
        return this._idCustomer;
    }

    get registrationDate() {
        return this._registrationDate;
    }

    set registrationDate(registrationDate) {
        this._registrationDate = registrationDate;
    }

    toString() {
        return super.toString() + ' ' + this.idCustomer + ' ' + this.registrationDate;
    }
}
class Person{

    static personCounter = 0;

    constructor(name, lastname, age) {
        this._idPerson = ++ Person.personCounter;
        this._name = name;
        this._lastname = lastname;
        this._age = age;
    }

    get idPerson() {
        return this._idPerson;
    }

    get name() {
        return this._name;
    }

    set name(name) {
        this._name = name;
    }

    get lastname() {
        return this._lastname;
    }

    set lastname(lastname) {
        this._lastname = lastname;
    }

    get age() {
        return this._age;
    }

    set age(age) {
        this._age = age;
    }

    toString() {
        return this._idPerson + ' ' + this._name + ' ' + this._lastname + ' ' + this._age;
    }

}

class Employee extends Person {

    static employeeCounter = 0;

    constructor (name, lastname, age, salary) {
        super(name, lastname, age);
        this._idEmployee = ++Employee.employeeCounter;
        this._salary = salary;
    }

    get idEmployee() {
        return this._idEmployee;
    }

    get salary() {
        return this._salary;
    }

    set salary(salary) {
        this._salary = salary;
    }

    toString() {
        return super.toString() + ' ' + this._idEmployee + ' ' + this._salary;
    }
}

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

// Person Testing 
let person1 = new Person('Daenerys', 'Targaryen', 28);
console.log(person1.toString());

let person2 = new Person('Jon', 'Snow', 28);
console.log(person2.toString());

// Employee Testing
let employee1 = new Employee('Arya', 'Stark', 32, 23000000);
console.log(employee1.toString());

let employee2 = new Employee('Sansa', 'Stark', 19, 157000000);
console.log(employee2.toString());

// Customer Testing
let customer1 = new Employee('Jaime', 'Lannister', 34, (new Date(2023,0,1)));
console.log(customer1.toString());

let customer2 = new Employee('Cersei', 'Lannister', 32, (new Date(2023,1,1)));
console.log(customer2.toString());
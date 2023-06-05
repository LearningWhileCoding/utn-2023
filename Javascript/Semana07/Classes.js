class Person{
    constructor(name, lastname){
        this._name = name;
        this._lastname = lastname
    }

    get name(){
        return this._name;
    }

    get lastname(){
        return this._lastname;
    }

    set name(name){
        this._name = name;
    }

    set lastname(lastname){
        this._lastname = lastname;
    }

    fullName(){
        return this._name + ' ' + this._lastname;
    }

    // Override of the 'toString' method to the 'Object' class
    toString(){ //Polymorphism
        return this.fullName();
    }
}

class Employee extends Person{
    
    constructor(name, lastname, department){
        super(name, lastname);
        this._department = department;
    }

    get department(){
        return this._department;
    }

    set department(department){
        this._department = department;
    }

    // Override
    fullName(){
        return super.fullName() + ', ' + this._department;
    }
}

let person1 = new Person('Daenerys', 'Targaryen');

let employee1 = new Employee('Jon', 'Snow', 'Militar');
console.log(employee1.fullName());

// Object.prototype.toString() Dynamic way of accessing fields and methods.
console.log(employee1.toString());
console.log(person1.toString());
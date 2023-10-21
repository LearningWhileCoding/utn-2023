// let person3 = new Person('Eddard', 'Stark'); Hoisting is not allowed here!

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
}

let person1 = new Person('Daenerys', 'Targaryen');
//console.log(person1);
console.log(person1.name);
person1.name = 'Arya';
console.log(person1.name);
person1.lastname = 'Stark'
console.log(person1.lastname);

let person2 = new Person('Arya', 'Stark');
//console.log(person2);
console.log(person2.name);
person2.name = 'Daenerys';
console.log(person2.name);
person2.lastname = 'Targaryen';
console.log(person2.lastname);

let employee1 = new Employee('Jon', 'Snow', 'Militar');
console.log(employee1);

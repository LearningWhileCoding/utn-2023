class Person{

    static personCounter = 0; // Static
    //email = 'email default value'; // Non static

    static get MAX_OBJ() { // this method simulate a constant.
        return 5;
    }

    constructor(name, lastname){
        this._name = name;
        this._lastname = lastname;
        if (Person.personCounter < Person.MAX_OBJ) {
        this.id_person = ++Person.personCounter;
        //console.log('The counter is increased: ' + Person.personCounter);
        } else {
            console.log('The maximum allowed number objects has been reached.');
        }
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
        return this.id_person + ' ' + this._name + ' ' + this._lastname;
    }

    // Override of the 'toString' method to the 'Object' class
    toString(){ //Polymorphism
        return this.fullName();
    }

    static toGreet(){
        console.log('Greetings from this statis method!');
    }

    static toGreet2(person){
        console.log(person.name + ' ' + person.lastname);
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

// person1.toGreet(); Only available from their own class.

Person.toGreet();
Person.toGreet2(person1);
Employee.toGreet();
Employee.toGreet2(employee1);

// console.log(person1.personCounter); Not accesible from here.

console.log(Person.personCounter);
console.log(Employee.personCounter);

console.log(person1.email);
console.log(employee1.email);
// console.log(Person.email); Not accesible from here.

console.log(person1.toString());
console.log(employee1.toString());
console.log(Person.personCounter);

let person3 = new Person('Samsa', 'Stark');
console.log(person3.toString());
console.log(Person.personCounter);

console.log(Person.MAX_OBJ);
//Person.MAX_OBJ = 10; Cant be modified or altered
console.log(Person.MAX_OBJ);

let person4 = new Person('Aria', 'Stark');
console.log(person4.toString());

let person5 = new Person('Tyrion', 'Lannister');
console.log(person5.toString());

let person6 = new Person('Jammie', 'Lannister');
console.log(person6.toString());
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
from logger_base import log
class Person:
    def __init__(self, id_person=None, name=None, lastname=None, email=None):
        self.id_person = id_person
        self._name = name
        self._lastname = lastname
        self._email = email

    def __str__(self):
        return f'''
        Person Id: {self.id_person}
        Name: {self._name}
        Lastname: {self._lastname}
        Email: {self._email}
    '''

    # Getters & Setters
    @property
    def id_person(self):
        return self.id_person

    @id_person.setter
    def id_person(self, person_id):
        self.id_person = person_id

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, name):
        self._name = name

    @property
    def lastname(self):
        return self._lastname

    @lastname.setter
    def lastname(self, lastname):
        self._lastname = lastname

    @property
    def email(self):
        return self._email

    @email.setter
    def email(self, email):
        self._email = email

if __name__ == '__main__':
    person1 = Person(1, 'Harry', 'Potter', 'hp@gmail.com')
    log.debug(person1)

    person2 = Person(name='Hermione', lastname='Granger', email='hgranger@gmail.com')
    log.debug(person2)

    person1 = Person(id_person=1)
    log.debug(person1)

from builtins import classmethod
from Connection import *
from Person import Person
from logger_base import log
from PoolCursor import PoolCursor

class PersonDao:
    _SELECT = 'SELECT * FROM person order BY id_person'
    _INSERT = 'INSERT INTO person(name, lastname, email) VALUES (%s, %s, %s)'
    _UPDATE = 'UPDATE person SET name=%s, lastname=%s, email=%s WHERE id_person=%s'
    _DELETE = 'DELETE FROM person WHERE id_person=%s'

    # Methods
    @classmethod
    def select(cls):
        # with Connection.getConnection():
        # with Connection.getCursor() as cursor:
         with PoolCursor() as cursor:
            cursor.execute(cls._SELECT)
            data = cursor.fetchall()

            people = []
            for d in data:
                person = Person(d[0], d[1], d[2], d[3])
                people.append(person)
            return people

    @classmethod
    def insert(cls, person):
       # with Connection.getConnection():
            with PoolCursor() as cursor:
                values = (person.name, person.lastname, person.email)
                cursor.execute(cls._INSERT, values)
                log.debug(f'Person added: {person}')
                return cursor.rowcount


    @classmethod
    def update(cls, person):
       # with Connection.getConnection():
            with PoolCursor() as cursor:
                values = (person.name, person.lastname, person.email, person.id_person)
                cursor.execute(cls._UPDATE, values)
                log.debug(f'Person updated: {person}')
                return cursor.rowcount

    @classmethod
    def delete(cls, person):
       # with Connection.getConnection():
            with PoolCursor() as cursor:
                values = (person.id_person, )
                cursor.execute(cls._DELETE, values)
                log.debug(f'Person deleted: {person}')
                return cursor.rowcount


if __name__=='__main__':

    # DELETE
    # person1 = Person(id_person=16)
    # deletedperson = PersonDao.delete(person1)
    # log.debug(f'Person deleted: {deletedperson}')

    # UPDATE
    # person3 = Person(16, name='Jerry', lastname='West', email='jwest@gmail.com')
    # updatedpeople = PersonDao.update(person3)
    # log.debug(f'Updated people: {updatedpeople}')

    # INSERT
    # person2 = Person(name='Wilt', lastname='Chamberlain', email='wchamberlain@gmail.com')
    # added_people = PersonDao.insert(person2)
    # log.debug(f'Person added: {added_people}')

    # SELECT
    people = PersonDao.select()
    for p in people:
        log.debug(p)


class PersonDao:
    _SELECT = 'SELECT * FROM person order BY id_person'
    _INSERT = 'INSERT * INTO person(name, lastname, email) VALUES (%s, %s, %s)'
    _UPDATE = 'UPDATE person SET name=%s, lastname=%s, email=%s WHERE id_person=%s'
    _DELETE = 'DELETE FROM person WHERE id_person=%s'
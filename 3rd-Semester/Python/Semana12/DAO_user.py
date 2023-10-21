from PoolCursor import PoolCursor
from User import User
from logger_base import log

class DAOuser:
    _SELECT = 'SELECT * FROM users ORDER BY id_user'
    _INSERT = 'INSERT INTO users(username, password) VALUES (%s, %s)'
    _UPDATE = 'UPDATE users SET username=%s, password=%s WHERE id_user=%s'
    _DELETE = 'DELETE FROM users WHERE id_user=%s'

    # Methods
    @classmethod
    def select(cls):
        # with Connection.getConnection():
        # with Connection.getCursor() as cursor:
        with PoolCursor() as cursor:
            cursor.execute(cls._SELECT)
            data = cursor.fetchall()

            users = []
            for d in data:
                user = User(d[0], d[1], d[2])
                users.append(user)
            return users

    @classmethod
    def insert(cls, user):
        with PoolCursor() as cursor:
            values = (user.username, user.password)
            cursor.execute(cls._INSERT, values)
            log.debug(f'User inserted: {user}')
            return cursor.rowcount

    @classmethod
    def update(cls, user):
        with PoolCursor() as cursor:
            values = (user.username, user.password, user.id_user)
            cursor.execute(cls._UPDATE, values)
            log.debug(f'User updated: {user}')
            return cursor.rowcount

    @classmethod
    def delete(cls, user):
        # with Connection.getConnection():
        with PoolCursor() as cursor:
            values = (user.id_user,)
            cursor.execute(cls._DELETE, values)
            log.debug(f'User deleted: {user}')
            return cursor.rowcount


if __name__ == '__main__':

    # DELETE
    # user = User(id_user=1)
    # deleteduser = DAOuser.delete(user)
    # log.debug(f'User deleted: {deleteduser}')

    # UPDATE
    # user = User(1, username='Bender', password=777)
    # updateduser = DAOuser.update(user)
    # log.debug(f'Updated user: {updateduser}')

    # INSERT
     user = User(username='Bender', password=777)
     added_user = DAOuser.insert(user)
     log.debug(f'User added: {added_user}')

    # SELECT
     users = DAOuser.select()
     for u in users:
        log.debug(u)

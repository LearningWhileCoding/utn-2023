from logger_base import log
from Connection import Connection

class PoolCursor:
    def __init__(self):
        self._connection = None
        self._cursor = None


    def __enter__(self):
        log.debug('Beginning of with method and __enter__')
        self._connection = Connection.getConnection()
        self._cursor = self._connection.cursor()
        return self._cursor

    def __exit__(self, exception_type, exception_value, exception_detail):
        log.debug('exit method executed.')
        if exception_value:
            self._connection.rollback()
            log.debug(f'There was an error: {exception_value}')
        else:
            self._connection.commit()
            log.debug('Commit de la transaccion')
        self._cursor.close()
        Connection.releaseConnection(self._connection)



if __name__ == '__main__':
    with PoolCursor() as cursor:
        log.debug('Inside of with')
        cursor.execute('SELECT * FROM person')
        log.debug(cursor.fetchall())
import psycopg2 as db
import sys
from logger_base import log
class Connection:
    _DATABASE = 'db_test'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin95'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _connection = None
    _cursor = None

    @classmethod
    def getConnection(cls):
        if cls._connection is None:
            try:
                cls._connection = db.connect(host=cls._HOST,
                                             user=cls._USERNAME,
                                             password=cls._PASSWORD,
                                             port=cls._DB_PORT,
                                             database=cls._DATABASE)
                log.debug(f'Succesfull connection: [{cls._connection}')
                return cls._connection
            except Exception as e:
                log.error(f'An error has occured: {e}')
                sys.exit()
        else:
            return cls._connection

    @classmethod
    def getCursor(cls):
        if cls._cursor is None:
            try:
                cls._cursor = cls.getConnection().cursor()
                log.debug(f'The cursor was successfully opened.')
                return cls._cursor
            except Exception as e:
                log.error(f'An error has occured:{e}')
                sys.exit()
        else:
            return cls._cursor
if __name__ == '__main__':
    Connection.getConnection()
    Connection.getCursor()
from psycopg2 import pool
import sys
from logger_base import log
class Connection:
    _DATABASE = 'users'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin95'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def getConnection(cls):
        connection = cls.getPool().getconn()
        log.debug(f'Connection obtained from the connection pool: {connection}')
        return connection

    @classmethod
    def getCursor(cls):
        pass

    @classmethod
    def getPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'Pool created successfully: {cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f'There was an error while getting the pool: {e}')
                sys.exit()
        else:
            return cls._pool

    @classmethod
    def releaseConnection(cls, conexion):
        cls.getPool().putconn(conexion)
        log.debug(f'Return of the pool connection.')

    @classmethod
    def closeConnections(cls):
        cls.getPool().closeall()

if __name__ == '__main__':
    connection01 = Connection.getConnection()
    connection02 = Connection.getConnection()
    connection03 = Connection.getConnection()
    connection04 = Connection.getConnection()
    connection05 = Connection.getConnection()
import psycopg2 as db

connection = db.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)

statement = 'INSERT INTO person(name, lastname, email) VALUES (%s, %s, %s)'
values = ('Bill', 'Rusell', 'brusell@gmail.com' )
try:
    connection.autocommit = False
    cursor = connection.cursor()
    cursor.execute(statement, values)
    print('Execution finished!')
    connection.commit()
except Exception as e:
    connection.rollback()
    print(f'There was an error! {e}')
finally:
    connection.close()
    print(connection)
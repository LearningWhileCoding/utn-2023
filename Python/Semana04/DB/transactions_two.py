import psycopg2 as db

connection = db.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)

statement = 'INSERT INTO person(name, lastname, email) VALUES (%s, %s, %s)'
values = ('Tim', 'Duncan', 'tduncan@gmail.com' )

statement2 = 'UPDATE person SET name=%s, lastname=%s, email=%s WHERE id_person=%s'
values2 = ('Larry', 'Bird', 'lbird@gmail.com', 10)
try:
    connection.autocommit = False
    cursor = connection.cursor()
    cursor.execute(statement, values)
    cursor.execute(statement2, values2)
    print('Execution finished!')
    connection.commit()
except Exception as e:
    connection.rollback()
    print(f'There was an error! {e}')
finally:
    connection.close()
    print(connection)
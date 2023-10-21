import psycopg2 as db

connection = db.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)

statement = 'INSERT INTO person(name, lastname, email) VALUES (%s, %s, %s)'
values = ('Wilt', 'Chamberlain', 'wc    hamberlain@gmail.com' )

statement2 = 'UPDATE person SET name=%s, lastname=%s, email=%s WHERE id_person=%s'
values2 = ('Hakeem', 'Olajuwon', 'holajuwon@gmail.com', 8)
try:
    with connection:
        with connection.cursor() as cursor:

            cursor.execute(statement, values)
            cursor.execute(statement2, values2)

except Exception as e:

    print(f'There was an error! {e}')
finally:
    connection.close()

print('Execution finished!')
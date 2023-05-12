import psycopg2

connection = psycopg2.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)
# print(connection)

query1 = 'SELECT * FROM person'
query2 = 'SELECT id_person, name FROM person'
query3 = 'SELECT * FROM person WHERE id_person = %s' # Placeholder
id_person = input('Enter an id: ')

try:
    with connection:
        with connection.cursor() as cursor:
            #cursor = connection.cursor()
            cursor.execute(query3, (id_person,))
            # data = cursor.fetchall()
            data = cursor.fetchone()
            print(data)
except Exception as e:
    print(f'There was an error! {e}')
finally:
    connection.close()
    print(connection)
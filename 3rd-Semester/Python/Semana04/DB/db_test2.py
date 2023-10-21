import psycopg2

connection = psycopg2.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)
# print(connection)

query1 = 'SELECT * FROM person WHERE id_person IN (1, 2)'
query2 = 'SELECT * FROM person WHERE id_person IN %s'
persons_id = input('Enter the IDs to search separated by a comma: ')
primaryKeys = (tuple(persons_id.split(', ')),)

try:
    with connection:
        with connection.cursor() as cursor:

            cursor.execute(query2, primaryKeys)
            data = cursor.fetchall()
            for d in data:
                print(d)
except Exception as e:
    print(f'There was an error! {e}')
finally:
    connection.close()

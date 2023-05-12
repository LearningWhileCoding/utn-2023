import psycopg2

connection = psycopg2.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)

query = 'DELETE FROM person WHERE id_person IN %s'
ids = input('Write the ids to delete separated by a comma: ').split(',')
values = (tuple(ids),)
try:
    with connection:
        with connection.cursor() as cursor:
            cursor.execute(query, values)
            total_updated = cursor.rowcount
            print(f'The deleted data are: {total_updated}')
except Exception as e:
    print(f'There was an error! {e}')
finally:
    connection.close()

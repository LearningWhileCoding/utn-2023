import psycopg2

connection = psycopg2.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)

query = 'UPDATE person SET name=%s, lastname=%s, email=%s WHERE id_person=%s'
values = (
            ('Moses', 'Malone', 'mmalone@gmail.com', 6),
            ('James', 'Harden', 'jharden@gmail.com', 7)
        )
try:
    with connection:
        with connection.cursor() as cursor:
            cursor.executemany(query, values)
            total_updated = cursor.rowcount
            print(f'The updated data are: {total_updated}')
except Exception as e:
    print(f'There was an error! {e}')
finally:
    connection.close()

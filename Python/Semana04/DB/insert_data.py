import psycopg2

connection = psycopg2.connect(
    user='postgres',
    password='admin95',
    host='127.0.0.1',
    port='5432',
    database='db_test'
)

query1 = 'INSERT INTO person (name, lastname, email)VALUES (%s, %s, %s)'
values = ('Yao', 'Ming', 'yming@gmail.com') 
try:
    with connection:
        with connection.cursor() as cursor:
            cursor.execute(query1, values)
            # connection.commit() --> Save data manually
            total_inserted = cursor.rowcount
            print(f'The inserted data are: {total_inserted}')
except Exception as e:
    print(f'There was an error! {e}')
finally:
    connection.close()

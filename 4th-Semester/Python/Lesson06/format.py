# string
name = 'Augusto'
age = 28
formatted_message = 'My name is %s and I am %d years old.' % (name, age)
print(formatted_message)

# tuple
persona =  ('Fry', 'Philip', 7000.00)
formatted_message = 'Hello %s %s. Your salary is  %.2f.'  # % persona
print(formatted_message % persona)

name= 'Homer'
age= 40
salary = 5000
# formatted_message = 'Name {} Age {} Salary {:.2f}'.format(name, age, salary)
# formatted_message = "Name {0} Age {1} Salary {2:.2f}".format(name, age, salary)
# print(formatted_message)
# formatted_message = 'Name {n} Age {e} Salary {s:.2f}'.format(n=name, e=age, s=salary)
# print(meformatted_messagensaje)

dictionary = {'name': 'Bart', 'age': 17,'salary':2500.00}
formatted_message = 'Name: {dic[name]} Age: {dic[age]} Salary: {dic[salary]:.2f}'.format(dic = dictionary)
print(formatted_message)

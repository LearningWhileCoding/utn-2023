# join() method

# Joining elements of a tuple with an empty string
string_tuple = ('Hello', 'World', 'Bachelor', 'University')
message = ''.join(string_tuple)
print(f'message: {message}')

# Joining elements of a set with a comma
course_set = {'Java', 'Python', 'Angular', 'Spring'}
message = ','.join(course_set)
print(f'message: {message}')

# Joining characters of a string with a period
input_string = 'HelloWorld'
message = '.'.join(input_string)
print(f'message: {message}')

# Joining keys and values of a dictionary with hyphens
dictionary = {'name': 'Fry', 'lastname': 'Philips', 'age': '30'}
keys_joined = '-'.join(dictionary.keys())
values_joined = '-'.join(dictionary.values())
print(f'Keys: {keys_joined}, Type: {type(keys_joined)}')
print(f'Values: {values_joined}, Type: {type(values_joined)}')

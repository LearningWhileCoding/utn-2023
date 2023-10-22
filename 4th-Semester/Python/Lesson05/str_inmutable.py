# capitalize() method
message1 = 'hello world'
message2 = message1.capitalize()

print(f'Message1: {message1}, id: {id(message1)}')
print(f'Message2: {message2}, id: {id(message2)}')

# Modifying the original string
message1 += ' Goodbye'
print(f'Message1: {message1}, id: {id(message1)}')

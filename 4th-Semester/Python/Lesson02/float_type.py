# float

a = 3.0
print(f'The value of a is {a:.2f} and its type is  {type(a)}')

# Constructor

b = float(10) #int
print(f'The value of b is {b:.2f} and its type is {type(b)}')

c = float('10.5') #str
print(f'The value of c is {c:.2f} and its type is {type(c)}')

# Exponential notation (positives n' negatives)

e = 3e8
print(f'The value of e is {e:.2f} and its type is {type(e)}')

e = 3e-5
print(f'The value of e is {e:.5f} and its type is {type(e)}')

# If there's a float the result will be always a float

e = 4.0 + 2
print(f'The value of e is {e:.2f} and its type is {type(e)}')


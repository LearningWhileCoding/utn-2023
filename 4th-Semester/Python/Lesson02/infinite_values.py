import math
from decimal import Decimal

positive_infinite = float('inf')
print(f'The value of positive_infinite is {positive_infinite} and its type is {type(positive_infinite)}')
print(f'is it an infinity?: {math.isinf(positive_infinite)}')

negative_infinite = float('-inf')
print(f'The value of negative_infinite is {negative_infinite} and its type is {type(negative_infinite)}')

print(f'is it an infinity?: {math.isinf(negative_infinite)}')

# math module
positive_infinite = math.inf
print(f'The value of positive_infinite is {positive_infinite} and its type is {type(positive_infinite)}')
print(f'is it an infinity?: {math.isinf(positive_infinite)}')

negative_infinite = -math.inf
print(f'The value of negative_infinite is {negative_infinite} and its type is {type(negative_infinite)}')
print(f'is it an infinity?: {math.isinf(negative_infinite)}')

# Decimal Class
positive_infinite = Decimal('Infinity')
print(f'The value of positive_infinite is {positive_infinite} and its type is {type(positive_infinite)}')
print(f'is it an infinity?: {math.isinf(positive_infinite)}')

negative_infinite = Decimal('-Infinity')
print(f'The value of negative_infinite is {negative_infinite} and its type is {type(negative_infinite)}')
print(f'is it an infinity?: {math.isinf(negative_infinite)}')
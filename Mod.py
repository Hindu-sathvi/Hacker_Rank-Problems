#https://www.hackerrank.com/challenges/python-mod-divmod/problem?isFullScreen=true
# Read input values
a = int(input())
b = int(input())

# Integer division
int_div = a // b
print(int_div)

# Modulo operation
mod = a % b
print(mod)

# Using divmod function
result = divmod(a, b)
print(result)

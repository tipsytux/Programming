import ast
from functools import reduce

# Using the Map function, create a list 'cube', which consists of the cube of numbers in input_list.
input_str = "[5,6,4,8,9]"
input_list = ast.literal_eval(input_str)
cube = list(map(lambda x: x**3, input_list))
print(cube)

# Using the function Map, count the number of words that start with ‘S’ in input_list.
input_str = "['San Jose', 'San Francisco', 'Santa Fe', 'Houston']"
input_list = ast.literal_eval(input_str)


def multi(x):
    if x.startswith('S'):
        return 1
    else:
        return 0


count = sum(map(multi, input_list))
print(count)

# Create a list ‘name’ consisting of the combination of the first name
# and the second name from list 1 and 2 respectively.
input_str = "[ ['Ankur','Avik','Kiran','Nitin'],['Narang','Sarkar','R','Sareen']]"
input_list = ast.literal_eval(input_str)
first_name = input_list[0]
last_name = input_list[1]
name = list(map(lambda x,y: x + " " + y , first_name, last_name))
print(name)

# Extract a list of numbers that are multiples of 5 from a list of integers named input_list.
input_str = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, " \
            "18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34," \
            " 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]"
input_list = ast.literal_eval(input_str)
list_answer = list(filter(lambda x: x % 5 == 0, input_list))
print(list_answer)

# Extract a list of names that start with an ‘s’ and end with a ‘p’ (both 's' and 'p' are lowercase) in input_list.
input_str = "['soap','sharp','shy','silent','ship','summer','sheep']"
input_list = ast.literal_eval(input_str)
sp = list(filter(lambda x:x.startswith("s") and x.endswith("p"), input_list))
print(sp)

# If input_list = ['I','Love','Python'], the output should be the string 'I Love Python'.
input_str = "['All','you','have','to','fear','is','fear','itself']"
input_list = ast.literal_eval(input_str)
answer = reduce(lambda x, y: x + " " + y, input_list)
print(answer)

# You are given a list of numbers such as input_list = [31, 63, 76, 89].
# Find and print the largest number in input_list using the reduce() function.
input_str = "[65,76,87,23,12,90,99]"
input_list = ast.literal_eval(input_str)


def compare(x,y):
    if x > y:
        return x
    else:
        return y


answer = reduce(compare, input_list)
print(answer)

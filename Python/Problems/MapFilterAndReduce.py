import ast,sys
input_str = "[5,6,4,8,9]"
input_list = ast.literal_eval(input_str)


#Write your code here
cube=list(map(lambda x: x**3, input_list))
print(cube)


input_str = "['San Jose', 'San Francisco', 'Santa Fe', 'Houston']"
input_list = ast.literal_eval(input_str)
def multi(x):
    if x.startswith('S'):
        return 1
    else:
        return 0
count = sum(map(multi, input_list))

print(count)
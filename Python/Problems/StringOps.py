# Description
# In a certain encrypted message which has information about the location(area, city), the characters are jumbled such that first character of the first word is followed by the first character of the second word, then it is followed by second character of the first word and so on
# In other words, let’s say the location is bandra,mumbai
# The encrypted message says ‘bmaunmdbraai’.
# Sample Input:
# bmaunmdbraai
# Sample Output:
# bandra,mumbai
# Let’s say the size or length of the two words wouldn’t match then the smaller word is appended with # and then encrypted in the above format.
# With this in mind write a code to identify the right location and print it as place,city.
# Execution Time Limit
# 10 seconds

import ast,sys
input_str = input()
#Type your code here
message1=""
message2=""
for i in range(len(input_str)):
    if i%2 == 0:
        message1 = message1 + input_str[i]
    else:
        message2 = message2 + input_str[i]
message1.strip().strip("#")
message2.strip().strip("#")
print(f"{message1},{message2}")
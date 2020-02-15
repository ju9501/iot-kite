# list 선언

list_a =[1,2,1,2,2,2,2,2,2,3,4,5,6,3,3]
value = 2

print('-----value=2를 하나씩 지움-----')
while value in list_a:
    list_a.remove(value)
    print(list_a)


print('-----value=2를 모두 지움-----')
print(list_a)
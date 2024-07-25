from random import randint
n=(randint(0,10),randint(0,10),randint(0,10),randint(0,10),randint(0,10))
for cont in n:
    print(cont)

print("O maior valor sorteado foi: {}".format(max(n)))
print("O menor valor sorteado foi: {}".format(min(n)))
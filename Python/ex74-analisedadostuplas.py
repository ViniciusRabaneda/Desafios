n=(int(input("Digite o 1 valor:")),int(input("Digite o 1 valor:")),int(input("Digite o 1 valor:")),int(input("Digite o 1 valor:")))
print("VocÊ digitou os valores {}".format(n))
print("O numero 9 apareceu {}".format(n.count(9)))
if 3 in n:
    print("O valor 3 apareceu na {} posição".format(n.index(3)+1))
else:
    print("O valor 3 nao esta na tupla")
print("Os valores pares digitados foram:")
for cont in n:
    if cont %2==0:
        print(cont)
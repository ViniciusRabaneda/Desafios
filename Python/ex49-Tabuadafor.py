n=int(input("Digite o valor da tabuada desejada!:\n"))
for cont in range(1,11):
    tabuada=n*cont
    print("{} X {} = {}".format(n,cont,tabuada))

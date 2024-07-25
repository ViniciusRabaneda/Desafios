cont=0
while True:
    n=int(input("Digite o valor da tabuada desejada ou algum numero negativo para sair:\n"))
    if n<0:
        break
    else:
        for cont in range(0,11):
            tabuada= cont* n
            print("{} X {} = {}".format(n,cont,tabuada))
print("FIMM")
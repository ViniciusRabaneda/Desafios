n1=int(input("Digite o valor inicial da PA:\n"))
r=int(input("Digite a razão da sua PA:\n"))
cont=1
pa=n1
while cont<=10:
    print(pa,end="->")
    pa=pa+r
    cont+=1
print("FIM")


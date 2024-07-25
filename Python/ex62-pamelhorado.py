n1=int(input("Digite o valor inicial da PA:\n"))
r=int(input("Digite a razão da sua PA:\n"))
cont=1
pa=n1
m=10
f=0
while m !=0:
    f=f+m
    while cont<=f:
        print(pa,end="->")
        pa=pa+r
        cont+=1
    print("FIM!")
    m=int(input("Quantos termos a mais você deseja mostrar?"))
print("Fim")


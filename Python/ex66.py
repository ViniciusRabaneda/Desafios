cont=soma=0
while True:
    n=float(input("Digite um valor sendo 999 para parar:\n"))
    if n==999:
        break
    else:
        cont=cont+1
        soma = soma + n
print("Tiveram {} valor e a soma deles foi de {}".format(cont,soma))
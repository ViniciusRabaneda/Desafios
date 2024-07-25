decisao="S"
maior = menor = cont= soma= 0
while decisao !="N":
    n=float(input("Digite um numero:\n"))
    decisao = str(input("Deseja continuar?\n")).upper()
    cont=cont+1
    soma=soma+n
    if n > maior:
        maior=n
    else:
        menor=n
if cont==1:
    print("A media dos valores é {} e o maior valor é o mesmo que o menor valor, {}".format(soma/cont,maior))
else:
    print("A media dos valores é {} o menor valor é {} e o maior valor é {}".format(soma/cont,menor,maior))


n=int(input("Digite um valor ou digite 999 para parar:\n"))
qtd=0
soma=0
while n != 999:
    qtd=qtd+1
    soma=soma+n
    n=int(input("Digite um valor ou digite 999 para parar!\n"))
print ("Você digitou {} números e a soma deles foi de {}".format(qtd,soma))

from random import randint
r=randint(0,10)
print("Tente advinhar qual numero entre 0 e 10 eu pensei\n")
n=int(input("Digite um numero entre 0 a 10\n"))
acertou=False
tentativa=1
while n<0 or n>=11:
    n=int(input("Numero invalido, digite novamente\n".format(n)))
while not acertou:
    if n > r:
        n=int(input("Menos, tente novamente\n"))
        tentativa+=1
    if n <r :
        n=int(input("Mais, tente novamente\n"))
        tentativa += 1
    elif n == r:
        print("Parabens você acertou!! Foram necessárias {} tentativas\n".format(tentativa))
        acertou=True
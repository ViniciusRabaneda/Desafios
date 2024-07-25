tot=0
n=int(input("Digite um numero para saber se ele é primo\n"))
for cont in range (1,n+1):
    if n % cont== 0:
        print("\033[33m",cont)
        tot+=1
    else:
        print("\033[31m",cont)
if tot>2:
    print("O numero {} foi dividido {} vezes e por isso ele NÃO É PRIMO".format(n,tot))
else:
    print("O numero {} foi dividido {} vezes e por isso ele É PRIMO".format(n,tot))
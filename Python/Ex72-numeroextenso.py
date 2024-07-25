cont= ("Zero","um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Onze","Doze","Treze","Quatorze","Quinze","Dezesseis","Dezessee","Dezoito","Dezenove","Vinte")
while True:
    n = int(input("Digite um numero para ve-lo em extenso:\n "))
    if n>20 or n <0:
        print("Tente novamente\n")
    else:
        break
print("Voce digitou {}".format(cont[n]))

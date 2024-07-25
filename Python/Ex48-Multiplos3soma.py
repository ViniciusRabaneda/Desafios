cont=0
soma=0
for a in range(1,501,2):
    if a % 3==0:
        print(a,end="-> ")
        soma=soma+a
        cont=cont+1
print("O total de numeros impares divisiveis por 3 no interval de 1 a 500 é {} e a soma destes números é {}".format(cont,soma))

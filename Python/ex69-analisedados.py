cont=0
conf=0
conm=0
while True:
    sexo = " "
    decisao = " "
    idade=int(input("Digite a idade da pessoa:\n"))
    if idade>=18:
        cont+=1
    while sexo not in "F/M":
        sexo = str(input("Digite o sexo da pessoa [M/F]:\n")).upper()
    if sexo =="M":
        conm+=1
    else:
        conf+=1
    while decisao not in "S/N":
        decisao=str(input("Deseja continuar? [S/N]")).upper()
    if decisao == "N":
        break
print(" Foram cadastradas {} com mais de 18 , {} homens, {} mulheres".format(cont,conm,conf))
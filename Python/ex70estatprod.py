print("="*30)
print("LOJA SUPER BARATAO")
print("="*30)
total=cont=maior=menor=0
while True:
    decisao=" "
    produto=str(input("Digite o nome do produto\n"))
    preco=float(input("Digite o valor do produto\n"))
    if cont==0:
        maior=preco
        menor=preco
        cont=cont+1
    else:
        if preco>maior:
            maior=preco
        else:
            menor=preco
            cont=cont+1
    total+=preco
    while decisao not in "SN":
        decisao = str(input("Deseja continuar? [S/N]:\n")).upper()
    if decisao == "N":
            print("Você comprou {} Produtos".format(cont))
            print("Você Gastou {}".format(total))
            print("O maior valor gasto {}".format(maior))
            print("O menor valor gasto foi {}".format(menor))
            break
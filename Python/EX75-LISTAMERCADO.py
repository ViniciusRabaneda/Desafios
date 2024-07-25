lista=("Lapis",1.75,"Borracha",2,"Caderno",15.3,"Estojo",25,"Transferidor",9.99,"Compasso",3.43,"Mochila",120.32,"Caneta",3.4,"Livro",35)
for cont in range(0,len(lista)):
    if cont %2==0:
        print(f"{lista[cont]:.<30}",end="")
    else:
        print(f"R${lista[cont]:>7.2f}")
#se usar for cont in lista mostra o valor guardado(ex:lapis), se usar cont mostra numero

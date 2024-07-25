print("="*30)
print("BEM-VINDO AO CAIXA 10")
print("="*30)

valor=float(input("Digite o numero de celulas a serem sacadas:\n"))
 if valor%100==0:
    n100=valor/100
    valor=valor-(n100*valor)
elif valor % 50==0:
    n50 = valor / 50
    valor = valor - (n50 * valor)
elif valor % 20==0:
    n20 = valor / 20
    valor = valor - (n20 * valor)
elif valor % 10==0:
    n10 = valor / 10
    valor = valor - (n10 * valor)
elif valor % 5==0:
    n20 = valor / 5
    valor = valor - (n20 * valor)

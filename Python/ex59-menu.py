n1=int(input("Digite o primeiro valor:\n"))
n2=int(input("Digite o segundo valor:\n"))
d=0
while d != 5:
    d = int(input("""
          [1] Somar
          [2] Multiplicar
          [3] Maior
          [4] Novos Numeros
          [5] Sair\n"""))
    if d== 1:
        soma=n1+n2
        print("A soma de {} + {} é {}".format(n1,n2,soma))
    elif d==2:
        multiplicar=n1*n2
        print("A soma de {} X {} é {}".format(n1, n2, multiplicar))
    elif d==3:
        if n1>n2:
            print("O maior numero é: ",n1)
        else:
            print("O maior numero é: ", n2)
    elif d==4:
        n1 = int(input("Digite o primeiro valor:\n"))
        n2 = int(input("Digite o segundo valor:\n"))
    elif d==5:
        print("Fim")
    else:
        print("Opção inválida")
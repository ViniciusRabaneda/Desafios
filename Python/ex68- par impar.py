from random import randint
while True:
    n=int(input("Digite um valor:\n"))
    computador = randint(0, 10)
    resultado = n + computador
    escolha = " "
    while escolha not in "PI":
        escolha=str(input("VocÊ quer par ou impar [P/I]?\n")).upper()
    if resultado % 2 == 0:
        if escolha == "P":
            print("Você jogou {} e o computador jogou {} = {}\nParabens Você ganhou!\nVamos jogar novamente!!".format(n,computador,resultado))
        elif escolha == "I":
            print("Você jogou {} e o computador jogou {} = {}\nVocê perdeu".format(n, computador, resultado))
            break
    elif resultado % 2 != 0:
        if escolha == "P":
            print("Você jogou {} e o computador jogou {} = {}\nVocê perdeu".format(n,computador,resultado))
            break
        elif escolha =="I":
            print("Você jogou {} e o computador jogou {} = {}\nParabens Você ganhou!\nVamos jogar novamente!!".format(n,computador,resultado))



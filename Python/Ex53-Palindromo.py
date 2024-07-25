frase=str(input("Digite uma frase para saber se é palindromo!\n")).strip().upper()
palavra=frase.split()
junto="".join(palavra)
inverso="" #vazio funciona como 0 quando é numero
for letra in range(len(junto)-1,-1,-1): #range nao considera o ultimo numero -> EX: Astro tem 5 letras mas como leg ve caracteres contando o 0, a ultima letra seria 4 [A=0,S=1,T=2,R=3,0+4]
    inverso+=junto[letra]
if inverso==junto:
    print("Temos um palindromo")
else:
    print("Não temos um palindromo")
casa=float(input("Digite o valor do empréstimo!:\n"))
salario=float(input("Digite o valor do seu salário!:\n"))
parcela=float(input("Digite o número de parcelas!:\n"))
prestacao=casa/parcela
minimo=salario*0.3
if prestacao>minimo:
    print("Emprestimo negado ")
else:
    print("Emprestimo concedido meu chapa (:")

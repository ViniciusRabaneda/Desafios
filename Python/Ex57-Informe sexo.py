s=str(input("Digite o sexo [M/F]:\n")).strip().upper()[0]
while s not in "MmFf":
    s=str(input("Dado incorreto, digite o sexo novamente:\n")).strip().upper()[0]
print("Sexo {} registrado com sucesso!".format(s))
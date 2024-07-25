sexom = 0 #Numero de pessoas do sexo masculino
sexof = 0 #Numero de pessoas do sexo feminino
mediaf=0  #Media das notas do público feminino
mediam=0 # Media das notas do público masculino
totalunos=0 #Total de alunos independente do sexo
apm=0 #Mulheres aprovadas
rpm=0 #Mulheres Reprovadas
rcm=0 #Mulheres Recuperação
aph=0 #Homens Aprovados
rph=0 #Homens Reprovados
rch=0 #Homens Recuperação
while True: #Enquanto for verdade -- uso do break para interromper
    nome=str(input("Digite o nome do Aluno(A):\n"))
    while nome.isalpha()==False: # Aceita apenas letras
        nome=str(input("Formato Inválido, digite apenas letras!!\n"))
    sexo=str(input("Digite o Sex o do aluno(a) [M/F]:\n"))
    sexo=sexo.upper()
    while sexo!="M" and sexo!="F": # Verifica se o caracter é diferente de m ou f
        sexo=str(input("Caracter Inválido, tente outra vez!:\n"))
        sexo=sexo.upper()
    n1= float(input("A primeira nota do Aluno:\n"))
    while (n1>10 or n1<0): # Garante que n1 esta entre 0 e 10
        n1=float(input("NOTA INVÁLIDA| Digite o valor novamente:\n"))
    n2= float(input("A segunda nota do Aluno:\n"))
    while (n2 > 10 or n2 < 0): # Garante que n2 esta entre 0 e 10
        n2 = float(input("NOTA INVÁLIDA| Digite o valor novamente:\n"))
    n3= float(input("A terceira nota do Aluno:\n"))
    while (n3 > 10 or n3 < 0): # Garante que n3 esta entre 0 e 10
        n3 = float(input("NOTA INVÁLIDA| Digite o valor novamente:\n"))
    media=(n1+n2+n3)/3
    print("===========================================")
    if sexo=="F" and (media>=7):
        print("O nome do(a) aluno(a) é: {} \n O Sexo é: Feminino \n STATUS: APROVADO pois a média foi {}".format(nome,media))
        sexof=sexof+1
        mediaf=(mediaf+media)/ sexof
        apm=apm+1
    elif sexo=="F" and (media<=4):
        print("O nome do(a) aluno(a) é: {} \n O Sexo é: Feminino \n STATUS: REPROVADO pois a média foi {}".format(nome,media))
        sexof = sexof + 1
        mediaf = (mediaf + media) / sexof
        rpm = rpm + 1
    elif sexo=="F" and (media<=7 and media>=4):
        print("O nome do(a) aluno(a) é: {} \n O Sexo é: Feminino \n STATUS: EXAME pois a média foi {}".format(nome,media))
        sexof = sexof + 1
        mediaf = (mediaf + media) / sexof
        rcm = rcm + 1
    elif sexo == "M" and (media <= 4):
        print("O nome do(a) aluno(a) é: {} \n O Sexo é: Masculino \n STATUS: REPROVADO pois a média foi {}".format(nome,media))
        sexom = sexom + 1
        mediam = (mediam + media) / sexom
        aph = aph + 1
    elif sexo == "M" and (media <= 7 and media >= 4):
        print("O nome do(a) aluno(a) é: {} \n O Sexo é: Masculino \n STATUS: EXAME pois a média foi {}".format(nome,media))
        sexom = sexom + 1
        mediam = (mediam + media) / sexom
        rch = rch + 1
    else:
        print("O nome do(a) aluno(a) é: {} \n O Sexo é: Masculino \n STATUS: APROVADO pois a média foi {}".format(nome,media))
        sexom = sexom + 1
        mediam = (mediam + media) / sexom
        rph = rph + 1
    totalunos= sexom + sexof
    totalaprovados=aph+apm
    totalreprovados=rpm+rph
    totalrecuperacao=rcm+rch
    print("===========================================")
    decisao=str(input("Deseja adicionar um aluno? [S/N]\n"))
    decisao=decisao.upper() #Evita erro por caracter ser maiusculo ou minusculo, transformando tudo em CAPS LOCK
    while decisao !="N" and decisao!="S": #Permite somente S ou N paraa dar continuidade
        decisao=str(input("Comando Inválido, tente novamente\n"))
        decisao=decisao.upper() #Evita erro por caracter ser maiusculo ou minusculo, transformando tudo em CAPS LOCK
    if decisao=="N": #Quando o usuário decide encerrar o processo, ele apresenta os dados e utiliza o pause para interromper o While=true
        print("O numero de \033[1;37m alunos\033[m lançados no sistema foi",totalunos)
        print("O numero de \033[1;35m mulheres\033[m foram",sexof) #Codigo ANSI, sintaxe abre= \033[estilo,cor,fundom fecha com \033[m
        print("O numero de \033[1;34m homens\033[m foram",sexom)
        print("O Total de pessoas \033[1;32maprovadas\033[m foram: {} sendo {} homens e {} Mulheres".format(totalaprovados,aph,apm))
        print("O Total de pessoas \033[1;31m reprovadas\033[m foram: {} sendo {} homens e {} Mulheres".format(totalreprovados, rph, rpm))
        print("O Total de pessoas de \033[1;33mexame\033[m foram: {} sendo {} homens e {} Mulheres".format(totalrecuperacao, rch, rcm))
        print("Quantidade porcentual de alunos \033[1;32maprovados\033[m: {:.2f}%".format((totalaprovados/totalunos)*100))
        print("Quantidade porcentual de alunos \033[1;31mreprovados\033[m: {:.2f} %".format((totalreprovados /totalunos)*100))
        print("Quantidade porcentual de alunos em \033[1;33mexame\033[m: {:.2f} %".format((totalrecuperacao / totalunos)*100))
        print("A Media geral das notas \033[1;34m Masculinas\033[m foi:{:.2f}".format(mediam))
        print("A Media geral das notas \033[1;35m Femininas\033[m foi:{:.2f}".format(mediaf))
        break #interrompe laço While
    else:
       continue #Garante que a condição do While continue verdadeira e volta para o início
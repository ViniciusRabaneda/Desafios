n=int(input("Digite o primeiro termo da PA!\n"))
r=int(input("Digite a razão da pa\n"))
decimo=n+(10-1)*r
for cont in range(n,decimo+r,r):
    print(cont)
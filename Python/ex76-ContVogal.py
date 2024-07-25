lista=("Lucas","Ana","Luisa","Jane")
for p in lista:
    print("\nNa palavra {} temos".format(p),end=" ")
    for letra in p:
        if letra.lower() in "aeiou":
            print(letra,end=" ")

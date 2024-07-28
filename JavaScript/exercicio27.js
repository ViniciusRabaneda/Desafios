/*
Construa uma função que receba como parâmetros as alturas e as taxas de crescimento anuais de duas
crianças e calcule se existe uma criança menor, caso exista se a criança menor ultrapassará a maior e em
quantos anos isso acontecerá. Utilize centímetros para as unidades de medida.
*/

function crescimento(a1,tx1,a2,tx2){
    let tempo = 0;
// altura do 1 menor que a do segundo e taxa do 1 maior que a do segundo
    if(a1<a2 && tx1>tx2){
        while((a1) < (a2)){
            tempo++;  
            a1 += (a1*tx1);
            a2 += (a2*tx2);
        }
        console.log(`O primeiro usuário é menor que o segundo usuário e passará sua altura em ${tempo} anos`);
    }else if(a1<a2 && tx1<tx2){
        // altura do 1 menor que a do seugndo e taxa de crescimento menor que a do segundo
        console.log(`O primeiro usuário é menor que o segundo usuário e nunca passará sua altura`);
    }else if(a2<a1 && tx2>tx1){
        // altura do segundo menor que a do primeiro e taxa do segundo maior que a do primeiro
        while((a2) < (a1)){
            tempo++;
            a1 += (a1*tx1);
            a2 += (a2*tx2); 
        }
        console.log(`O segundo usuário é menor que o primeiro usuário e passará sua altura em ${tempo} anos`);
    }else if(a2<a1 && tx2<tx1){
        // altura do segundo menor que o primeiro e taxa do 2 menor que a taxa do primeiro
        console.log(`O segundo usuário é menor que o primeiro usuário e nunca passará sua altura`);
    }
}

crescimento(100,1.0,50,4.0);


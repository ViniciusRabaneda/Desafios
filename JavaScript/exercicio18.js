/*
Faça um programa que leia um número entre 0 e 10, e escreva este número por extenso. Use o comando 
switch. Crie um case default que escreva ‘Número fora do intervalo.’
*/

function porExtenso(num){
    switch(num){
        case 1:
            return console.log("UM");
        case 2:
            return console.log("DOIS");
        case 3:
            return console.log("TRÊS");
        case 4:
            return console.log("QUATRO");
        case 5:
            return console.log("CINCO");
        case 6:
            return console.log("SEIS");
        case 7:
            return console.log("SETE");
        case 8:
            return console.log("OITO");
        case 9:
            return console.log("NOVE");
        case 10:
            return console.log("DEZ");
        default:
        return console.log("NÚMERO INVÁLIDO!");            
    }
}
porExtenso(1);
porExtenso(2);
porExtenso(3);
porExtenso(4);
porExtenso(5);
porExtenso(6);
porExtenso(7);
porExtenso(8);
porExtenso(9);
porExtenso(10);

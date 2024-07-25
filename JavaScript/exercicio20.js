/*
​ Crie um programa para informar quais e quantas notas são necessárias para entregar o mínimo de cédulas 
para um determinado valor informado pelo usuário considerando notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. 
Seu programa deve mostrar apenas as notas utilizadas. Por exemplo, ao solicitar R$18, o programa deve 
informar apenas a seguinte informação (note que não foram exibidas informações sobre as demais cédulas): 1 
nota(s) de R$ 10. 1 nota(s) de R$ 5. 3 nota(s) de R$ 1. 
*/

function caixaEletronico(valor){
    let notas100 = 0;
    let notas50 = 0;
    let notas10 = 0;
    let notas5 =0;
    let notas1 =0;
    while(valor/100 >=1){
        notas100++
        valor -= 100;
    }
    while(valor/50 >=1){
        notas50++
        valor -= 50;
    }
    while(valor/10 >=1){
        notas10++
        valor -= 10;
    }
    while(valor/5 >=1){
        notas5++
        valor -= 5;
    }
    while(valor/1 >=1){
        notas1++
        valor -= 1;
    }
return console.log(`Foram impressos:
${notas100} notas de 100
${notas50} notas de 50
${notas10} notas de 10
${notas5} notas de 5
${notas1} notas de 1
`)
}
caixaEletronico(153)
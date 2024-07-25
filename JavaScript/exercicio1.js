/*
 Crie uma função que dado dois valores (passados como parâmetros) mostre no console a soma, subtração,
multiplicação e divisão desses valores.
*/
const operacao = (a,b)=>{
    let soma = a+b;
    let subtracao = a-b;
    let multiplicacao = a*b;
    let divisao = a/b
    return console.log([soma,subtracao,multiplicacao,divisao])
}

operacao(10,5);
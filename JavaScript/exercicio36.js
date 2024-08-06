/* Crie duas funções que recebem dois parâmetros, um vetor com apenas valores numéricos e um número
inteiro. Faça com que a primeira função retorne outro vetor que será resultado da multiplicação de cada
elemento pelo número passado como parâmetro. A segunda função fará o mesmo da primeira se e somente se
o valor do elemento for maior que 5. */

vetor = [2,4,6,8,10]

function funcao1(vetor, valorInteiro){
    let vetorFinal = vetor.map((valor)=> valor*valorInteiro)
    return vetorFinal
}

function funcao2(vetor, valorInteiro){
    if(valorInteiro>5){
        let vetorFinal = vetor.map((valor)=> valor*valorInteiro)
        return vetorFinal
    }else{
        return vetor
    }
}

console.log(funcao1(vetor,5))
console.log(funcao2(vetor,5))
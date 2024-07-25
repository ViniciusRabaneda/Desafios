/*
Escreva um algoritmo que leia o código de um aluno e suas três notas. Calcule a média ponderada do
aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do
aluno, suas três notas, a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 e
"REPROVADO" se a média for menor que 5. Repita a operação até que o código lido seja negativo.
*/

function calculaMedia(cod,n1,n2,n3){
    let media = ((n1*4)+(n2*3)+(n3*3))/10;
    if (media >=5){
        console.log(`O aluno de código ${cod} esta APROVADO! `)
    }else{
        console.log(`O aluno de código ${cod} esta REPROVADO! `)
    }
    
}

calculaMedia(2321,5,3,7)
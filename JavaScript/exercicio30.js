/*
Escreva um algoritmo que percorre um vetor de inteiros e defina o maior e menor valor dentro do vetor.
*/

let numeros = [1, 2, 3, 4, 3, 2, 1];
let numeros2 = [1,1,1,1,1]

function maiorMenor(vetor) {
    let menor = 0;
    let maior = 0;
    vetor.forEach(valor => {
        maior, menor = valor;
        if (valor > maior) {
            maior = valor;
        } else if (valor < menor) {
            menor = valor;
        }
    })
    if (maior == menor) {
        console.log(`O valor do maior número e do menor múmero é o mesmo`)
    } else {
        console.log(`O maior valor é ${maior} e o menor valor é ${menor}`)
    }
}

maiorMenor(numeros);
maiorMenor(numeros2);

function teste(vetor){
    for (elemento in vetor){
        console.log(elemento)
    }
}
teste(numeros)
/*
Ler um vetor de números inteiros e imprimir quantos são pares e quantos são ímpares.
*/

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function vetorPar(vetor) {
    for (elemento of vetor) {
        if (elemento % 2 == 0) {
            console.log(elemento);
        }
    }
}
vetorPar(numeros);

function vetorPares(vetor) {
    vetor.forEach(elemento => {
        if (elemento % 2 == 0) {
            console.log(elemento);
        }
    })
}

vetorPares(numeros);

/* Algoritmo que recebe um vetor de 5 posições e apresenta o mesmo na ordem inversa */
let vetor =[1,2,3,4,5];
let aux;
function trocaValores(vetor){
    for(i=0;i<= Math.floor(vetor.length / 2);i++){
        aux = vetor[i];
        vetor[i] = vetor[vetor.length - 1 - i];
        vetor[vetor.length - 1 - i] = aux;
        }

    return vetor
}

console.log(trocaValores(vetor))
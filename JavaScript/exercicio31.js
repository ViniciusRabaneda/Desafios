/*  Escrever um algoritmo que percorre um vetor de inteiros, conta quantos números negativos há nesse vetor
e imprime a quantidade no console. */


let array = [2,-4,-5,3,4,1,2,-9]
let contador = 0;
function arrayNegativo(array){
    for (valor of array){
        if(valor < 0){
            contador++;
        }
    }
    console.log(`Existem ${contador} valores negativos no array`);
}

arrayNegativo(array);
/* Crie um array que receba um array e retorne o primeiro e o último elemento do array:  */
let array = [1,2,3,4,5]

function retorno(array){
    let arrayRetorno = [];
    let tamanho = array.length;
    arrayRetorno.push(array[0]);
    arrayRetorno.push(array[tamanho-1]);
    return arrayRetorno
}

console.log(retorno(array));
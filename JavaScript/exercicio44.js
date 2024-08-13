/* Crie uma função que receba um array de elementos e retorne um array somente com os números presentes no
array recebido como parâmetro. */

let arrayTeste = [1,2,3,false,"cachorro",6]

function apenasNumeros(array){
    let arrayNumerico=[];
    for (elemento of array){
        if (typeof elemento ==='number'){
            arrayNumerico.push(elemento);
        }
    }
    return arrayNumerico
}

console.log(apenasNumeros(arrayTeste));

// outra forma

function filtrarNumeros(array) {
return array.filter(item => typeof item === "number")
}

console.log(filtrarNumeros(arrayTeste));
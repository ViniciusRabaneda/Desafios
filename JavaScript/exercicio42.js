/* Crie uma função que receba dois parâmetros. O primeiro elemento que repetirá, enquanto
que o segundo será o número de vezes que haverá repetição. Um array será retornado */

function repeticao(valor, repeticao){
    let array = [];
    for(i=0;i<repeticao;i++){
        array.push(valor);
    }
    return array;
}

console.log(repeticao("Olá",4))
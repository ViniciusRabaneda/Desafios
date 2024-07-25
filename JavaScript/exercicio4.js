/* Crie uma função que irá receber dois valores, o dividendo e o divisor. A função deverá imprimir o resultado
e o resto da divisão destes dois valores.*/

function resto (dividendo, divisor){
    let inteiro = Math.floor(dividendo/ divisor);
    let resto = dividendo % divisor;
    return console.log(`Resultado: ${inteiro} 
Resto: ${resto}`);
}

resto(11,2);
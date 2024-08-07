/* 38) Escreva uma função que receba dois parâmetros início e fim. Essa função deve imprimir todos os números
ímpares que estão entre esses valores. Por padrão os valores devem ser 0 para início e 100 para fim. Atente
para corrigir a ordem dos parâmetros caso a função receba o valor maior antes do menor. */

function incioFim(inicio,fim){
    let numeros = []
    for(i=inicio;i<=100;i++){
        if(i%2!=0){
            numeros.push(i);
        }
    }
    return numeros
}

incioFim(0,100).forEach((item)=>console.log(item));
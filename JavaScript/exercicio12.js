/*
Faça um algoritmo que calcule o fatorial de um número.
*/

function fatorial(n1) {
    let fatorial = 0;
    for (let i = n1; i >= 1; i--) {
        fatorial += i * 1
    }
    return console.log(`${n1} fatorial equivale a ${fatorial}`);
}

fatorial(5)
fatorial(10)
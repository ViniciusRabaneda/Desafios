/*
​Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado o número referente ao 
dia. Considere que domingo é o dia 1 e sábado é o dia 7. Utilize a estrutura Switch.
*/

function diaDaSemana(dia) {
    switch (dia) {
        case 1:
            return
        case 2:
        case 3:
        case 4:
        case 5:
            return console.log("Dia Útil");
        case 6:
        case 7:
            return console.log("Final de Semana!");

        default:
            return console.log("Dia inválido!")
    }
}
diaDaSemana(2);
diaDaSemana(6);
diaDaSemana(8);
/* 
Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado
considerando que todos pagam R$ 100 mais um adicional conforme a seguinte tabela: 1) crianças com menos
de 10 anos pagam R$80; 2) conveniados com idade entre 10 e 30 anos pagam R$50; 3) conveniados com
idade acima de 30 e até 60 anos pagam R$ 95; e 4) conveniados acima de 60 anos pagam R$130
*/

function planoSaude(age) {
    let baseValue = 100;
    if (age < 10) {
        console.log(`O valor a ser pago é de ${80 + baseValue}`);
    } else if (age >= 10 && age <= 30) {
        console.log(`O valor a ser pago é de ${50 + baseValue}`);
    } else if (age > 30 && age <= 60) {
        console.log(`O valor a ser pago é de ${95 + baseValue}`);
    } else {
        console.log(`O valor a ser pago é de ${130 + baseValue}`);
    }
}

planoSaude(9);
planoSaude(40);
planoSaude(15);
planoSaude(72);

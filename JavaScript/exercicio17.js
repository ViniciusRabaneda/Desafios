/*
​ Um funcionário irá receber um aumento de acordo com o seu plano de 
trabalho, de acordo com a tabela abaixo:  
Plano  Aumento 
A  10% 
B  15% 
C  20% 
Faça uma função que leia o plano de trabalho e o salário atual de um funcionário e calcula e imprime o seu 
novo salário. Use a estrutura switch e faça um caso default que indique que o plano é inválido.
*/

function calculaPlano(salarioAtual,plano){
    switch(plano.toUpperCase()){
        case("A"):
            return console.log(`Seu aumento é de 10% e seu novo salário é de ${salarioAtual*1.1}`)
        case("B"):
            return console.log(`Seu aumento é de 15% e seu novo salário é de ${salarioAtual*1.15}`)    
        case("C"):
            return console.log(`Seu aumento é de 20% e seu novo salário é de ${salarioAtual*1.2}`)
        default:
            return console.log("Plano inválido!")
       }
}
calculaPlano(1000,"A")
calculaPlano(1000,"a")
calculaPlano(1000,"B")
calculaPlano(1000,"t")
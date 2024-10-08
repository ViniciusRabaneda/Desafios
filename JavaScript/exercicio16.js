/*
Utilizando a estrutura do Switch faça um programa que simule uma calculadora básicaO programa recebe 
como parâmetros dois valores numéricos e uma string referente à operação e a realize com os valores 
numéricos na ordem que foram inseridos. Por exemplo: calculadora (2, ‘+’, 3). A função efetuará a soma de 2 e 
3. Dica: Os sinais das operações são: ‘+’. ‘-’, ‘*’ e ‘/’.  Crie um caso default para operações inválidas. 
*/

const calculadora = (n1,operacao,n2)=>{
    switch(operacao){
        case("+"):
            return console.log(n1+n2);
        case("-"):
            return console.log(n1-n2);
        case("*"):
            return console.log(n1*n2);
        case("/"):
            return console.log((n1/n2).toFixed(2));
        default:
            return console.log("Operação inválida");
    }
}

calculadora(2,"+",3)
calculadora(2,"-",3)
calculadora(2,"*",3)
calculadora(2,"/",3)
calculadora(2,"11",3)
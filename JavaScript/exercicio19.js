/*
 ​O cardápio de uma lanchonete é o seguinte: 
Código  Descrição do Produto  Preço 
100  Cachorro Quente  R$ 3,00 
200  Hambúrguer Simples  R$ 4,00 
300  Cheeseburguer  R$ 5,50 
400  Bauru  R$ 7,50 
500  Refrigerante  R$ 3,50 
600  Suco  R$ 2,80 
Implemente uma  função que receba como parâmetros o código do item pedido, a quantidade e calcule o valor 
a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item. Use o 
comando switch. Crie um caso default para produto não existente. 
*/

function precoTotal(codigo,quantidade){
    switch(codigo){
        case 100:
            return console.log(`Foram ${quantidade} unidade(s) de Cachorro-Quente. O preço final é de R$ ${quantidade*3}`)
        case 200:
            return console.log(`Foram ${quantidade} unidade(s) de Hamburguer Simples O preço final é de R$ ${quantidade*4}`)
        case 300:
            return console.log(`Foram ${quantidade} unidade(s) de Cheeseburguer. O preço final é de R$ ${quantidade*5.5}`)
        case 400:
            return console.log(`Foram ${quantidade} unidade(s) de Bauru. O preço final é de R$ ${quantidade*7.5}`)
        case 500:
            return console.log(`Foram ${quantidade} unidade(s) de Refrigerante. O preço final é de R$ ${quantidade*3.5}`)
        case 600:
            return console.log(`Foram ${quantidade} unidade(s) de Suco. O preço final é de R$ ${quantidade*2.8}`)
        default:
            return console.log(`Opção Inválida`)
    }
}
precoTotal(100,4)
precoTotal(200,2)
precoTotal(200,1)
precoTotal(300,3)

 
 

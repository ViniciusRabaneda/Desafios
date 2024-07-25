/*
​Crie uma estrutura condicional switch que receba uma string com o nome de uma fruta e que possua três 
casos: Caso maçã, retorne no console: “Não vendemos esta fruta aqui”. Caso kiwi, retorne: “Estamos com 
escassez de kiwis”. Caso melancia, retorne: “Aqui está, são 3 reais o quilo”. Teste com estas três opções .Crie 
também um default, que retornará uma mensagem de erro no console.
*/

const testaFruta = fruta =>{
    switch(fruta.toUpperCase()){
        case "MAÇA":
            return console.log("Não vendemos esta fruta aqui")
        case "KIWI":
            return console.log("Estamos com escassez de kiwis")
        case "MELANCIA":
            return console.log("Aqui está, são 3 reais o quilo")
        default:
            return console.log("ERRO!")
    }
}

testaFruta("melancia")
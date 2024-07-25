/*
 ​Pedro joga N jogos de basquete por temporada. Para saber como está ele está progredindo, ele mantém 
registro de todos os as pontuações feitas por jogo. Após cada jogo ele anota no novo valor e confere se o 
mesmo é maior ou menor que seu melhor e pior desempenho. Dada uma lista string = “pontuação1 pontuação2 
pontuação3 etc..”, escreva uma função que ao recebê-la irá comparar os valores um a um e irá retornar um 
vetor com o número de vezes que ele bateu seu recorde de maior número de pontos e quando fez seu pior 
jogo. (Número do pior jogo). 
*/
let stringPontuacoes = "30, 40, 20, 4, 51, 25, 42, 38, 56, 0"


function desempenhoPedro(pontuacao){
    let vetorPontuacao = pontuacao.split(", ");
    let qtdQuebraRecordes = 0;
    let qtdPiorDesemepenho = 0;
    let melhorDesempenho = pontuacao[0];
    let piorDesempenho = pontuacao[0];
  for (let i=1;i<vetorPontuacao.length;i++){
    if(parseInt(vetorPontuacao[i]) > melhorDesempenho){
        melhorDesempenho = vetorPontuacao[i];
        qtdQuebraRecordes ++;
    }else if(parseInt(vetorPontuacao[i])<piorDesempenho){
        piorDesempenho = vetorPontuacao[i];
        qtdPiorDesemepenho = i+1;
    }
  }
  return console.log([qtdQuebraRecordes,qtdPiorDesemepenho])
}
desempenhoPedro(stringPontuacoes)
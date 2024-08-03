/* Construir um algoritmo que calcule a média aritmética dos valores de um vetor de inteiros. */

let vetor = [8,8,10];

function mediaVetor(vetor){
    let media = 0;
    for(valor of vetor){
        media+=valor;
    }
    media = (media/vetor.length);
    console.log(`A media dos valores do vetor é de ${media}`);
}

mediaVetor(vetor);
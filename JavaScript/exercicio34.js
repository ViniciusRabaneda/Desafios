/* Construa uma função que receberá duas Strings de tamanhos variados e que retornará True ou False caso
todos os caracteres (independentemente de ser maiúsculo ou minúsculo) estejam contidos em ambas palavras */

function contemNaPalavra(palavra1, palavra2) {

    palavra1 = palavra1.toLowerCase();
    palavra2 = palavra2.toLowerCase();
    for (letra1 of palavra1) {
        estaContido = false;
        for (letra2 of palavra2) {
            if (letra1 == letra2) {
                estaContido = true;
                break;
            }
        }
        if (!estaContido) {
            return false;
        }
    }
    return true;
}
console.log(contemNaPalavra('CZA','CCAAC'));

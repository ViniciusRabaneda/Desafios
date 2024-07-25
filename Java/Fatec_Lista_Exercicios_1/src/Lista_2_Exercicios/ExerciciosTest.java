/*
1. Faça uma classe chamada Exercicio contendo os 10 métodos descritos a seguir:

Sem retorno:
    a) um método que receba uma palavra e apresente em tela todas as letras desta Palavra separadamente.
    b) um método que recebe um número entre 1 e 10 e apresenta em tela a tabuada desse número. Caso o número fornecido esteja fora da faixa, imprimir em tela a mensagem “número inválido”.
    c) um método que imprima em tela cinco números inteiros aleatoriamente (os valores devem estar entre 1 e 100).
    d) um método que receba um número inteiro entre 1 e 7 e mostre em tela domingo, segunda .... ou sábado, ou ainda “inexistente” caso o valor esteja fora da faixa.
    e) um método que recebe uma lista de nomes (use List do pacote) e apresente em tela todos os nomes existentes na lista.

Com retorno:
    f) um método que receba uma lista (use List do pacote java.util) contendo diversos valores inteiros e retorne a quantidade de números pares.
    g) um método que recebe um array de 10 elementos contendo valores inteiros e retorna à soma desses valores.
    h) um método que recebe qualquer quantidade de notas de prova e retorna a média aritmética dessas notas.
    i) um método que recebe dois números inteiros (n1 e n2) e retorna um vetor contendo n1 valores gerados aleatoriamente cujos valores estejam compreendidos entre 0 e n2.
    j) um método que receba um número de CPF e retorne verdadeiro caso ocorram as seguintes condições:
        a. deve conter 11 algarismos
        b. deve conter o formato xxx.xxx.xxx/xx (os algarismos devem estar no lugar de cada x)

2. Elabore uma classe chamada ExerciciosTest para testar todos os métodos da classe Exercicio.
 */

package Lista_2_Exercicios;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ExerciciosTest {
    public static void main(String[] args) {

//Exercicio A
 Exercicios.soletrar();
        System.out.println("------------------FIM EXERCICIO A------------------");
//Exercicio B
    Exercicios.tabuada();
        System.out.println("------------------FIM EXERCICIO B------------------");
//Exercicio C
        Exercicios.aleatorios();
        System.out.println("------------------FIM EXERCICIO C------------------");
//Exercicio D
    Exercicios.diasDaSemana();
        System.out.println("------------------FIM EXERCICIO D------------------");
//Exercicio E
        Exercicios.listarNomes();
        System.out.println("------------------FIM EXERCICIO E------------------");
//Exercicio F
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        while (true){
            String opcao = JOptionPane.showInputDialog("Digite um número para saber se é par!");
            if (opcao != null){
               int convertido = Integer.parseInt(opcao);
                numeros.add(convertido);
            }else{
                break;
            }
        }
        System.out.println("Item F: " + "Existem "+ Exercicios.qtdPares(numeros) + " números pares" + " neste vetor " + numeros);
        System.out.println("------------------FIM EXERCICIO F------------------");

//Exercicio G
        ArrayList<Integer> listasoma = new ArrayList<Integer>();
            for(int i=0;i<10;i++) {
                String opcao1 = JOptionPane.showInputDialog("Digite 10 números para saber a soma");
                if (opcao1 != null) {
                    listasoma.add(Integer.parseInt(opcao1));
                } else {
                    break;
                }
            }
        System.out.println("O Array tem os seguintes itens: "+listasoma+ " e sua soma é " + Exercicios.somaNumeros(listasoma));
        System.out.println("------------------FIM EXERCICIO G------------------");

//Exercicio H
        ArrayList<Double> listaNotas = new ArrayList<Double>();
        while (true){
            String opcao2 = JOptionPane.showInputDialog("Digite uma nota!");
            if (opcao2 != null){
                double notasDouble = Double.parseDouble(opcao2);
                listaNotas.add(notasDouble);
            }else{
                break;
            }
        }
        System.out.println("As notas digitadas foram: "+ listaNotas+"\nA média das notas é: "+Exercicios.mediaNotas(listaNotas));
        System.out.println("------------------FIM EXERCICIO H------------------");
//Exercicio I
        ArrayList<Integer> valoresN = new ArrayList<Integer>();
        for(int i=0;i<2;i++) {
            String opcao3 = JOptionPane.showInputDialog("Digite n1 para quantidade de numeros aleatorios e n2  para o valor limite!");
            if (opcao3 != null) {
                valoresN.add(Integer.parseInt(opcao3));
            } else {
                break;
            }
        }
        System.out.println(Exercicios.numerosAleatorios(valoresN));
        System.out.println("------------------FIM EXERCICIO I------------------");
//Exercicio J
        String cpf = JOptionPane.showInputDialog("Digite um CPF para saber se é válido!");
        if(Exercicios.validadorCPF(cpf)){
            System.out.println("CPF Válido");
        }else{
            System.out.println("CPF Inválido");
        }
        System.out.println("------------------FIM EXERCICIO J------------------");
    }
}
package Lista_2_Exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicios {
    /**
     * Recebe nomes armazena em uma lista e apresenta na tela
     */
    public static void listarNomes() {
        ArrayList<String> nomes = new ArrayList<String>();
        while (true) {
            String opcao1 = JOptionPane.showInputDialog("Digite um nome!");
            if (opcao1 != null) {
                nomes.add(opcao1);
            } else {
                break;
            }
        }
        for (String palavra : nomes) {
            System.out.println(palavra);
        }
    }

    /**
     * Verifica o dia da semana com base em um inteiro
     */
    public static void diasDaSemana() {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver o dia da semana correspondente"));
        switch (n1) {
            case 1:
                System.out.println("Hoje é Segunda-Feira");
                break;
            case 2:
                System.out.println("Hoje é Terça-Feira");
                break;
            case 3:
                System.out.println("Hoje é Quarta-Feira");
                break;
            case 4:
                System.out.println("Hoje é Quinta-Feira");
                break;
            case 5:
                System.out.println("Hoje é Sexta-Feira");
                break;
            case 6:
                System.out.println("Hoje é Sabado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
                break;
            default:
                System.out.println("Valor inexistente!");
        }
    }

    /**
     * Gera numeros aleatórios e armazena em um vetor
     */
    public static void aleatorios() {
        Random gerador = new Random();
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = gerador.nextInt(100) + 1;
            System.out.println(numeroAleatorio);
        }
    }

    /**
     * Calcula a tabuada de um número
     */
    public static void tabuada() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma tabuada!"));
        if (n1 > 10 || n1 < 0) {
            System.out.println("Numero inválido");
        } else {
            for (int i = 0; i < 11; i++) {
                System.out.println(n1 + " * " + i + " = " + (n1 * i));
            }
        }
    }

    /**
     * Função void que recebe uma palavra e apresenta ela soletrada
     */
    public static void soletrar() {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para ve-lá soletrada!");
        for (int i = 0; i < palavra.length(); i++) {
            if (i<palavra.length()-1) {
                System.out.print(palavra.charAt(i) + " - ");
            } else {
                System.out.print(palavra.charAt(i) +" ");
            }
        }
    }

    /**
     * Metodo recebe um arraylist e verifica quais valores são pares
     *
     * @param listaNumeros
     * @return
     */
    public static int qtdPares(List<Integer> listaNumeros) {
        int pares = 0;
        for (int numero : listaNumeros) {
            if ((numero % 2) == 0) {
                pares++;
            }
        }
        return pares;
    }

    /**
     * Metodo que recebe um array e soma os 10 valores do mesmo
     *
     * @param listaNumeros
     * @return
     */
    public static int somaNumeros(ArrayList<Integer> listaNumeros) {
        int soma = 0;
        for (int valor : listaNumeros) {
             soma += valor;
        }
        return soma;
    }

    /**
     * Calcula a média de n valores
     *
     * @param listaNotas
     * @return
     */
    public static double mediaNotas(ArrayList<Double> listaNotas) {
        double soma = 0;
        for (double nota : listaNotas) {
            soma += nota;
        }
        return soma / listaNotas.size();
    }

    /**
     * Gera numeros aleatorios com tamanho n1 e que vão ate n2
     *
     * @param listanumeros
     * @return
     */

    public static ArrayList<Integer> numerosAleatorios(ArrayList<Integer> listanumeros) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        int n1 = listanumeros.get(0);
        int n2 = listanumeros.get(1);
        Random gerador = new Random();
        for (int i = 0; i < n1; i++) {
            numerosAleatorios.add(gerador.nextInt(n2));
        }
        return numerosAleatorios;
    }

    /**
     * Validador de CPF
     *
     * @param cpf
     * @return
     */
    public static boolean validadorCPF(String cpf) {
        String vetor[] = new String[cpf.length()];
        if (cpf.length() != 14) {
            return false;
        }
        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11) != '/') { // "a" e 'a' são diferentes. "a" é tido como string e 'a' como caracter
                return false;
            }
        }
        return true;
    }
}
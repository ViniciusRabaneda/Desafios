package Exercicio_5;

public class Cachorro {
    private String nome;
    private String raça;
    private String cor;
    private double altura;
    private double peso;

    public Cachorro(String nome, String raça, String cor) {
        this.nome = nome;
        this.raça = raça;
        this.cor = cor;
    }

    public void latir(){
        System.out.println("AU AU AU");
    }

    public double crescer(double valor){
        altura =+ valor;
        return altura;
    }
}

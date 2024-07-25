package Exercicio_1_2;

public class UsaCliente {
    public static void main(String[] args) {
    Cliente c1 = new Cliente("456.398.993-4","Marcos","(11)4002-8922");
    c1.gravar();
    System.out.println(c1.ler());
    }
}
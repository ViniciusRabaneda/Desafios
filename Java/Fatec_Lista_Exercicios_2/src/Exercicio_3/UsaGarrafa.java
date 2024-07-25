package Exercicio_3;

public class UsaGarrafa {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa(2000,1000,false);
        System.out.println(g1.abrir());
        System.out.println(g1.encher(100));
        System.out.println(g1.esvaziar(200));

    }
}

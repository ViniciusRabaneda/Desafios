package Exercicio_4;

public class UsaControle {
    public static void main(String[] args) {
        Controle c1 = new Controle(false, 1, 1);
        System.out.println(c1.ligar());
        for (int i = 1; i <= 10; i++) {
            System.out.println(c1.aumentarVolume(1));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(c1.aumentarCanal(1));
        }
        System.out.println(c1);
    }
}
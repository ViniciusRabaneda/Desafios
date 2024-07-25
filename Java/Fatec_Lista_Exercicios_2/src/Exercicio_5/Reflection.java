package Exercicio_5;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Tem como objetivo listar todos os atributos presentes em uma classe
 */
public class Reflection {
    public static void listar(String nomeClasse){
        try{
         Class c = Class.forName(nomeClasse); // é passado o local e o nome do arquivo
            System.out.println("Atributos \n");
            Field[]atributos = c.getDeclaredFields(); // armazena todos os valores declarados em um array
            for (int i=0;i< atributos.length;i++){  // Pega o valor de cada posição do array
                Field atributo = atributos[i];
                System.out.println("Nome Atributo: "+atributo.getName());
                System.out.println("Tipo Atributo: "+atributo.getType());
                System.out.println("Classe Atributo: "+atributo.getDeclaringClass());
                int m = atributo.getModifiers();
                System.out.println("Modificadores Atributo: "+ Modifier.toString(m));
                System.out.println();
            }
        } catch(ClassNotFoundException e) {
            System.out.println("Classe não encontrada!"+e);
        }

    }
}

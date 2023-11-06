package biblioteca.controllers;

import java.lang.reflect.*;
import java.util.List;

public class CReflection {

    /**
     * Imprime os atributos de um objeto.
     *
     * @param objeto O objeto do qual os atributos serão impressos.
     */
    public static void imprimirAtributos(Object objeto) {
        try {
            Class<?> classe = objeto.getClass();
            Field[] atributos = classe.getDeclaredFields();

            System.out.println("Atributos da classe " + classe.getSimpleName() + ":");
            for (Field atributo : atributos) {
                System.out.println(atributo.getName());
            }
        } catch (SecurityException | IllegalArgumentException e) {
            // Lidar com exceções de segurança ou argumento inválido
            System.err.println("Erro ao imprimir atributos: " + e.getMessage());
        }
    }

    /**
     * Imprime os métodos de um objeto.
     *
     * @param objeto O objeto do qual os métodos serão impressos.
     */
    public static void imprimirMetodos(Object objeto) {
        try {
            Class<?> classe = objeto.getClass();
            Method[] metodos = classe.getDeclaredMethods();

            System.out.println("Métodos da classe " + classe.getSimpleName() + ":");
            for (Method metodo : metodos) {
                System.out.println(metodo.getName());
            }
        } catch (SecurityException | IllegalArgumentException e) {
            // Lidar com exceções de segurança ou argumento inválido
            System.err.println("Erro ao imprimir métodos: " + e.getMessage());
        }
    }

    /**
     * Imprime as informações de atributos e métodos de uma lista de objetos.
     *
     * @param lista A lista de objetos cujas informações serão impressas.
     */
    public static void imprimirInformacoesLista(List<?> lista) {
        System.out.println("Informações da lista de classes:");
        for (Object objeto : lista) {
            try {
                imprimirAtributos(objeto);
                imprimirMetodos(objeto);
            } catch (Exception e) {
                // Lidar com exceções gerais ao imprimir atributos e métodos
                System.err.println("Erro ao imprimir informações da lista: " + e.getMessage());
            }
        }
    }
}

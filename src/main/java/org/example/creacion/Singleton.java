package org.example.creacion;

import java.util.Scanner;

public class Singleton {

    /**
     * Nos permite asegurar que solo haya una instancia de un objeto esperado,
     * ya sea por que queremos que solo haya un objeto de este tipo y que a partir de el,
     * todos quien lo requieran tengan que tomar la informacion a partir de este,
     * evitando que hayan diferencias entre los interesados a la hora de tomar informacion
     * */

    /**
     * Atributos
     */
    private String valor1;
    private String valor2;

    Scanner entrada = new Scanner(System.in);

    /**
     * Método el cual permite ejecutar el patrón Singleton
     */
    public void ejecutarSingleton (){
        Configuracion configuracion = Configuracion.getInstancia();

        System.out.println("Digite valor 1: ");
        valor1 = entrada.next();

        System.out.println("Digite valor 2: ");
        valor2 = entrada.next();

        configuracion.setValor1(valor1);
        configuracion.setValor2(valor2);

        System.out.println("El primer valor es: " + configuracion.getValor1() + "\n" +
                "El segundo valor es: " + configuracion.getValor2());
    }
}

class Configuracion {
    /**
     * Atributos de instancia estática
     */
    private static Configuracion instancia = null;

    /**
     * Atributos
     */
    private String valor1 = "default";
    private String valor2 = "default";

    /**
     * Constructor privado el cual evita la creación de nuevas instancias.
     */
    private Configuracion() {
    }

    /**
     * Método estático, permite obtener una única instancia
     */
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    /**
     * Métodos getters y setters
     */
    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }
}

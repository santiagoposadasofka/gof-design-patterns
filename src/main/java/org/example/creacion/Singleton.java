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
    private String valor1, valor2;
    Scanner in = new Scanner(System.in);

    /**
     * Metodo para la ejecución del patrón
     */
    public void ejecutarSingleton() {
        Configuracion configuracion = Configuracion.getInstancia();
        System.out.println("Digite el valor de configuración 1");
        valor1 = in.nextLine();
        System.out.println("Digite el valor de configuración 2");
        valor2 = in.nextLine();

        configuracion.setValor1(valor1);
        configuracion.setValor2(valor2);

        System.out.println("Valor 1:" + configuracion.getValor1());
        System.out.println("Valor 1:" + configuracion.getValor2());
    }
}


class Configuracion {
    /**
     * Variable de instancia estatica
     */
    private static Configuracion instancia = null;
    /**
     * Variables
     */
    private String valor1 = "default";
    private String valor2 = "default";

    /**
     * Constructor privado para evitar la creación de múltiples instancias
     */
    private Configuracion() {
    }

    /**
     * Metodo estático para obtener la instancia única
     *
     * @return instancia
     */
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    /**
     * Metodos getters y setters
     *
     * @return
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

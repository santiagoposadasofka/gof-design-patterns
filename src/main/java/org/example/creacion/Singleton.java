package org.example.creacion;

public class Singleton {
    /**
     * Nos permite asegurar que solo haya una instancia de un objeto esperado,
     * ya sea porque queremos que solo haya un objeto de este tipo y que a partir de él,
     * todos quien lo requieran tengan que tomar la información a partir de este,
     * evitando que haya diferencias entre los interesados a la hora de tomar información
     * */
    public static void ejecutar(){
        Configuracion.getInstancia().setValor1("Hola Mundo");
        System.out.println(Configuracion.getInstancia().getValor1());
        BaseDeDatos.getBaseDeDatos().setUsuario("ivanDario19");
        BaseDeDatos.getBaseDeDatos().setContraseña("MsjiDJIDasjdw12");
        System.out.println(BaseDeDatos.getBaseDeDatos().getUsuario()+" "+BaseDeDatos.getBaseDeDatos().getContraseña());
    }
}
class BaseDeDatos{
    private static BaseDeDatos baseDeDatos=null;
    private String Usuario;
    private String Contraseña;
    private BaseDeDatos(){
    }
    public static BaseDeDatos getBaseDeDatos(){
        if (baseDeDatos==null)
            baseDeDatos=new BaseDeDatos();
        return baseDeDatos;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}

class Configuracion {
    private static Configuracion instancia = null;
    private String valor1 = "default";
    private String valor2 = "default";

    private Configuracion() {
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

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

public class Gatos {

    String raza;
    int edad;
    String nombre;
    String amo;

    Gatos() {
        System.out.println("Gestión de perretes");
    }

    Gatos(String raza, int edad, String nombre, String amo) {

        this.raza = raza;
        this.nombre = nombre;
        this.amo = amo;
        this.edad = edad;
    }

    Gatos(String raza, int edad, String nombre) {

        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    void printRaza(Gatos gato) {
        System.out.println("La raza de tu gato es" + gato.raza);
    }

    void printGato(Gatos gato) {
        System.out
                .println("Los datos del gato son: " + gato.raza + ", " + gato.nombre + ", " + gato.amo + " y" + gato.edad);
    }

}

public class Perros {

    String raza;
    int edad;
    String nombre;
    String amo;

    Perros() {
        System.out.println("Gestión de perretes");
    }

    Perros(String raza, int edad, String nombre, String amo) {

        this.raza = raza;
        this.nombre = nombre;
        this.amo = amo;
        this.edad = edad;
    }

    Perros(String raza, int edad, String nombre) {

        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    void printRaza(Perros perro) {
        System.out.println("La raza de tu perrete es " + perro.raza);
    }

    void printPerro(Perros perro) {
        System.out
                .println("Los datos del perro son " + perro.raza + "," + perro.nombre + "," + perro.amo + "," + perro.edad);
    }

}

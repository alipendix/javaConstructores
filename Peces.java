public class Peces {

    String especie;
    String tipoAgua;
    String nombre;
    String amo;

    Peces() {
        System.out.println("Gestión de perretes");
    }

    Peces(String especie, String tipoAgua, String nombre, String amo) {

        this.especie = especie;
        this.nombre = nombre;
        this.amo = amo;
        this.tipoAgua = tipoAgua;
    }

    Peces(String especie, String tipoAgua) {

        this.especie = especie;
        this.tipoAgua = tipoAgua;
    }

    void printPeces(Peces peces) {
        System.out
                .println("El pez es de la especie : " + peces.especie + " y es de tipo Agua : " + peces.tipoAgua);
    }

}

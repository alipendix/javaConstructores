public class Mascotas {
    public static void main(String[] args) {

        System.out.println("\nEmpieza el programa de mascotas\n");
        System.out.println("####################################\n");

        Perros perroAdri = new Perros("Pequines", 2, "Chase","Adri");
        Perros perroAna = new Perros("Dalamta", 8, "Jose Maria","Ana");

        perroAdri.printRaza(perroAdri);

        System.out.println("\n####################################\n");

        Gatos gatoAna = new Gatos("siames", 12, "Misifu", "Ana");

        gatoAna.printGato(gatoAna);

        System.out.println("\n####################################\n");

        Peces miPeces = new Peces("Pez Cebra", "Dulce");

        miPeces.printPeces(miPeces);

        System.out.println("\n####################################\n");

        Utilidades utilidades = new Utilidades();

        utilidades.comparaEdadesPerros(perroAdri, perroAna);

    }
}

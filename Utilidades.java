public class Utilidades {

    void comparaEdadesPerros(Perros p1, Perros p2) {

        if (p1.edad > p2.edad) {
            System.out.println("El perro más grande es : " + p1.nombre + " el perro de " +p1.amo);
        } else {
            System.out.println("El perro más grande es : " + p2.nombre + " el perro de " +p2.amo);
        }

    }
}

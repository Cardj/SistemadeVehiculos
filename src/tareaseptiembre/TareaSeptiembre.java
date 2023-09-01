
package tareaseptiembre;

/**
 *
 * @author Carlos
 */
public class TareaSeptiembre {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Automóvil A", 5); 
        Bicicleta bicicleta = new Bicicleta("Bicicleta B");

        automovil.acelerar(60);
        automovil.frenar();
        System.out.println("Cantidad máxima de pasajeros en " + automovil.getNombre() + ": " + automovil.getMaxPasajeros());

        bicicleta.acelerar(20);
        bicicleta.frenar();
    }
}

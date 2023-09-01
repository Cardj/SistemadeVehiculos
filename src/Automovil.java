/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos
 */
class Automovil extends Vehiculo {
    private int maxPasajeros;

    public Automovil(String nombre, int maxPasajeros) {
        super(nombre);
        this.maxPasajeros = maxPasajeros;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " está acelerando a " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println(getNombre() + " está frenando");
    }
}

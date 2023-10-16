package org.example;

import java.util.Scanner;

// Clase Vehiculo (clase base para los tipos de vehículos)
class Vehiculo {
    private String tipo;
    private double velocidadPromedio;

    public Vehiculo(String tipo, double velocidadPromedio) {
        this.tipo = tipo;
        this.velocidadPromedio = velocidadPromedio;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularTiempo(int distancia) {
        // Calculamos el tiempo en horas.
        double tiempoHoras = (double) distancia / velocidadPromedio;
        return tiempoHoras;
    }
}


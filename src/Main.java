/*
* 7. Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km
* de uso diario.
* Por cada km extra hasta los 1000 km cobra $5 adicionales,
* y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite la cantidad de km
* realizados por un cliente e indique el importe que se le debe cobrar.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double kmsRecorridos;
        Double tarifaBase = 300.00; // Hasta 200Km.
        Double importeACobrar;

        Scanner input = new Scanner(System.in);
        kmsRecorridos = input.nextDouble();

        if (kmsRecorridos<200) {
            importeACobrar = tarifaBase;
        } else if (kmsRecorridos>200 && kmsRecorridos<=1000) {
            importeACobrar = tarifaBase + ((kmsRecorridos-200)*5);
            } else {
                importeACobrar = tarifaBase + ((kmsRecorridos-200)*10);
            }
        System.out.println("El importe a cobrar es: "+importeACobrar);
    }
}
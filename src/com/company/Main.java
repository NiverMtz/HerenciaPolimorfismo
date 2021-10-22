package com.company;

import com.company.animales.Animal;
import com.company.animales.Ave;
import com.company.animales.Perro;
import com.company.uber.BlackUberDriver;
import com.company.uber.UberDriver;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        /*Animal animal = new Animal("Animal 1") {
            @Override
            public void respirar() {

            }
        };
        animal.comer();
        animal.comunicarse();*/

        /*Ave ave = new Ave("Petirrojo");
        ave.comunicarse();
        ave.comer();
        ave.hacerNido();
        ave.ponerHuevo();

        Perro perro = new Perro("Firulais");
        perro.jugar();
        perro.ladrar();
        perro.comer();
        perro.comunicarse();
        perro.ingestarLeche();
        perro.gestar();
        perro.movilidad();*/

        UberDriver uberDriver = new UberDriver();
        System.out.println("El precio por viaje de un conductor de uber normal, es: " + uberDriver.calculatePrice(6));

        BlackUberDriver blackUberDriver = new BlackUberDriver();
        out.println("El precio por viaje de un conductor de uber black, es: " + blackUberDriver.calculatePrice(6));
    }
}

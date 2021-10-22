package com.company.animales;

public class Ave extends Animal{
    private int alas;
    private int patas;
    private boolean vuela;

    public Ave() {

    }

    public Ave(String nombre) {
        super(nombre);
        System.out.println("Está naciendo un pollito");
    }

    public void hacerNido() {
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo(){
        System.out.println("Estoy poniendo huevo");
    }

    @Override
    public void comer() {
        System.out.println("Comer alpiste");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por el pico");
    }
}

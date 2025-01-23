package com.alejandropobes.tema6.tema06;

public class Jugador {
    private String nombre;
    private int portero;
    private int defensa;
    private int pase;
    private int regate;
    private int tiro;
    private int estadoForma;

//contructor
    public Jugador(String nombre, int portero, int defensa, int pase, int regate, int tiro, int estadoForma){
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.estadoForma = estadoForma;
    }

    public Jugador(String nombre) {
        this(nombre, 50,50,50,50,50,50);
    }
}

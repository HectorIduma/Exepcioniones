package com.mycompany.main;

class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {
        super("Se ha ingresado un número negativo.");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}



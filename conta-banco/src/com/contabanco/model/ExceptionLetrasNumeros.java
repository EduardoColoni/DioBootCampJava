package com.contabanco.model;

import java.util.InputMismatchException;

public class ExceptionLetrasNumeros {
    public boolean verificarLetras(String letras) {
        if (!letras.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("É permitido apenas letras!!");
        }
        return true;
    }
    public boolean verificarNumeros(float numeros) {
        String numeroString = Float.toString(numeros);
        if (!numeroString.matches("\\d+(\\.\\d+)?")) {
            throw new InputMismatchException("É permitido apenas números!!");
        }
        return true;
    }
}


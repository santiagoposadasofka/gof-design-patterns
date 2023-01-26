package org.example;

import org.example.creacion.Builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Pastron builder---------");
        Builder builder = new Builder();
        builder.ejecutar();

    }
}
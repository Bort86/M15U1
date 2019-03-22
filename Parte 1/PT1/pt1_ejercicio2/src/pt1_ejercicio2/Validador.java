/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1_ejercicio2;

import java.util.regex.Pattern;

/**
 *
 * @author pablo
 */
class Validador {

    int length_1 = 40;
    int length_2 = 140;
    String[] palabrotas = new String[]{"tonto", "burro", "capullo", "zoquete", "alcornoque", "looser"};

    /**
     * validador del punto 1: Le pasamos los cuatro campos, los guardamos en un
     * array y le pasamos al array el método para ver si el campo está vacio, si
     * lo está devolvemos un mensaje informando que ese campo expecífico está
     * vacío
     *
     * @param campo_1
     * @param campo_2
     * @param campo_3
     * @param campo_4
     */
    public void validador_nadaVacío(String campo_1, String campo_2, String campo_3, String campo_4) {
        String[] formulario = new String[]{campo_1, campo_2, campo_3, campo_4};
        for (int i = 0; i < formulario.length; i++) {
            if (si_está_vacío(formulario[i])) {
                System.out.println("El campo " + (i + 1) + " está vacío");
            }
        }

    }

    /**
     * método al que se le pasa un campo string y devuelve si está vacío o no
     *
     * @param campo_texto
     * @return
     */
    public boolean si_está_vacío(String campo_texto) {
        boolean esta_vacio = false;
        if (campo_texto == "") {
            esta_vacio = true;
        }
        return esta_vacio;
    }

    /**
     * validador del punto 2 primero comprobamos que no esté vacío luego
     * comprobamos que no empiece con minúsculas, si es asi printa mensaje de
     * error, si todo está ok printa mensaje de ok
     *
     * @param campo_texto
     */
    public void campo_nombre_mayus(String campo_texto) {
        if (si_está_vacío(campo_texto)) {
            System.out.println("El campo de nombre está vacío");
        } else {
            if (empieza_mayus(campo_texto)) {
                System.out.println("El campo nombre no empieza con mayúsculas");
            } else {
                System.out.println("El campo nombre empieza ok con mayus");
            }

        }
    }

    /**
     * método que devuelve true si un campo de texto empieza con minúsculas
     * @param campo_texto
     * @return 
     */
    public boolean empieza_mayus(String campo_texto) {
        boolean minus = false;
        if (Character.isLowerCase(campo_texto.charAt(0))) {
            minus = true;
        }
        return minus;
    }

    /**
     *  validador 3, le pasamos los tres campos, los guardamos en un array y 
    a cada elemento del array le pasamos el metodo para validar si excede o no
    los 40 caracteres, con un mensaje correspondiente
     * @param campo_1
     * @param campo_2
     * @param campo_3 
     */
    public void campos123_tamaño(String campo_1, String campo_2, String campo_3) {
        String[] formulario = new String[]{campo_1, campo_2, campo_3};
        for (int i = 0; i < formulario.length; i++) {
            if (es_largo(formulario[i], length_1)) {
                System.out.println("El campo " + (i + 1) + " excede el máximo de 40 caracteres");
            } else {
                System.out.println("El campo " + (i + 1) + " contiene menos de 40 caracteres");
            }
        }
    }

    /**
     *  metodo del validador 3 para verificar si en un campo string nos
    excedemos de los 40 caracteres
     * @param campo_texto
     * @param max_1
     * @return 
     */
    public boolean es_largo(String campo_texto, int max_1) {
        boolean largo = false;
        if (campo_texto.length() >= max_1) {
            largo = true;
        }
        return largo;
    }

    /**
     * validador 4, muy parecido al tres, pero coge el length_2
     * @param campo_texto 
     */
    public void val_tamaño_comentario(String campo_texto) {
        if (es_largo(campo_texto, length_2)) {
            System.out.println("El campo excede los 140 caracteres");

        } else {
            System.out.println("El campo contiene menos de 140 caracteres");
        }
    }

    /**
     * validador 5, el campo mail, confirma que esté compuesto de algo 
     * antes de un arroba y algo después
     * @param campo_texto 
     */
    public void validar_formato_mail(String campo_texto) {
        if (Pattern.matches("^.+@.+\\..+$", campo_texto)) {
            System.out.println("El mail es correcto");
        } else {
            System.out.println("El mail no es correcto");
        }

    }

    /**
     * validador 6, el campo web
     * @param campo_texto 
     */
    public void validar_formato_web(String campo_texto) {
        if (Pattern.matches("^.+\\..+$", campo_texto)) {
            System.out.println("La web es correcta");
        } else {
            System.out.println("La web no es correcta");
        }

    }

    /**
     * validar 7 que en comentario no haya palabrotas
     * @param campo_texto 
     */
    public void validar_palabrotas(String campo_texto) {
        campo_texto = pasar_a_minus(campo_texto);
        for (int i = 0; i < palabrotas.length; i++) {
            if (campo_texto.contains(palabrotas[i])) {
                System.out.println("La palabra " + palabrotas[i] + " no está permitido");
            }

        }
    }

    /**
     * método que pasa un string a minúsculas
     * @param campo_texto
     * @return 
     */
    public String pasar_a_minus(String campo_texto) {
        String minuscula = campo_texto.toLowerCase();

        return minuscula;
    }
}

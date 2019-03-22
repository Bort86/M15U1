/*
 Crea la clase “Validador” he implementa los métodos que nos permitan hacer lo siguiente:
1 – Validar que ninguno de los campos de texto esté vacío.
2 – Validar que el campo no nombre empieza unicamente con una letra en mayúsculas.
3 – Validar que los campos de texto 1,2 y 3 no superan los 40 caracteres de largo.
4 – validar que el campo de texto 4 (comentarios), no supera los 140 caracteres de largo.
5 – Validar que el email se compone de una cadena de caracteres de como mínimo tamaño uno, más
una arroba más otra cadena de caracteres de como mínimo tamaño uno más un punto más uno de
los siguientes dominios permitidos [“com”,”net”,”org”].
6 – Validar que el sitio web se compone de una cadena de texto de como mínimo tamaño uno
seguido de punto y de que acaba en alguno de los dominios permitidos [“com”,”net”,”org”]
7 - Validar que el campo 4 (comentarios) no contenga ninguna palabra de una lísta de palabrotas
prohibidas [“tonto”,”burro”,”capullo”,”zoquete”,”alcornoque”,”looser”] tanto en minúsculas como
con alguna o todas las letras en mayúsculas.

 */
package pt1_ejercicio2;

/**
 *
 * @author pablo
 */
public class Pt1_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validador v = new Validador();
        //v.validador_1("ss", "", "", "");
        //v.validador_2("pablo");
        // v.validador_3("Hola", "Que hay", "ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");
        //v.validador_4("poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123poqwiepo123");
        // v.validador_5("a@a.com");
        // v.validador_6("acom");
        //v.validador_7("Aquí deberñia no decir BURRO cómo lo ves zoquete");
    }

}

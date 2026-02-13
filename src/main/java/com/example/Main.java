package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Preguntas> preguntas = Inicializarpreguntas();

        Test test = new Test(preguntas);

        System.out.println("Examen tipo Test.");
        System.out.println("-----------------");

        boolean seguir = true;

        while (seguir) {

            System.out.println(test.getEnunciadoPreguntaActual());
            String[] opciones = test.getRespostePreguntaActual();

            for (int j = 0; j < opciones.length; j++) {
                System.out.println((j + 1) + ". " + opciones[j]);
            }
            System.out.println("Elige una opcion: (1)Retroceder - (2)Responder - (3)Siguiente - (4)Finalizar");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    test.anarEnderra();
                    break;
                case 2:
                    System.out.print("Tu respuesta: ");
                    int respuesta = teclado.nextInt();
                    test.responder(respuesta);
                    break;
                case 3:
                    test.anarEndevant();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Puntuacion final" + test.solucionartest());
                    System.out.println("Gracias por participar!!");
                    seguir = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public static ArrayList<Preguntas> Inicializarpreguntas() {

        ArrayList<Preguntas> pregunta = new ArrayList<>();

        pregunta.add(new Preguntas("Quien pintó el Guernica",
                new String[]{"Velàzquez", "Goya", "Picasso"}, 2));
        pregunta.add(new Preguntas("Qui va escriure Alicia al país de les meravelles",
                new String[]{"Grimm", "Stevenson", "Carrol"}, 2));
        pregunta.add(new Preguntas("Quina és la magnitud que relaciona espai i temps",
                new String[]{"velocitat", "temperatura", "pes"}, 0));
        pregunta.add(new Preguntas("Si el radi d'una circumferència és 4, el seu diàmetre és",
                new String[]{"4", "8", "12", "14"}, 1));
        pregunta.add(new Preguntas("Quants segons té 1 hora",
                new String[]{"420", "760", "3600"}, 2));
        pregunta.add(new Preguntas("Quin no és un llenguatge de programació",
                new String[]{"java", "php", "samsung"}, 2));
        pregunta.add(new Preguntas("Dins un termòmetre hi trobem",
                new String[]{"aigua", "aigua amb gas", "mercuri"}, 2));
        pregunta.add(new Preguntas("L'Acropolis es troba a",
                new String[]{"Atenes", "Roma", "París"}, 0));
        pregunta.add(new Preguntas("L'element químic amb símbol Fe és ",
                new String[]{"Estronci", "Ferro", "Feril·li"}, 1));
        pregunta.add(new Preguntas("La capital d'Estats Units és",
                new String[]{"Georgetown", "New York", "Washington"}, 2));

        return pregunta;

    }
}

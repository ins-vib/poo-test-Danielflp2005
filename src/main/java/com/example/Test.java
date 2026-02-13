package com.example;

import java.util.ArrayList;

public class Test {

    private ArrayList<Preguntas> preguntas;
    private ArrayList<Integer> contestaciones;
    private int puntuacion;
    private int posicionactual;

    public Test(ArrayList<Preguntas> preguntas) {

        this.preguntas = preguntas;
        this.contestaciones = new ArrayList<>();
        this.posicionactual = 0;
        this.puntuacion = 0;
    }

    public String getEnunciadoPreguntaActual() {

        if (posicionactual < 0 || posicionactual >= preguntas.size()) {
            return new String();
        }

        return preguntas.get(posicionactual).getEnunciado();

    }

    public String[] getRespostePreguntaActual() {

        if (posicionactual < 0 || posicionactual >= preguntas.size()) {
            return new String[]{"¡Has acabado el test! pulse 4 para ver los resultados"};
        }

        return preguntas.get(posicionactual).getRespuestas();

    }

    public int getNumeroPregunta() {

        return posicionactual + 1;

    }

    public void responder(int respuesta) {

        if (posicionactual < preguntas.size()) {

            Preguntas preguntactual = preguntas.get(posicionactual);
            contestaciones.add(respuesta);

            int numpreguntas = preguntas.size();
            int correcta = 10 / numpreguntas;
            int incorrecta = correcta / getRespostePreguntaActual().length;

            if (preguntactual.getCorrecta() == respuesta - 1) {
                puntuacion += correcta;
            } else  {
               puntuacion -= incorrecta;
            }

        }

        posicionactual++;

    }

    public boolean anarEndevant() {

        if (posicionactual < preguntas.size() - 1) {

            posicionactual++;
            return true;
        } else {
            return false;
        }

    }

    public boolean anarEnderra() {

        if (posicionactual > 0) {
            posicionactual--;
            return true;
        } else {
            return false;
        }
    }

    public double solucionartest() {

        return puntuacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Test{");
        sb.append("preguntas=").append(preguntas);
        sb.append(", contestaciones=").append(contestaciones);
        sb.append(", posicionactual=").append(posicionactual);
        sb.append('}');
        return sb.toString();
    }

    public int getPuntuacion() {
        return puntuacion;
    }

}

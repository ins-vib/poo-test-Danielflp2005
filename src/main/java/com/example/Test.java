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

        if (posicionactual < preguntas.size()) {
            return preguntas.get(posicionactual).getEnunciado();
        }

        return null;

    }

    public String[] getRespostePreguntaActual() {

        if (posicionactual < preguntas.size()) {
            return preguntas.get(posicionactual).getRespuestas();
        }

        return null;

    }

    public int getNumeroPregunta() {

        return posicionactual + 1;

    }

    public void responder(int respuesta) {

        if (posicionactual < preguntas.size()) {
            contestaciones.add(respuesta);

            Preguntas preguntactual = preguntas.get(posicionactual);

            if (preguntactual.getCorrecta() == respuesta -1 ) {
                puntuacion++;

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

package com.example;

import java.util.Arrays;

public class Preguntas {

    private String enunciado;
    private String[] respuestas;
    private int correcta;

    public Preguntas(String enunciado, String[] respuestas ,int correcta  ) {
        this.correcta = correcta;
        this.enunciado = enunciado;
        this.respuestas = respuestas;
    }


    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }


    @Override
    public String toString() {
        return "Preguntas [enunciado=" + enunciado + ", respuestas=" + Arrays.toString(respuestas) + ", correcta="
                + correcta + "]";
    }

    

    
}

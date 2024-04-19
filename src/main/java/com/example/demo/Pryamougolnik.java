package com.example.demo;

public class Pryamougolnik {
    int n;
    int m;

    @Override
    public String toString() {
        return "Pryamougolnik{" +
                "n=" + n +
                ", m=" + m +
                ", color='" + color + '\'' +
                '}';
    }

    String color;

    public Pryamougolnik(int n, int m, String color) {
        this.n = n;
        this.m = m;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}

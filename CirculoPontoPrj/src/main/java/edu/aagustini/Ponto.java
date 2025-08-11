package edu.aagustini;

public class Ponto {
    private double cx;
    private double cy;

    public Ponto(double x, double y) {
        this.cx = x;
        this.cy = y;
    }

    public void mover(double x, double y) {
        this.cx = x;
        this.cy = y;
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", cx, cy);
    }
}

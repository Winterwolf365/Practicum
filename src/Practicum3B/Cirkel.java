package Practicum3B;

public class Cirkel {
    private int radius;
    private int x;
    private int y;

    // Constructor
    public Cirkel(int radius, int x, int y) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    // Getter voor radius
    public int getRadius() {
        return radius;
    }

    // Getter voor x
    public int getX() {
        return x;
    }

    // Getter voor y
    public int getY() {
        return y;
    }

    // toString methode
    @Override
    public String toString() {
        return "Cirkel ("+ x + ", " + y + ") met radius: " + radius;
    }
}

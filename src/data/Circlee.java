package data;
import java.lang.Math;

public class Circlee {

    public String owner;
    public String color;
    public double radius;
    public double area;
    
    public Circlee(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "circle [owner=" + owner + ", color=" + color + ", radius=" + radius + ", area=" + area + "]";
    }

    // public void setArea(double area) {
    //     this.area = area;
    // }

    public void paint(){
        System.out.printf("|Circle   |%-15s|%-10s|%4.1f|%-5s|%5.1f|\n", owner, color, radius, "", area);
    }
}

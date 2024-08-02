package data;

import java.lang.Math;

public class Square {

    public String owner;
    public String color;
    public double edge;
    public double area;

    public Square(String owner, String color, float edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
        area = Math.pow(2, edge);

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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return area;
    }

    // public void setArea(float area) {
    // this.area = area;
    // }

    @Override
    public String toString() {
        return "Square [owner=" + owner + ", color=" + color + ", edge=" + edge + ", area=" + area + "]";
    }

    public void paint() {
        System.out.printf("|Square   |%-15s|%-10s|%4.1f|%5.1f|", owner, color, edge, area);
    }

}

package data;

public class Square {

    public String owner;
    public String color;
    public float edge;
    public float area;
    
    public Square(String owner, String color, float edge, float area) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
        this.area = area;
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
    public float getEdge() {
        return edge;
    }
    public void setEdge(float edge) {
        this.edge = edge;
    }

    public float getArea() {
        return area;
    }

    // public void setArea(float area) {
    //     this.area = area;
    // }
    
}

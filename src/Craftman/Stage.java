package Craftman;

import data.*;

public class Stage {
    public static void main(String[] args){
        Rectangle rt = new Rectangle("Anhh", "Blue", 10.4, 20.3);
        Square sq = new Square("Anhh2", "Yellow", 5.9);
        Circlee cc = new Circlee("Anhh3", "Black", 4.3);
        rt.paint();
        sq.paint();
        cc.paint();
    }
}

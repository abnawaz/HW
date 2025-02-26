
public class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }
}


public class Circle extends Shape {
    public Circle() {
        super(0); 
    }
}


public class Rectangle extends Shape {
    public Rectangle() {
        super(4); 
    }
}


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle sides: " + circle.getNumSides());
    }
}
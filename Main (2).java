import java.util.Arrays;

class Automobile implements Comparable<Automobile> {
    protected int modelYear;
    protected String brand;

    public Automobile(int modelYear, String brand) {
        this.modelYear = modelYear;
        this.brand = brand;
    }

    public void honk() {
        System.out.println(brand + " honks.");
    }

    public void accelerate() {
        System.out.println(brand + " is accelerating.");
    }

    public void stop() {
        System.out.println(brand + " has stopped.");
    }

    public void reverse() {
        System.out.println(brand + " is reversing.");
    }

    @Override
    public String toString() {
        return modelYear + " " + brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Automobile that = (Automobile) obj;
        return modelYear == that.modelYear && brand.equals(that.brand);
    }

    @Override
    public int compareTo(Automobile other) {
        return Integer.compare(this.modelYear, other.modelYear);
    }
}

class Car extends Automobile {
    public Car(int modelYear, String brand) {
        super(modelYear, brand);
    }
}

class SportsCar extends Automobile {
    public SportsCar(int modelYear, String brand) {
        super(modelYear, brand);
    }

    @Override
    public void honk() {
        System.out.println(brand + " honks loudly.");
    }
}

class JunkCar extends Automobile {
    public JunkCar(int modelYear, String brand) {
        super(modelYear, brand);
    }

    @Override
    public void honk() {
        System.out.println(brand + " honks weakly.");
    }
}

public class Tester {
    public static void main(String[] args) {
        Automobile[] autos = {
            new Car(2015, "Toyota"),
            new SportsCar(2021, "Ferrari"),
            new JunkCar(1998, "Old Ford")
        };

        for (Automobile auto : autos) {
            System.out.println(auto);
            auto.honk();
            auto.accelerate();
            auto.reverse();
            auto.stop();
            System.out.println();
        }

        Arrays.sort(autos);
        System.out.println("Sorted Automobiles:");
        for (Automobile auto : autos) {
            System.out.println(auto);
        }
    }
}

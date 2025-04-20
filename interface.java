interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }

    public void stop() {
        System.out.println("Car is stopping.");
    }
}

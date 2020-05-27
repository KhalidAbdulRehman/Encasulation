class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }
    public String startEngine(){
        return "Car--> Started";
    }
    public String accelerate() {
        return "vrooooooooooooooommmmmm!!!!!!";
    }
    public String brake() {
        return " car has stopped ";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
class BMW extends Car{
    public BMW() {
        super("BMW M3", 8 , 4);
    }

    @Override
    public String startEngine() {
        return "BMW--> Started";
    }

    @Override
    public String accelerate() {
        return "BMW M3 vrooooooooooooooommmmmm!!!!!!";
    }

    @Override
    public String brake() {
        return " BMW M3 car has stopped ";
    }
}
class Mercedes extends Car{
    public Mercedes() {
        super("Mercedes AMG",12, 4);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "--> Started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " vrooooooooooooooommmmmm!!!!!!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " car has stopped ";
    }
}

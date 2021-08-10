public class Car {
    private String name;
    private String engine;
    public static int numberOfCar = 0;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void dipplay() {
        System.out.println("Car : \nnumber : " + numberOfCar + "\nname : " + this.getName() + "\nengine : " + this.getEngine());
    }
}

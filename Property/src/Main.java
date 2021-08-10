public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        car1.dipplay();
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        car2.dipplay();
        car1.setName("Huyndai I10");
        car2.setName("Mazda 9");
        System.out.println("Sau update  : ");
        car1.dipplay();
        car2.dipplay();
    }
}

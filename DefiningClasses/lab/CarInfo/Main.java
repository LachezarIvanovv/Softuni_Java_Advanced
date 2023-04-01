package advanced.DefiningClasses.lab.CarInfo;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Car car = new Car();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split(" ");

            String brand = data[0];
            String model = data[1];
            int horsePower = Integer.parseInt(data[2]);

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            System.out.println(car.carInfo());
        }
    }
}

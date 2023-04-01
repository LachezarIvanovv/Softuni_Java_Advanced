package advanced.DefiningClasses.lab.Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String[] data = scanner.nextLine().split(" ");
                String brand = data[0];

            if(data.length == 1){
                DefiningClasses.lab.Constructors.Car car = new DefiningClasses.lab.Constructors.Car(brand);
                car.setBrand(brand);
                System.out.println(car.getCarInfoForLengthOne());
            }else{
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                DefiningClasses.lab.Constructors.Car car = new DefiningClasses.lab.Constructors.Car(brand,model,horsePower);

                car.setBrand(brand);
                car.setModel(model);
                car.setHorsePower(horsePower);
                System.out.println(car.getCarInfo());
            }

        }
    }
}

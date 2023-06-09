package DefiningClasses.lab.Constructors;

public class Car {
    public String brand;
    public String model;
    public int horsePower;

    public Car(String brand){
        this(brand, "unknown", -1);
    }

    public Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public String getBrand(){
        return brand;
    }
     public void setBrand(String brand){
        this.brand = brand;
     }

     public String getModel(){
        return model;
     }
     public void setModel(String model){
        this.model = model;
     }

     public int getHorsePower(){
        return horsePower;
     }
     public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
     }

     public String getCarInfoForLengthOne(){
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower());
     }
     public String getCarInfo(){
        return String.format("The car is: %s %s - %d HP.",this.getBrand(), this.getModel(), this.getHorsePower());
     }
}
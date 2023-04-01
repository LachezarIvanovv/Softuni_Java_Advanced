package advanced.Generics.lab.GenericScale;

public class Main {
    public static void main(String[] args) {

        Generics.lab.GenericScale.Scale<String> scale = new Generics.lab.GenericScale.Scale("A", "B");
        System.out.println(scale.getHeavier());
    }
}

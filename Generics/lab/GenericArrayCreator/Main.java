package Generics.lab.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] firstArr = ArrayCreator.create(1,2);
        for(Integer integer : firstArr){
            System.out.println(integer);
        }

        Integer[] secondArr = ArrayCreator.create(3,4);
        for (Integer integer : secondArr) {
            System.out.println(integer);
        }
    }
}

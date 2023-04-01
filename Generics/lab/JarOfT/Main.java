package advanced.Generics.lab.JarOfT;

import advanced.Generics.lab.JarOfT.Jar;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();

        jar.add(1);
        jar.add(2);

        System.out.println(jar.remove());
        System.out.println(jar.remove());
    }
}

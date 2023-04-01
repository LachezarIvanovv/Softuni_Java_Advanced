package Generics.lab.GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T defaultValue){
        T[] arr = (T[]) Array.newInstance(defaultValue.getClass(), length);
        Arrays.fill(arr, defaultValue);
        return arr;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> clazz, int length, T defaultValue){
        T[] arr = (T[]) Array.newInstance(clazz,length);
        Arrays.fill(arr, defaultValue);
        return arr;
    }
}

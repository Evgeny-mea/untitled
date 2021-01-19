package ru.gb.catch_the_drop.Java_3.lession_1;
import java.util.ArrayList;


public class Main {

    private static <T> void swapElements(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

//    private static <E> List<E> convertToList(E[] array) {
//        return Arrays.asList(array);
//    }

    static ArrayList<Integer> intToArray (int[] input) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++)
            result.add(i);
            return result;
        }
    public static void main(String[] args) {
        String[] arr = {"ффыв", "d", "abc", "123"};
        int[] intArr = {23,234,1241,141};
        intToArray(intArr);
        swapElements(arr,3,1);
    }
}

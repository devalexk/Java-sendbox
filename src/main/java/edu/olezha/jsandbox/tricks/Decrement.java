package edu.olezha.jsandbox.tricks;

public class Decrement {

    public static void main(String[] args) {
        int[] arr = new int[1];
        int i = 2;
        arr[--i] = 1 / --i;
        System.out.println(arr);
    }
}

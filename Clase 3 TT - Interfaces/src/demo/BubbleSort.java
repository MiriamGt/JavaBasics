package demo;

import java.util.Comparator;

public class BubbleSort<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length - i -1; j++) {
                if(c.compare(arr[j], arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                };
            }
        }
    }
}

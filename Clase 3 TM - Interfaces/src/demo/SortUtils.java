package demo;

public class SortUtils {

    public static <T> void sort(IPrecedable<T>[] arr) {

        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length - i -1; j++) {
                if(arr[j].precedeA((T) arr[j+1]) > 0) {
                    IPrecedable <T> temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                };
            }
        }

    }

}

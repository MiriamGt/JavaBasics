package demo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Integer[] array = new Integer[]{0, 643,5,2,14,3,4,222, 78277};
        /*QuickSort <Integer> sorterArray= new QuickSort<>();
        sorterArray.sort(array, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(array));*/

        /*System.out.println("HeapSort Algorithm");
        HeapSort<Integer> otherArray = new HeapSort<>();
        otherArray.sort(array, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(array));*/

        /*System.out.println("Factory Class");
        Sorter<Integer> sort =  (Sorter) MiFactory.getInstance("bubble");
        sort.sort(array, (Integer :: compareTo));
        System.out.println(Arrays.toString(array));*/

        Time time = new Time();
        Integer[] array2 = new Integer[100000];
        Arrays.setAll(array2, i ->100000-i);
        long start = time.start();
        Sorter<Integer> sort =  (Sorter) MiFactory.getInstance("heap");
        sort.sort(array2, (Integer :: compareTo));
        long stop = time.stop();

        System.out.printf("The time to sort was: %1s ms%n",time.elapsedTime(start, stop));


    }

}

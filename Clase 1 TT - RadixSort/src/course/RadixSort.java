package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RadixSort {

    public static int highest = 0;

    public static void main(String[] args) {
        int iArr[] = {16223,898,13,906,235,23,9,1532,6388,2511,8};

        //Convert int Array to String Array
        String sArr[] = integerToString(iArr);

        //Add the required zeros
        String sArr2[] = addZeros(sArr);

        //Loop to
        for(int i=(highest-1); i > -1; i--) {
            sArr2 = createList(sArr2, i);
        }

        System.out.println("Result = " + Arrays.toString(sArr2));
    }

    public static String[] integerToString (int[] array) {
        String[] strArray = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        return strArray;
    }

    public static String[] addZeros (String[] array) {
        String[] zeros = new String[array.length];
        int iterator = 0;
        for(String i:array) {
            if(i.length() > highest) {
                highest = i.length();
            }
        }

        for(String j:array) {
            String str = j;
            for (int i=j.length(); i<highest; i++) {
                str = "0" + str;
            }
            zeros[iterator] = str;
            iterator++;
        }
        return zeros;
    }

    public static String[] createList (String[] array, int index) {
        String sArray[] = new String[array.length];
        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();

        for(String el: array) {
            String digit = String.valueOf(el.charAt(index));
            switch (digit) {
                case "0":
                    L0.add(el);
                    break;
                case "1":
                    L1.add(el);
                    break;
                case "2":
                    L2.add(el);
                    break;
                case "3":
                    L3.add(el);
                    break;
                case "4":
                    L4.add(el);
                    break;
                case "5":
                    L5.add(el);
                    break;
                case "6":
                    L6.add(el);
                    break;
                case "7":
                    L7.add(el);
                    break;
                case "8":
                    L8.add(el);
                    break;
                default:
                    L9.add(el);
            }
        }

        List<String> newList = Stream.of(L0, L1, L2, L3, L4, L5, L6, L7, L8, L9)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        sArray = newList.toArray(sArray);
        return sArray;

    }
}

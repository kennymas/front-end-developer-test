package com.proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    static int[] firstArray = new int[]{2, 2, 4, 1};
    static int[] secondArray = new int[]{1, 2, 0, 2};

    public static int[] findIntersection(int[] arr1, int[] arr2) {

        List<Integer> intersectionList = new ArrayList<>();
        boolean unique;
        boolean intersectionFound;
        for(int numFirstArray : arr1){
            intersectionFound = false;
            for(int numSecondArray : arr2){
                if (numFirstArray==numSecondArray)
                    intersectionFound = true;
            }
            unique = true;
            for (Integer intersectionNum:intersectionList) {
                if(intersectionNum.equals(numFirstArray))
                    unique = false;
            }

            if (intersectionFound&&unique)
                intersectionList.add(numFirstArray);

        }
        return intersectionList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String args[]) {
        int[] intersection = findIntersection(firstArray, secondArray);
        System.out.println(Arrays.toString(intersection));
    }
}

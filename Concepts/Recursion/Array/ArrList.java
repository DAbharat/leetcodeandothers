package Recursion.Array;

import java.util.ArrayList;

public class ArrList{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        System.out.println(arrlist(arr,4,0, new ArrayList<>()));
    }

    static ArrayList<Integer> arrlist(int[] arr, int target, int i, ArrayList<Integer> list) {
        if(i==arr.length - 1) return list;
        if(arr[i] == target) list.add(i);
        return arrlist(arr,target,i+1,list);
    }
}

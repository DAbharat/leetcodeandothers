package Recursion.Array;

import java.util.ArrayList;

public class ALwithoutargs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        System.out.println(findallindex(arr,4,0));
    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length) return list;
        if(arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ans = findallindex(arr,target,i+1);
        list.addAll(ans);
        return list;
    }
}

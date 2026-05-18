package STRIVERSHEET.Array;

import java.util.ArrayList;

public class smallestAndSecondSmallestElementsInArray {
    public ArrayList<Integer> smallestAndSecondSmallestElementsInArray(int [] array){
        ArrayList<Integer> list = new ArrayList<>();

        int min =Integer.MAX_VALUE;
        int secondMin=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]< min){
                min=array[i];
            }
            else if(array[i]<secondMin && array[i]!=min){
                secondMin=array[i];
            }
        }
        if(secondMin==Integer.MIN_VALUE){
            list.add(-1);
        }else {
            list.add(min);
            list.add(secondMin);
        }
       return list;
    }
}

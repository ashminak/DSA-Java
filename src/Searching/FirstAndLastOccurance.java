package Searching;
// class Solution {
//     ArrayList<Integer> find(int arr[], int x) {
//         // code here
//         int firstIndex =-1;
//         int lastIndex =-1;

//         int start = 0; int end = arr.length-1;
//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(arr[mid]==x){
//                 firstIndex = mid;
//                 end = mid-1;
//             }else if(arr[mid]<x){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }

//          start = 0;end = arr.length-1;
//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(arr[mid]==x){
//                 lastIndex = mid;
//                 start = mid+1;
//             }else if(arr[mid]<x){
//                 start = mid-1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(firstIndex);
//         list.add(lastIndex);

//          return list;
//     }
// }

import java.util.ArrayList;

class FirstAndLastOccurance {
    ArrayList<Integer> find(int arr[], int x) {
        int firstIndex = -1;
        int lastIndex = -1;

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                firstIndex = mid;  // tentatively save
                lastIndex = mid;   // tentatively save

                // Expand LEFT to find first occurrence
                int left = mid - 1;
                while (left >= start && arr[left] == x) {
                    firstIndex = left;
                    left--;
                }

                // Expand RIGHT to find last occurrence
                int right = mid + 1;
                while (right <= end && arr[right] == x) {
                    lastIndex = right;
                    right++;
                }

                break; // Found x, no need to continue

            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(firstIndex);
        list.add(lastIndex);
        return list;
    }
}
public class Sorting {
    static void sort (int algorithmID, int[] arr){
        switch (algorithmID){
            case 2:
                insertionSort(arr);
                break;
        }
    }
// algoritm ID = 1 => selection sort
// algoritm ID = 2 => insertion sort
// algoritm ID = 3 => shell sort
// algoritm ID = 4 => quick sort
// algoritm ID = 5 => merge sort
// algoritm ID = 6 => radix sort

//create sort algorithm functions for each 
//include their switch cases in the sort function following numbering of the above comment 
    static void insertionSort(int [] arr){
        int n = arr.length;
        for(int i = 1; i<n;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
     
}

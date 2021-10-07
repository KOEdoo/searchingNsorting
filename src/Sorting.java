public class Sorting {
    static void sort (int algorithmID, int[] arr){
        switch (algorithmID){
            case 1:
                selectionSort(arr);
                break;
            case 2:
                insertionSort(arr);
                break;
            case 3:
                shellShort(arr);
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
    static void selectionSort(int[] arr){
        int n = arr.length;      
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
     
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

    static void shellShort(int[] arr){
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {         
            for (int i = gap; i < n; i += 1)
            {              
                int temp = arr[i];               
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
    }
}


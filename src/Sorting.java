public class Sorting {
    static void sort (int algorithmID, int[] arr){
        switch (algorithmID){
            case 2:
                insertionSort(arr);
                break;
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
}

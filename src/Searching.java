public class Searching {
    static int search(int[] arr, int key){
        return 0;
    }
    static int linearSearch(int[] arr,int key){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(key == arr[i]){
                return key;
            }
        }
        return -1;
    }
}

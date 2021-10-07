public class Searching {
    static String search(int algorithmID, int[] arr, int key){
        int solution = 0;
        String answer = "";
        switch(algorithmID){
            case 1:
                solution = linearSearch(arr, key);
                break;
            case 2:
                solution = binarySearch(arr, key);
                break;
        }
        if(solution==-1){
            answer = "key cannot be found in array\n";
        }
        else if(solution==-2){
            answer = "cannot implement binary sort on unsorted array\n";
        }
        else{
            answer = Integer.toString(solution) + " was found\n";
        }
        
        return answer;
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
    static int binarySearch(int[] arr, int key){
        int n = arr.length;
        if(isSorted(arr, n)){
            // insert binary sort algorithm here
        }
        return -2;
    }
    static boolean isSorted(int [] arr, int n){
        if (n == 0 || n == 1){
            return true;
        }
        for (int i=1; i<n;i++){
            if (arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}

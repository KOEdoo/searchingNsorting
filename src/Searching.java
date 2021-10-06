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
            answer = "key cannot be found in array";
        }
        else{
            answer = Integer.toString(solution) + "was found";
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
        return -1;
    }
}


import java.util.*;
import java.util.regex.*;
public class Sample{
    public static void main(String[] args){
        

    }
    int removeDuplicates(int arr[], int n) {
        if(n == 0 || n == 1)
            return n;
        sort(arr, arr+n);
        int temp[n];       
        int i = 0, j = 0;      
        temp[j++] = arr[i++];
        for( ; i<n; i++){
            if(arr[i] != arr[i-1]){
                temp[j++] = arr[i];
            }
        }
        for(i=0; i<j; i++){
                arr[i] = temp[j];
        }
        return j;
    }
}

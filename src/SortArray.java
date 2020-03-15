import java.util.ArrayList;

public class SortArray {

    public static void main(String[] args) {

        int arr[]={0,1,0,0,0,1,0,1,1};

        for(int i = 0, j=i+1; i < arr.length && j<arr.length;)
        {
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i=0;
                j=i+1;
            }
            else
            {
                i++;
                j++;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}

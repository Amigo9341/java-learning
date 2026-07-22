package MyFirstProject;

public class ab {
    public static void main(String[] args) {
        
        int[] arr = {10, 0, 0, 14, 16};
        int curr = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                curr++;

                if (arr[curr] == 0){
                    swap(arr, i, curr);
                }
            }
        }

        for (int nu : arr) {
            System.out.print(nu + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}

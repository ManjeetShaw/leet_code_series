import java.util.Scanner;
public Class BubbleSort{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numnber of elements");
        int n = sc.nextInt();
        int arr = new int[n];
        System.out,println("Enter"+ n + "elements");
        for (i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1;i++){
            for(int j = 0;J<n-1; j++{
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j=1];
                    arr[j+1] = temp;
                }
            })
        }
        Syatem.out.println("Sorted array");
        for(int i = 0; i<n; i++){

        }
        sc.close();
    }
}
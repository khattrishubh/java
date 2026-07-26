import java.util.Scanner;
public class binary
 {
    public static int binarysearch(int numbers[], int key)
    {
        int start=0;
        int end = numbers.length-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
            if( numbers[mid]<key)
            {
                start= mid+1;
            }
            else 
            {
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        binary obj = new binary();
        int result = obj.binarysearch(numbers, key);

        System.out.println("The index is: " + result);
    }
}
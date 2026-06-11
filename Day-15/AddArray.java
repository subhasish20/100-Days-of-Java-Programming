import java.util.Scanner;

public class AddArray
{
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array 1 and the array 2");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

            if(size1 != size2){
                System.out.println("Both array size is not same ");
                System.exit(0);
            }

        System.out.println("Enter the element of the array 1 :");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the array 2 :");
        for (int i = 0; i < size1; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("The sum of the elements are :");
        for(int i = 0; i < size1 ; i++)
        {
            System.out.printf("%d   ",array1[i]+array2[i]);
        }
        
    }
}
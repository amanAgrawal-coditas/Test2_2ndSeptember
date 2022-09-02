package Test2_2ndSeptember;

import java.util.*;
import java.util.Arrays;

class menu
{
    boolean loop=true;
    int input, numberOfElements ;

    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    void display()
    {
        while(loop==true) {
            System.out.println("Press 1 to input the number of objects");
            System.out.println("Press 2 to show the array");
            System.out.println("press 3 to reverse and sort the array");
            System.out.println("press 4 to exit ");
            input = sc.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Enter the elements");
                    for (int index = 0; index < arr.length; index++)
                    {
                        arr[index] = sc.nextInt();
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("The elements in the array are");
                    for (int index = 0; index < numberOfElements; index++)
                    {
                        System.out.println(arr[numberOfElements]);
                    }
                    break;
                }
                case 3: {
                    System.out.println("the sorted array is");
                    Arrays.sort(arr);
                    System.out.println("the array in descending order is");

                    for (int index = arr.length; index >= 0; index--) {
                        System.out.println(arr[index]);
                    }
                    break;
                }
                case 4: {
                    loop=false;
                    break;
                }
                default: {
                    System.out.println("invalid number");
                    break;
                }
            }
        }
    }

}
public class Test2_2ndSepetember {
    public static void main(String[] args) {
        menu menu=new menu();

        menu.display();

    }
}

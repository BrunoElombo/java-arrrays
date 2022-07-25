import java.util.Collections;
import java.util.Scanner;

/*
* JAVA Arrays
* What I need to Know about Java arrays
* They are a collection
* they contain data of the same type
* They have a fix size, they are mutable
* They can be access with the help of indexes starting from 0...n-1
* */
public class JavaArrays {

    public static void main(String[]args){
//        Defining an array in JAVA
//        JavaArrays.arrays();
        JavaArrays.contactForm();

    }

    public static void arrays(){
//        int arr[];
//        String arr[] = new String[10];
        int[] arr = new int[100];
        int[] arr2 = new int[10];
        int[] numbers = {1,2,3,4,5,6};

        for(int number : numbers){
            System.out.printf("%d ",number);
        }
    }

    public static void contactForm(){

        int[] phoneNum = new int[10];
        String[] contactName = new String[phoneNum.length];
        int phoneIndex = 0;
        int nameIndex = 0;

        Scanner phone = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        System.out.println("Enter the phone number :");
        if(phoneIndex == phoneNum.length){
            System.out.println("Limit number of numbers to enter is reached.");
        }else{
            phoneNum[phoneIndex] = phone.nextInt();
            System.out.println("Enter the contact name :");
            contactName[nameIndex] = name.nextLine();
        }

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(valid());
    }
     public static String valid(){   Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.nextLine();
        String strArr[]=num.split("");
        int[] numbers = new int[strArr.length];
        int[] twiceNumbers = new int [strArr.length/2];
        int counter = 0;
        int res =0;
        for (int i = 0; i<strArr.length; i++) numbers[i] = Integer.parseInt(strArr[i]);
        for (int i=0;i< numbers.length;i=i+2) {

            twiceNumbers[counter] = numbers[i]*2;
            if (twiceNumbers[counter]>=10) twiceNumbers[counter]=twiceNumbers[counter]-9;
            res+=twiceNumbers[counter];
            counter++;

        }
        for (int i=1;i < numbers.length;i=i+2) res+=numbers[i];
        return (res % 10 == 0) ? "The number is entered correctly!" : "ERROR! Number entered incorrectly.";
    }
}
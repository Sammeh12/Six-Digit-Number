import java.util.Scanner;

public class SixDigitNumber {

    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            Scanner scnnr = new Scanner(System.in);
            System.out.print("Enter a 6-digit number: ");
            String num = scnnr.nextLine();

            char lastNum = num.charAt(5);
            char newNum1 = num.charAt(0);
            char newNum2 = num.charAt(1);
            char newNum3 = num.charAt(2);
            char newNum4 = num.charAt(3);
            char newNum5 = num.charAt(4);

            String strNewNums = newNum1 + "" + newNum2 + "" + newNum3 + "" + newNum4 + "" + newNum5;
            String strLastNum = lastNum + "";

            int cnvrtNewNums = Integer.parseInt(strNewNums);
            int cnvrtNewLastNum = Integer.parseInt(strLastNum);
            int rmndrNum = cnvrtNewNums % 7;
            if (rmndrNum == cnvrtNewLastNum) {
                boolean equal = true;
                System.out.println(equal);
            } else {
                boolean equal = false;
                System.out.println(equal);
            }
            i++;
        }
    }

}

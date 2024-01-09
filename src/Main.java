import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polindrom Sayı");
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
        System.out.println("Mükemmel Sayı");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("Sayıları kelimelere Böl");
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(-12));


        System.out.println(numberToWords(-12));

        System.out.println("case 4:" + getFirstAndLastDigitSum(123));

    }

    public static boolean isPalindrome(int number) {
        number =Math.abs(number);
        char[] digits=String.valueOf(number).toCharArray();
        //TODO 122=>221

        String reversed="";
        for(int i=digits.length-1 ; i>=0;i--){
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));

    }

//    public static boolean isPalindrome2(int number){
//       number=Math.abs(number);
//       int orgNumber=number;
//       int reversNumber=0;
//
//       while (number>0){
//
//       }
//    }

    //-------------------------------------------------------------------------------------------
    public static boolean isPerfectNumber(int num){
        if(num <=0){
            return false;
        }
        int total=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) total += i;
        }
        return num == total;
    }

    public static boolean isPerfectNumber1(int number) {
        if (number <= 2)
            return false;
        int total = 1;
        int highest = (int) Math.sqrt(number) + 1;

        for (int i = 2; i < highest; i++) {
            if (number % i == 0) {
                total += i;
                if (i != number / i)
                    total += number / i;
            }
        }
        return total == number;
    }

    public static String numberToWords(int sayi){
        if(sayi<0) return "Invalid Value";

       char[] digits= String.valueOf(sayi).toCharArray();
       String numToText="";
       for(char digit:digits){
           switch (digit){
               case '0':
                   numToText += "Zero ";
                   break;
               case '1':
                   numToText += "One ";
                   break;
               case '2':
                   numToText += "Two ";
                   break;
               case '3':
                   numToText += "Three ";
                   break;
               case '4':
                   numToText += "Four ";
                   break;
               case '5':
                   numToText += "Five";
                   break;
               case '6':
                   numToText += "Six ";
                   break;
               case '7':
                   numToText += "Seven ";
                   break;
               case '8':
                   numToText += "Eight ";
                   break;
               case '9':
                   numToText += "Nine ";
                   break;
           }

       }
        return numToText.trim();
    }


    // 321=4 ,   123 = 4, 123456=9
    public static int getFirstAndLastDigitSum(int number){
        char[] digits=String.valueOf(number).toCharArray();
        return Integer.parseInt(String.valueOf(digits[0]))+Integer.parseInt(String.valueOf(digits[digits.length-1]));
    }
}

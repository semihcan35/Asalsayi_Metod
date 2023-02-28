import java.util.Scanner;

public class Main {
    public static boolean asal(int number , int i ) {
        if(number<=1){
            return false;
        }
        if(i==1){
            return true;
        }
        if(number%i==0){
            return true;
        }
        return asal(number,i-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Sayıyı giriniz:");
        number= input.nextInt();
        int i = number / 2;


        if(asal(number,i)){
            System.out.println("Asal sayıdır.");
        }else {
            System.out.println("Asal değildir.");
        }
    }
}
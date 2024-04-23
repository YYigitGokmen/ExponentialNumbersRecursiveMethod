

import java.util.Scanner;


public class ExponentialNumbersRecursive {
            static int exp (int taban,int  us){

                    if (taban == 1 || us == 0) return 1;

                    return taban*=exp(taban,us-1);

            }



 public static void main(String[] args) {

              Scanner scan = new Scanner(System.in);
              System.out.print("Taban Değerini Giriniz : ");
                int taban= scan.nextInt();

              System.out.print("Üs Değerini Giriniz : ");
                int us= scan.nextInt();
               System.out.println(exp(taban,us));
            }








}

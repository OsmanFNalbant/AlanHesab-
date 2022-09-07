import java.util.Scanner;
public class Alan {
    public static void main(String[] args)
    {
        int a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk kenar uzunlugu:");
        a = input.nextInt();
        System.out.println("Ikinci kenar uzunlugu:");
        b = input.nextInt();
        System.out.println("Ucuncu kenar uzunlugu:");
        c = input.nextInt();
        u=(a+b+c)/2;
        alan = u * (u-a) * (u-b) * (u-c);
        System.out.println("Alan:" +u);
            /* www.patika.dev */
        }
    }
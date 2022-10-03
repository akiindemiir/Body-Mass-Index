import java.util.Scanner;

public class vucutkitleendeksi {
    public static void main(String[] args) {
        double boy, kilo, formul;


        Scanner inp = new Scanner(System.in);

        System.out.println("Boyunuzu Metre Cinsinden Giriniz: ");
        boy = inp.nextDouble();

        System.out.println("Kilonuzu Kilogram Cinsinden Giriniz: ");
        kilo = inp.nextDouble();


        formul = kilo/(Math.pow(boy,2));

        System.out.println("Vücut Kitle Endeksiniz: " +formul);







    }
}
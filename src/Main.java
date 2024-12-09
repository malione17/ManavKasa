import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float boy,kilo,index;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextFloat();


        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextFloat();

        index = kilo / (boy * boy);
        System.out.printf("Vücut kitle indexiniz: %.2f\n",index);

    }
}
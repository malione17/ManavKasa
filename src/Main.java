import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       float armut,elma,domates,muz,patlican,toplam;
       Scanner input = new Scanner(System.in);
        System.out.print("armut kaç kilo ? : ");
        armut = input.nextFloat();
        System.out.print("elma kaç kilo ? : ");
        elma = input.nextFloat();
        System.out.print("domates kaç kilo ? : ");
        domates = input.nextFloat();
        System.out.print("muz kaç kilo ? : ");
        muz = input.nextFloat();
        System.out.print("patlıcan kaç kilo ? : ");
        patlican = input.nextFloat();
        toplam = (armut * 2.17f) + (elma * 3.67f) + (domates * 1.11f) + (muz * 0.95f) + (patlican * 5.00f);
        System.out.println("Toplam tutar : "+ toplam);
    }
}
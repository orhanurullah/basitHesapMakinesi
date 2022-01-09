import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double ilkSayi, ikinciSayi;
        int secenek;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin : ");
        ilkSayi = scanner.nextDouble();
        System.out.print("İkinci Sayıyı Girin : ");
        ikinciSayi = scanner.nextDouble();

        System.out.print("Yapmak İstediğiniz İşlemi Seçin.\n");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpam\n4-Bölme\n5-Mod");
        secenek = scanner.nextInt();

        switch (secenek){
            case 1:
                System.out.println("Sonuç : " + (ilkSayi + ikinciSayi));
                break;
            case 2:
                System.out.println("Sonuç : " + (ilkSayi - ikinciSayi));
                break;
            case 3:
                System.out.println("Sonuç : " + ilkSayi * ikinciSayi);
                break;
            case 4:
                System.out.println("Sonuç : " + ilkSayi / ikinciSayi);
                break;
            case 5:
                System.out.println("Sonuç : " + ilkSayi % ikinciSayi);
                break;
            default:
                break;

        }
    }
}

import java.util.Scanner;
public class proje1 {
    public static void main(String[] args) {
        int matematik , turkce , fizik , kimya , sanat , tarih , secmeli ;
        Scanner input=new Scanner(System.in);
        System.out.print("Matemetik Notunuzu Giriniz:");
        matematik= input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce= input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik= input.nextInt();

        System.out.print("Kimya  Notunuzu Giriniz:");
        kimya= input.nextInt();

        System.out.print("Sanat Notunuzu Giriniz:");
        sanat= input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih= input.nextInt();

        System.out.print("Seçemeli Ders Notunuzu Giriniz:");
        secmeli= input.nextInt();

        int toplam=(matematik + turkce + fizik + kimya + sanat + tarih + secmeli);
        double sonuc=toplam/7.0 ;
        System.out.println("ORTALAMANIZ :" + sonuc);

        boolean kosul1 = (sonuc<50);
        boolean kosul2 = (sonuc>=50);
        boolean durum=kosul1||kosul2;

        String str=durum?  "GEÇTİNİZ" : "KALDINIZ" ;
        System.out.println(str);
    }
}

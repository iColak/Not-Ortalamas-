package githubPatika;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        //Ortalamayı hesaplayalım
        double ortalama = (mat + fizik + kimya + tarih + turkce + muzik) / 6.0;
        System.out.println("Girilen notların ortalaması: " + ortalama);

        //Ortalama 60 tan küçük ise kaldı, büyük ve eşit ise geçti yazdıralım
        System.out.println(ortalama >= 60 ? "Geçti" : "Kaldı");




    }
}

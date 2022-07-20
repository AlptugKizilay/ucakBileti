import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double perKm = 0.10, tutar;
        double type2Discount = 0.8, ageUnder12Dis = 0.5, age12bt24Dis = 0.9, age65Dis = 0.7;
        boolean isHata;

        Scanner input = new Scanner(System.in);
        System.out.print("Yasiniz: ");
        age = input.nextInt();

        System.out.print("Gideceginiz mesafe(km): ");
        km = input.nextInt();
        System.out.println("Yolculuk tipini seciniz:\n1-Tek yön\n2-Gidis-Dönüs");
        type = input.nextInt();

        tutar = km * perKm;
        if (age < 0) {
            isHata = false;
        } else {
            if (type == 2) {
                km = km * 2;
                System.out.println("km: " + km);
                tutar = (km * perKm) * type2Discount;
                if (age < 12) {
                    tutar = tutar * ageUnder12Dis;
                    isHata = true;
                } else if (age <= 24) {
                    tutar = tutar * age12bt24Dis;
                    isHata = true;
                } else if (age >= 65) {
                    tutar = tutar * age65Dis;
                    isHata = true;
                } else {
                    isHata = true;
                }

            } else if (type == 1) {
                if (age < 12) {
                    tutar = tutar * ageUnder12Dis;
                    isHata = true;
                } else if (age <= 24) {
                    tutar = tutar * age12bt24Dis;
                    isHata = true;
                } else if (age >= 65) {
                    tutar = tutar * age65Dis;
                    isHata = true;
                } else {
                    isHata = true;
                }

            } else {
                isHata = false;
            }
        }


        if (isHata == false) {
            System.out.println("Hatali giriş yaptiniz!");
        } else {
            System.out.println("Ucret: " + tutar);
        }

















        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

    }
}
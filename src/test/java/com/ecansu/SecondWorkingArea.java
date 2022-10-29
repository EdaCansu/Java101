package com.ecansu;

import java.util.Scanner;

public class SecondWorkingArea {
    public static void main(String[] args) {
        // Karsilastirma operatorleri baslangic
        /* == Eşittir ( x == y )
        != Eşit Değildir ( x != y )
        > Büyüktür ( x > y )
        < Küçüktür ( x < y )
        >= Büyük Eşittir ( x >= y )
        <= Küçük Eşittir ( x <= y ) */
        // Karsilastirma operatorleri son

        // Mantiksal operatorler baslangic
        /*
        && VE (AND)
        || Veya (OR)
        ! Ters İşlem
        ? : Soru İşareti Operatörü (kosul ? "dogru" : "yanlis")
        */
        // Mantiksal operatorler son

        // if-else bloklari baslangic
        /* int a = 10, b = 20, c = 1;
        if ((a < b) && (a < c)) {
            System.out.println("A en küçük sayıdır.");
        } else if ((b < a) && (b < c)) {
            System.out.println("B en küçük sayıdır.");
        } else {
            System.out.println("C en küçük sayıdır.");
        }
        System.out.println("Programınız sonlandı!");*/
        // if-else bloklari son

        //switch case baslangic
        /* int day;
        Scanner takenDay = new Scanner(System.in);
        System.out.println("Lütfen bugünün kaçıncı gün olduğunu giriniz");
        day = takenDay.nextInt();
        switch (day){
            case 1:
                System.out.println("Bugün günlerden pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden salı");
                break;
            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerden pazar");
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz.");
        }
        System.out.println("Programınız bitmiştir."); */
        //switch case son

        //Hesap makinesi baslangic
        /*int n1, n2, select;
        Scanner number = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = number.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = number.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapılmasını istediğiniz işlemi seçiniz: ");
        select = number.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarm :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım :" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Bir sayı sıfıra bölünemez");
                } else {
                    System.out.println("Bölüm :" + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
        }*/
        //Hesap makinesi son

        //Parola sorgulama baslangic (integer parola)
        /* int p1, p2, select;
        Scanner password = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        p1 = password.nextInt();
        int userPassword = 12;

        if (p1 == userPassword) {
            System.out.println("Şifre kabul edildi.");
        }else {
            System.out.println("Şifrenizi değiştirmek ister misiniz? \n1-isterim\n2-istemem");
            select = password.nextInt();
            if (select == 1){
                System.out.println("Yeni bir şifre oluşturun");
                p2 = password.nextInt();
                if (p2 == userPassword) {
                    System.out.println("Şifre oluşturulamadı, tekrar deneyiniz.");
                } else {
                    System.out.println("Yeni şifre oluşturuldu.");
                }
            } else {
                System.out.println("İyi günler");
            }
        }
        System.out.println("Program sonlanmıştır.");*/
        //Parola sorgulama son

        //Parola sorgulama baslangic (String parola)
        /* String userName, password, userName1;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();
        userName1 = "kullanici1";

        if (userName.equals(userName1) && password.equals("parola123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Hatalı bilgi girdiniz!");
        } */
        //Parola sorgulama son

        //Sınıf gecme durumu baslangic
        /* int not1, ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen notunuzu giriniz: ");
        not1 = inp.nextInt();
        ort = 0;
        if((not1 >= 55) && (not1 > 0) && (not1 < 100)){
            ort = ort + not1;
            System.out.println("Sınıfı geçtiniz!");
            System.out.println("Sınıf Ortalaması: " + ort);
        } else if ((not1 <= 55) && (not1 > 0) && (not1 < 100)){
            ort = ort + not1;
            System.out.println("Üzgünüz, sınıfı geçemediniz!");
            System.out.println("Sınıf Ortalaması: " + ort);
        } else {
            System.out.println("Hatalı değer girdiniz, tekrar deneyiniz.");
        } */
        //Sınıf gecme son

        //Hava sıcaklığına göre etkinlik önerme başlangıç
        /*int degree;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        degree = inp.nextInt();

        if(degree <= 5) {
            System.out.println("Tam kayak yapmalık hava!");
        } else if (degree <= 15) {
            System.out.println("Evde film keyfi :)");
        } else if (degree <= 20) {
            System.out.println("Arkadaşlarla buluşmaya hazır mısın?");
        } else if (degree <= 25 ) {
            System.out.println("Parklar, bahçeler seni bekliyor!");
        } else if (degree > 25) {
            System.out.println("Haydi denize!!");
        } */
        //Hava sıcaklığına göre etkinlik önerme son

        //Sayı sıralama başlangıç
        /* int n1, n2, n3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        n2 = inp.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        n3 = inp.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1);
            if (n2 > n3){
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1 + " > " + n2 + " > " + n3);
            } else {
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1 + " > " + n3 + " > " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
            if (n1 > n3){
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2 + " > " + n1 + " > " + n3);
            } else {
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
        } else {
            System.out.println(n3);
            if (n1 > n2){
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3 + " > " + n1 + " > " + n2);
            } else {
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3 + " > " + n2 + " > " + n1);
            }
        } */
        //Sayı sıralama son

        //Burç bulma başlangıç
        /* int bDay, month;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        month = inp.nextInt();
        System.out.print("Lütfen doğduğunuz günü giriniz: ");
        bDay = inp.nextInt();


        switch (month){
            case 1:
                if (bDay < 22) {
                    System.out.println("Burcunuz: Oğlak!");
                } else {
                    System.out.println("Burcunuz: Kova!");
                }
                break;
            case 2:
                if (bDay < 20) {
                    System.out.println("Burcunuz: Kova!");
                } else {
                    System.out.println("Burcunuz: Balık!");
                }
                break;
            case 3:
                if (bDay < 21) {
                    System.out.println("Burcunuz: Balık!");
                } else {
                    System.out.println("Burcunuz: Koç!");
                }
                break;
            case 4:
                if (bDay < 21) {
                    System.out.println("Burcunuz: Koç!");
                } else {
                    System.out.println("Burcunuz: Boğa!");
                }
                break;
            case 5:
                if (bDay < 22) {
                    System.out.println("Burcunuz: Boğa!");
                } else {
                    System.out.println("Burcunuz: İkizler!");
                }
                break;
            case 6:
                if (bDay < 23) {
                    System.out.println("Burcunuz: İkizler!");
                } else {
                    System.out.println("Burcunuz: Yengeç!");
                }
                break;
            case 7:
                if (bDay < 23) {
                    System.out.println("Burcunuz: Yengeç!");
                } else {
                    System.out.println("Burcunuz: Aslan!");
                }
                break;
            case 8:
                if (bDay < 23) {
                    System.out.println("Burcunuz: Aslan!");
                } else {
                    System.out.println("Burcunuz: Başak!");
                }
                break;
            case 9:
                if (bDay < 23) {
                    System.out.println("Burcunuz: Başak!");
                } else {
                    System.out.println("Burcunuz: Terazi!");
                }
                break;
            case 10:
                if (bDay < 23) {
                    System.out.println("Burcunuz: Terazi!");
                } else {
                    System.out.println("Burcunuz: Akrep!");
                }
                break;
            case 11:
                if (bDay < 22) {
                    System.out.println("Burcunuz: Akrep!");
                } else {
                    System.out.println("Burcunuz: Yay!");
                }
                break;
            case 12:
                if (bDay < 22) {
                    System.out.println("Burcunuz: Yay!");
                } else {
                    System.out.println("Burcunuz: Oğlak!");
                }
                break;
            default:
                System.out.println("Hatalı bilgi girdiniz:");
        } */
        //Burç bulma son

        //Uçak bileti fiyatı hesaplama başlangıç
        /* double km, pricePerKm, total, kidPrice, youngPrice, oldPrice;
        int age, type;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen kaç km gideceğinizi giriniz: ");
        km = inp.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz: ");
        age = inp.nextInt();
        System.out.print("Lütfen yolculuk tipinizi yazınız. Tek yön için \"1\", gidiş-dönüş için \"2\" yazınız. ");
        type = inp.nextInt();

        pricePerKm = 0.10;
        total = km *  pricePerKm;
        kidPrice = total / 2;
        youngPrice = (9 * total) / 10;
        oldPrice = (7 * total) / 10;

        boolean isError = false;

        if (km < 0 || age < 0 || type < 1 || type >2) {
            isError = true;
        } else {
            isError = false;
        }

        if (isError) {
            System.out.println("Hatalı bilgi girdiniz. Lütfen tekrar deneyiniz.");
        } else {
            if (type == 1) {
                if (age < 12) {
                    System.out.println("Toplam ücret: " + kidPrice);
                } else if (age > 12 && age < 24) {
                    System.out.println("Toplam ücret: " + youngPrice);
                } else if (age >= 25 && age <= 65) {
                    System.out.println("Toplam ücret: " + total);
                } else if (age > 65) {
                    System.out.println("Toplam ücret: " + oldPrice);
                }
            }
            if (type == 2){
                if (age < 12){
                    kidPrice -= kidPrice * 0.2;
                    kidPrice *= 2;
                    System.out.println("Toplam ücret: " + kidPrice);
                } else if (age > 12 && age < 24){
                    youngPrice -= youngPrice * 0.20;
                    youngPrice *= 2;
                    System.out.println("Toplam ücret: " + youngPrice);
                } else if (age >= 25 && age <= 65) {
                    total -= total * 0.2;
                    total *= 2;
                    System.out.println("Toplam ücret: " + total);
                } else if (age > 65) {
                    oldPrice -= oldPrice * 0.2;
                    oldPrice *= 2;
                    System.out.println("Toplam ücret: " + oldPrice);
                }
            }
        } */
        //Uçak bileti fiyatı hesaplama son

        //Çin zodyağı hesaplama başlangıç
        /*int bYear, zodiac;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı dört haneli olacak şekilde yazınız?");
        bYear = input.nextInt();
        zodiac = bYear % 12;

        switch (zodiac) {
            case 0:
                System.out.println("Çin zodyağı burcunuz: maymun");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz: horoz");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz: köpek");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz: domuz");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz: fare");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz: öküz");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz: kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz: tavşan");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz: ejderha");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz: yılan");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz: at");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz: koyun");
                break;
            default:
                System.out.println("Hatalı bilgi girdiniz.");
                break;
        } */
        //Çin zodyağı hesaplama son

        //Artık yıl hesaplama başlangıç

        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sorgulamak isttediğiniz yılı giriniz: ");
        year = inp.nextInt();
        boolean isError = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isError = false;
                } else {
                    isError = true;
                }
            } else {
                isError = false;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println(year + " bir artık yıl değildir.");
        } else {
            System.out.println(year + " bir artık yıldır.");
        }

        //Artık yıl hesaplama son
    }
}

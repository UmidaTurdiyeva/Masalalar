// import java.util.Scanner;

public class Integer1 {
   
    public static void main(String[] args) {
        // integer30();
        // Integer29();
        // integer28();
        // integer27();
        // integer26();
        // integer25();
        // integer24();
        // integer23();
        // integer22();
        // integer21();
        // integer20();
        // integer19();
        // integer18();
        // integer17();
        // integer16();
        // integer15();
        // integer14();
        // integer13();
        // integer12();
        // integer11();
        // integer10();
        // integer9();
        // integer8();
        // integer7();
        // integer6();
        // integer5();
        // integer4();
        integer3();
        integer2();
        integer1();
    }

    // Integer30. Qaysidir yil berilgan. 
    // Beilgan yilning qaysi yuz yillikka kirishishini 
    // aniqlovchi programma tuzilsin.
    public static void integer30(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Yil kiriting:");
        // double Y = sc.nextInt(); 
        // double yil = (Y/100)+1 ;
        // System.out.printf("%.0f", yil);
        int yil = 1901;
        double asr = (yil/100)+1;
        System.out.printf( "%.0f", asr);
    }

    // Integer29. a, b, c butun sonlar berilgan. 
    // Tomonlari a va b bo'lgan to'g'ri to'rtburchak
    // tomoni c bo'lgan kvadrat eng ko'p joylashtirilsin
    // to'g'ri to'rtburchakka eng ko'p joylashgan  
    // kvadratlar soni va joylashmay qolgan qismi yuzasini
    // aniqlovchi programma tuzilsin.
    public static void Integer29() {
        int a = 5;
        int b = 10;
        int c = 2;
        double turtYuzi = a * b;
        double kavdYuzi = c * c;
        double kvadSoni = (a/c)*(b/c);
        double kavdlarYuzi = kavdYuzi * kvadSoni ;
        double qolganYuza = turtYuzi - kavdlarYuzi;
        System.out.printf( " %.0f  %.0f", kvadSoni, qolganYuza );

    } 

    // Integer28.Birinchi yanvar n-hafta kunidan boshlanadi(n э [1;7]), 
    // hafta kunlari quyidagicha nomerlangan bo'lsa:
    // 1- dushanba
    // 2- seshanba
    // 3- chorshanba
    // 4- payshanba
    // 5- juma
    // 6- shanba
    // 7- yakshanba
    // bo'lsa, berilgan k (1-365) butun sonini yilning kuni
    //  deb hisoblab u haftaning qaysi kuniga to'g'ri kelishi aniqlansin.
    public static void integer28() {
        int k = 100;
        int n = 3;
        double weekDay = (k+(n-1))%7;
        System.out.printf("%.0f", weekDay);
    }

    //Integer27. 1-yanvar shanba bo'lib, hafta kunlari quyidagicha nomerlangan bo'lsa:
    // 1- dushanba
    // 2- seshanba
    // 3- chorshanba
    // 4- payshanba
    // 5- juma
    // 6- shanba
    // 7- yakshanba
    // bo'lsa, berilgan k (1-365) butun sonini yilning kuni
    // deb hisoblab u haftaning qaysi kuniga to'g'ri kelishi aniqlansin.
    public static void integer27() {
        int k = 100;
        double weekDay = (k+5)%7;
        System.out.printf("%.0f", weekDay);
    }

    // Integer26. 1-yanvar seshanba bo'lib, hafta kunlari quyidagicha nomerlangan bo'lsa:
    // 1- dushanba
    // 2- seshanba
    // 3- chorshanba
    // 4- payshanba
    // 5- juma
    // 6- shanba
    // 7- yakshanba
    // bo'lsa, berilgan k (1-365) butun sonini yilning kuni
    // deb hisoblab u haftaning qaysi kuniga to'g'ri kelishi aniqlansin.
    public static void integer26() {
        int k = 100;
        double weekDay = (k+6)%7 + 1;
        System.out.printf("%.0f", weekDay);
    }

    //Integer25. 1-yanvar payshanba bo'lib, hafta kunlari quyidagicha nomerlangan bo'lsa:
    // 1- dushanba
    // 2- seshanba
    // 3- chorshanba
    // 4- payshanba
    // 5- juma
    // 6- shanba
    // 7- yakshanba
    // bo'lsa, berilgan k (1-365) butun sonini yilning kuni
    // deb hisoblab u haftaning qaysi kuniga to'g'ri kelishi aniqlansin.
    public static void integer25() {
        int k = 100;
        double weekDay = (k+3)%7;
        System.out.printf("%.0f", weekDay);
    }

    //Integer24. 1-yanvar dushanba bo'lib, hafta kunlari quyidagicha nomerlangan bo'lsa:
    // 1- dushanba
    // 2- seshanba
    // 3- chorshanba
    // 4- payshanba
    // 5- juma
    // 6- shanba
    // 7- yakshanba
    // bo'lsa, berilgan k (1-365) butun sonini yilning kuni
    // deb hisoblab u haftaning qaysi kuniga to'g'ri kelishi aniqlansin.
    public static void integer24() {
        int k = 100;
        double weekDay = k%7;
        System.out.printf("%.0f", weekDay);
    }

    // Integer23. kun boshidan  n sekund o'tdi, kun boshidan boshlab 
    // qancha soat, minut va sekund- o'tgani aniqlansin.
    public static void integer23() {
       float s = (float) 7270.0; 
       int min = (int) s/60;
       int soat = (int) s/60/60;
       int qoldiqMin = min - (soat*60);
       int qoldiqSek = (int)s - (min*60);
       System.out.println(soat + " soat " + qoldiqMin + " min " + qoldiqSek + " sek");
    }

    // Integer22. Kun boshidan boshlab  sekund vaqt o'tdi, kun boshidan boshlab qancha soat va sekund o'tganini hisoblang
    public static void integer22() {
        float s = (float) 3680.0; 
        // int min = (int) s/60;
        int soat = (int) s/60/60;
        int qoldiqSek = (int)s - soat*60*60;
        System.out.println(soat + " soat "  +  qoldiqSek + " sek");
    }

      // Integer21.  Kun boshidan boshlab  sekund vaqt o'tdi, kun boshidan boshlab qancha minut va sekund o'tganini hisoblang
    public static void integer21() {
        float s = (float) 306.0; 
        int min = (int) s/60;
        int qoldiqSek = (int) s - (min*60);
        System.out.println( min + " minut " + qoldiqSek + " sekund");
     }
   
     // Integer20.  Kun boshidan boshlab  sekund vaqt o'tdi, kun boshidan boshlab qancha to'la soat o'tganini hisoblang
    public static void integer20() {
        float s = (float) 7230.0; 
        int soat = (int) s/60/60;
        System.out.println( soat + " soat ");
     }
    
    // Integer19.  Kun boshidan boshlab  sekund vaqt o'tdi, kun boshidan boshlab qancha to'la minut o'tganini hisoblang
    public static void integer19() {
        float s = (float) 306.0; 
        int min = (int) s/60;
        System.out.println( min + " minut ");
     }

    //  Integer18. 999 dan katta bo'lgan son berilgan. Bir martta bo'lib butunni va bo'lib qoldiqni olish operatsiyasidan 
    // foydalanib berilgan sonni mingliklar xonasidagi sonni aniqlovchi programma tuzilsin.
    public static void integer18() {
        int n = 8562;
        int s = n/1000;
        System.out.println(s);       
    }
 
    //  Integer17. 999 dan katta bo'lgan son berilgan. Bir martta bo'lib butunni va bo'lib qoldiqni olish operatsiyasidan
    //  foydalanib berilgan sonni yuzliklar xonasidagi sonni aniqlovchi programma tuzilsin.
    public static void integer17() {
        int n = 8562;
        int s = (n/100)%10;
        System.out.println(s);       
    }

    // Integer16. uch xonali son bberilgan. Uning o'nliklar xonasidagi raqam bilan birliklar xonasidagi raqamni
    // almashtirishdan hosil bo'lgan  sonni aniqlovchi programma tuzilsin.
    public static void integer16() {
        int abc = 123;
        int a = abc/100;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        int yangi = (a*100) + (c*10) + (b);
        System.out.println(a + " " + b + " " + c + " " + " yangi hosil bo'lgan son " + yangi );
    }

    // Integer15. kirish = 123 natija = 213;
    public static void integer15() {
        int abc = 123;
        int a = abc/100;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        int yangi = (b*100) + (a*10) + (c);
        System.out.println(a + " " + b + " " + c + " " + " yangi hosil bo'lgan son " + yangi );
    }

    // Integer14. Uch xonali son berilgan. Uning o'ngdan birinchi raqamini o'chirib chap
    //  tarafdan yozishdan hosil bo'lgan sonni aniqlovchi programma tuzilsin.
    public static void integer14() {
        int abc = 123;
        int a = abc/100;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        int yangi = (c*100) + (a*10) + (b);
        System.out.println(a + " " + b + " " + c + " " + " yangi hosil bo'lgan son " + yangi );
    }

    // Integer13. Uch xonali son berilgan. Uning chapdan birinchi raqamini o'chirib o'ng
    //  tarafdan yozishdan hosil bo'lgan sonni aniqlovchi programma tuzilsin.
    public static void integer13() {
        int abc = 123;
        int a = abc/100;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        int yangi = (b*100) + (c*10) + (a);
        System.out.println(a + " " + b + " " + c + " " + " yangi hosil bo'lgan son " + yangi );
    }

    // Integer12. Uch xonali son berilgan.  Uning  raqamini teskari
    //  tartibda yozishdan hosil bo'lgan sonni aniqlovchi programma tuzilsin.
    public static void integer12() {
        int abc = 123;
        int a = abc/100;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        int yangi = (c*100) + (b*10) + (a);
        System.out.println(a + " " + b + " " + c + " " + " yangi hosil bo'lgan son " + yangi );
    }

    // Integer11.  Raqamlari yig'indisini aniqlovchi programma tuzing.
    public static void integer11() {
        int abc = 123;
        int a = abc/100;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        int yangi = b + a + c;
        System.out.println(yangi );
    }

    
    // Integer10. Uch xonali son berilgan. Oldin birliklar keyin o'nliklar 
    //  xonasidagi sonni chiqaruvchi programma tuzilsin.
    public static void integer10() {
        int abc = 123;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        System.out.println(c + "  " + b );
    }
    
    // Integer9. Uch xonali son berilgan. Yuzliklar 
    //  xonasidagi sonni chiqaruvchi programma tuzilsin.
    public static void integer9() {
        int abc = 123;
        int a = abc/100;
        System.out.println(a);
    }
    
    //integer8. Ikki xonali son berilgan. uning raqamlari o'rnini almashtirishdan hosil
    //  bo'lgan sonni aniqlovchi programma tuzilsin.
    public static void integer8() {
        int ab = 12;
        int a = ab / 10;
        int b = ab % 10;
        int son = b * 10 + a;
        System.out.println(son);
    }

    //Integer7. Ikki xonali son berilgan. Uning raqamlarini yig'indisini toping
    public static void integer7() {
        int ab = 12;
        int a = ab / 10;
        int b = ab % 10;
        int son = b + a;
        System.out.println(son);
    }

    //Integer6. Ikki xonali son berilgan. Uning avval o'nliklar, so'ng birliklar
    // xonasidagi raqamlarni chiqaring.
    public static void integer6() {
        int ab = 12;
        int a = ab / 10;
        int b = ab % 10;
        System.out.println(a + " " + b);
    }

    // Integer5. A va B (A > B) musbat son berilgan. A kesmada B kesmani necha martta joylashtirish mumkin.
    // A kesmada  B kesmaning joylashmagan qismini aniqlovchi programma tuzing.
    public static void integer5() {
        int a = 15;
        int b = 2;
        int kesma = a / b; 
        int kesmaUzun = kesma * b;
        int qoldiq = a - kesmaUzun;
        System.out.println(qoldiq);
    }  

    // Integer4. A va B (A > B) musbat son berilgan. A kesmada B kesmani necha martta joylashtirish 
    // mumkinligini aniqlovchi programma tuzing.
    public static void integer4() {
        int a = 15;
        int b = 2;
        int kesma = a / b; 
        System.out.println(kesma);
    } 

    // Integer3. Faylning hajmi baytlarda berilgan. To'liq kilobaytlarda ifodalang.
    private static void integer3() {
        int b = 8192;
        int kb = b / 1024;
        System.out.println(kb);
    }

   // Integer2. M kilogramm berilgan. To'liq tonnalarda ifodalang.
   private static void integer2() {
    int m = 192;
    int t = m / 1000;
    System.out.println(t);
}
   // Integer1. Uzunlik sm larda berilgan. To'liq metrlarda ifodalang.
   private static void integer1() {
    int sm = 81;
    int m = sm / 100;
    System.out.println(m);
}


}

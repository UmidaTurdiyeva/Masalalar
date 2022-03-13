// import java.lang.reflect.Method;
import java.util.Scanner;
// import java.util.function.Function;

public class Begin1{
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // begin1();
        // begin2();
        // begin3();   
        // begin4();
        // begin5();  
        // begin6(); 
        // begin7();
        // begin8();
        // begin9();
        // begin10();
        // begin11();
        // begin12();
        // begin13();
        // begin14();
        // begin15();
        // begin16();
        // begin17();
        // begin18();
        // begin19();
    }
    

// Begin1. Kvadratning tomoni berilgan. Perimetri topilsin.
    public static void begin1(){
            
        double a = 23.23; 
        double P = 4 * a;
        
        System.out.println(P);
        } 

// Begin2. Kvadratning tomoni berilgan. Yuzasi topilsin.

    public static void begin2(){
            
         double a = 3;
         double s = a * a;
    
        System.out.println(s); 
    } 

// Begin3.  To'g'ri to'rtburchakning tomolari berilgan. Uning yuzasi va perimetri topilsin. 
    public static void begin3() {
        double a = 4;
        double b = 4;
        double s = a * b;
        double p = (a + b) * 2;

        System.out.println(s + " " + p);
    }

// Begin4. Aylananing deametri berilgan. Uning uzunligi aniqlansin.
    public static void begin4() {
        double d = 45;
        final double p = 3.14;
        double  L = p * d;

        System.out.println(L);
    }

// Begin5. Kubning yon tomoni berilgan. Uning hajmi va to'la sirti aniqlansin.
    public static void begin5(){
        double a = 5;
        double V = a * a * a;
        double S = 6 * a * a;
        System.out.println( V + "  " + S);        
    }

// Begin6. Parallepipedning tomonlari a, b, c berilgan. Uning hajmi  va to'la sirti aniqlansin.  
    public static void begin6(){
        System.out.println("Son kiriting:");
        double a = sc.nextFloat(); 
        double b = sc.nextFloat(); 
        double c = sc.nextFloat(); 
        double V = a * b * c;
        double S = 2 * (a * b + c * a + b * c);
        System.out.println( V + "  " + S);
    }

// Begin7. Doiraning radiusi- R berilgan. Uning uzunligi L va yuzasi S aniqlansin.
    public static void begin7() {
       double R = 4;
       final double p = 3.14; 
       double L = 2 * p * R; 
       double S = p * R * R; 
       System.out.println(L + " " + S);
    }

// Begin8. Ikkita son a va b berilgan. Ularning o'rta arifmetigi topilsin.
    public static void begin8() {
       double a = 4; 
       double b = 5; 
       double arif = (a + b)/2;
       System.out.println(arif);
    }

// Begin9. Ikkita manfiy bo'lmagan son berilgan. Ularning o'rta geometrigi topilsin.
    public static void begin9() {
        double a = 4;
        double b = 4;
        if (a>0 && b>0){
            double geo = Math.sqrt(a * b);
            System.out.println(geo);
        }
    }

// begin10. Nolga teng bo'lmagan ikkita son berilgan. Ularning yig'indisi, ko'paytmasi va har birining kvadrati aniqlansin
    public static void begin10() {
       double a = 4;
       double b = 5;
       double sum  = a + b;
       double pow  = a * b;
       double powA2  = a * a;
       double powB2  = b * b;
       System.out.println(sum + " " + pow + " " + powA2 + " " + powB2);
    }

// begin11. Nolga teng bo'lmagan ikkita son berilgan. Ularning yig'indisi, ko'paytmasi va har birining moduli aniqlansin
    public static void begin11() {
       double a = 4;
       double b = 5;
       double sum  = a + b;
       double pow  = a * b;
       double modA = Math.abs(a);
       double modB = Math.abs(b);
       System.out.println(sum + " " + pow + " " + modA + " " + modB);
    }

// Begin12. To'rtburchakning katetlari berilgan. Uning gepotenuzasi va perimentrini toping
    public static void begin12() {
        double a = 4;
        double b = 5;
        double c = Math.sqrt(a*a + b*b);
        double P = a + b + c;
        System.out.println(c + " " + P);
    }

//  Begin13. Umumiy markazga bo'lgan ikkita aylana radiusi berilgan (R1 > R2). 
// Ularning yuzalari S1 va S2, ularning ayirmasi S3 aniqlansin.
public static void begin13() {
   final double p = 3.14;
   double R1 = 8;
   double R2 = 5;
   double S1 = p * R1; 
   double S2 = p * R2; 
   double S3 = p *(R1 - R2); 
   System.out.println(S1 + " " + S2 + " " + S3);
} 

// Begin14. Aylananing uzunligi L berilgan. Uning radiusi R va yuzasi S aniqlansin
public static void begin14() {
    double L = 7;
    final double p = 3.14;
    double R = L/(2*p);
    double S = p * R * R;
    System.out.println(R + " " + S);
}

// Begin15. Aylananing yuzasi berilgan. Uning deametri d va radiusi R aniqlansin.
public static void begin15() {
    final double p = 3.14;
    double S = 45;
    double R = Math.sqrt(S/p);
    double d = 2 * p * R;
    System.out.println(R + " " + d);
}

// Begin16. Sonlar o'qida ikkita nuqta orasidagi masofa aniqlansin.
public static void begin16() {
    double x1 = 5;
    double x2 = 9;
    double l = Math.abs(x2 - x1);
    System.out.println(l);
}

// Begin17. Sonlar o'qida A, B, C nuqtalar berilgan. AC va BC kesmalarning uzunligini
//  va kesmalar uzunligining yig'indisini  topuvchi programma tuzilsin.
public static void begin17() {
    double A = 5;
    double B = 15;
    double C = 9;
    double AC = Math.abs(C - A);
    double BC = Math.abs(C - B);
    double l = AC + BC;
    System.out.println(AC + " " + BC + " " + l);
}

// Begin18. Sonlar o'qida A, B, C nuqtalar berilgan. C nuqta A va B nuqtalar orasida joylashgan.
// AC va BC kesmalar uzunligining ko'paytmasi topilsin.
public static void begin18() {
    double A = 5;
    double B = 15;
    double C = 9;
    double AC = Math.abs(C - A);
    double BC = Math.abs(B - C);
    double pow = AC * BC;
    System.out.println(AC + " " + BC + " " + pow);
}

// Begin19. To'g'ri to'rtburchakning qarama-qarshi uchlari koorfinatalari berilgan.
// uning tomonlari koordinata o'qiga parallel.
// To'g'ri to'rtburchakning perimetri va yuzasi aniqlansin.
public static void begin19() {
    double x1 = 1;
    double y1 = 1;
    double x3 = 4;
    double y3 = 3;
    double a = Math.abs(x3-x1);
    double b = Math.abs(y3-y1);
    double P = 2 * (a + b);
    double S = a * b;
    System.out.println(P + " " + S);
}
    








}
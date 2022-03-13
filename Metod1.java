// import java.util.Scanner;

public class Metod1 {
//   private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        // mtod 1
        System.out.println(powA3(3));    
        //  metod2.        
        System.out.println(powA234(2.4 , 2));
        // metod3.
        arifGeo(5, 6);
        // metod4.
        triangle(5);
        // metod5.
        rectPS(2, 5, 3, 8);
        // metod6.
        digitCountSum(123);
        digitCountSum(456);
        digitCountSum(789);
        // metod7.
        invertDigit(321);
        invertDigit(654);
        invertDigit(987);
        // metod8.
        addRightDigit(123, 4);
        // metod9.
        addLeftDigit(234, 1);
        addLeftDigit(5678, 4);
        // metod10.
        swap(1, 2, 3, 4);
        // metod12.
        sortInc(6, 4, 5);
        // metod13.
        sortDec(6, 4, 5);
        // metod14.
        shiftRight(1, 2, 3);
        // metod15
        shiftLeft(1, 2, 3);
        // metod16.
        sign(4);
        sign(0);
        sign(-4);
        // metod17.
        rootsCount(1, -5, 6);
        rootsCount(1, -4, 4);
        rootsCount(1, 4, 6);
        // metod18.
        System.out.println(circleS(10));
        System.out.println(circleS(100));
        System.out.println(circleS(1));
        // metod19.
       System.out.println( ringS(4,2));
       System.out.println( ringS(2,1));
       System.out.println( ringS(3,2));
       // metod20.
       System.out.println(triangleP(3, 4));
       // metod21.
       sumRange(9, 6);
       sumRange(9, 20);
       // metod22.
       calc(8, 4, 1);    
       calc(8, 4, 2);    
       calc(8, 4, 3);    
       calc(8, 4, 4);    
       // metod23.
       quarter(2, 2);
       quarter(-2, 2);
       quarter(-2, -2);
       quarter(2, -2);
       // metod24.
       event(4);
       event(7);
       // metod25.
       isSquare(16);
       isSquare(10);
       // metod26.
       isPower5(45);
       isPower5(25);
       // metod27.
       isPowerN(25, 5);
       isPowerN(15, 5);
       // metod28.
       System.out.println("metod28");
       isPrime(11);
       isPrime(19);
       isPrime(119);
       // metod29.
       System.out.println("metod29");
       digitCount(123);
       digitCount(12);
       digitCount(1);
       // metod30.
       System.out.println("metod30");
       digitN(156, 3);
       digitN(156, 4);
       // metod31;
       System.out.println("metod31");
       isPalindrom(1234321);
       isPalindrom(231432);
       // metod31;
       // metod31;
       // metod31;
       // metod31;
       // metod31;









         // mtod37.
        // System.out.println(pow1(3, 5));   


    }

    // metod1.
    public static int powA3(int a ){
        return  a * a * a;
    }
    // metod2.
    public static  double powA234(  double son, double daraja) {
        return Math.pow(son, daraja);
    }
    // metod3.
    public static void arifGeo(int x, int y){
        double arif = (x+y)/2;  
        double geo = Math.sqrt(x * y); 
        System.out.println( " arif: " + arif + " geo: " + geo);   
    }
    // metod4.
    public static void triangle(double a) {
       double P = 3 * a;
       double S = Math.sqrt(3)/4 * (a * a); 
       System.out.println( " perimetr: " + P + " yuzi: " + S);   
    } 
    // metod5.
    public static void rectPS(double x1,double x2, double y1, double y2) {
       double a = Math.abs(x2 - x1);
       double b = Math.abs(y2 - y1);
       double P = 2 * (a + b);
       double S = a * b;
       System.out.println( " perimetr: " + P + " yuzi: " + S);   
    }
    // metod6.
    public static void digitCountSum(int x) {
        int soni = 0;
        int sum = 0;
        while(x > 0){
            double d = x % 10; // ohiridan bitta bitta hona ajratib olish
            sum+=d;
            x = x / 10; // xonasiga orqadan bittaga kamaygan yangi son
            soni++;

        }
        System.out.println(soni + " " + sum);
    }
    // metod7.
    public static void invertDigit(int x) {
        int teskari = 0;
         while (x>0) {
            teskari = teskari*10 + x%10;
            x = x/10;
        }
        System.out.println(teskari);
    }
    // metod8.
    public static void addRightDigit(int son, int r) {
       int newSon = son*10 + r;
       System.out.println(newSon); 
    }
    // metod9.
    public static void addLeftDigit(int x, int y) {
        int soni = 0;
        int s = 0;
        int x1 = x;
        while(x > 0){
            double d = x % 10;
            s = s*10;
            s+=d;
            x = x / 10;
            soni+=1;
        }
        double natija = y * Math.pow(10, soni) + x1; 
        System.out.println(natija);
    }
    // metod10.
    public static void swap(int a, int b, int c, int d) {
        int x = a;
        int y = c;
        a = b;
        b = x;
        c = d;
        d = y;
        int z = b;
        b = c;
        c = z;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
    // metod12.
    public static void sortInc(int a, int b, int c) {
        int x = 0, y = 0, z = 0;
        if(a<b && b<c){
            x=a; y=b; z=c;
        }
        if(a<c && c<b){
            x=a; y=c; z=b;
        }
        if(b<a && a<c){
            x=b; y=a; z=c;
        }
        if(b<c && c<a){
            x=b; y=c; z=a;
        }
        if(c<a && a<b){
            x=c; y=a; z=b;
        }
        if(c<b && b<a){
            x=c; y=b; z=a;
        }
        System.out.println(x + " " + y + " " + z);
    }
    // metod13.
    public static void sortDec(int a, int b, int c) {
        if(a>b && b>c) System.out.println(a + " " + b + " " + c);
        if(a>c && c>b) System.out.println(a + " " + c + " " + b);
        if(b>c && c>a) System.out.println(b + " " + c + " " + a);
        if(b>a && a>c) System.out.println(b + " " + a + " " + c);
        if(c>a && a>b) System.out.println(c + " " + a + " " + b);
        if(c>b && b>a) System.out.println(c + " " + b + " " + a);
    }
        // metod14.
        private static void shiftRight(int a, int b, int c) {
            int n = c;
                c = b;
                b = a;
                a = n;
            System.out.println(a + " " + b + " " + c);    
        }

    // metod15.
    private static void shiftLeft(int a, int b, int c) {
        int n = a;
            a = b;
            b = c;
            c = n;
        System.out.println(a + " " + b + " " + c);    
    }
    // metod16
    public static void sign(int x) {
        if(x>0) System.out.println(1);
        if(x==0) System.out.println(0);
        if(x<0) System.out.println(-1);
    }
    // metod17.
    public static void rootsCount(double a, double b, double c) {
        double d = b*b - (4*a*c);
        if(d>0) System.out.println(2);
        if(d==0) System.out.println(1);
        if(d<0) System.out.println("yecim mavjud emas");
    }
    // metod18.
    public static double circleS( double r) {
        return Math.PI * r * r;
    }
    // metod19.
    public static double ringS( double r1, double r2) {
         //  r1>r2
        return Math.PI * ((r1 * r1)-(r2 * r2));
    }
    // metod20.
    public static double triangleP(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }
    // metod21.
    public static void sumRange(double a, double b) {
        double sum = 0;
        if(a>b)System.out.println(sum);
        if(a<b){
            for(double i = a; i < b; i++){
                sum+=i;
            }
            System.out.println(sum);
        }

    }
    // metod22.
    public static void calc(double a, double b, double ishora) {
        
        if(ishora == 1 )  System.out.println(a-b);
        if(ishora == 2 )  System.out.println(a*b);
        if(ishora == 3 )  System.out.println(a/b);
        if(ishora == 4 )  System.out.println(a+b);
    }


    // import java.util.Scanner;

    // public class Main {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();
    //         int op = sc.nextInt();
    //         Cacl(a, b, op);
    
    //     }
    
    //     public static void Cacl(int a, int b, int op) {
    //         if (op == 1) {
    //             System.out.println(a-b);
    //         } else if (op == 2) {
    //             System.out.println(a*b);
    //         } else if (op == 3) {
    //             System.out.println(a/b);
    //         } else {
    //             System.out.println(a+b);
    //         }
    //     }
    // }


    // import java.util.Scanner;

    // // func- 14
    // public class Main {
    //     public static void main(String[] args) {
    //         calc(2, 3, Amal.AYIRISH);
    //     }
    
    //     enum Amal {
    //         QOSHISH, KOPAYTIRISH, BOLISH, AYIRISH
    //     }
    
    //     public static void calc(int a, int b, Amal opt) {
    //         double c;
    //         switch (opt) {
    //             case AYIRISH:
    //                 c = a - b;
    //                 break;
    //             case KOPAYTIRISH:
    //                 c = a * b;
    //                 break;
    //             case BOLISH:
    //                 c = a * 1.0 / b;
    //                 break;
    //             default:
    //                 c = a + b;
    //         }
    //         System.out.println(c);
    //     }
    // }


    // metod23.
    public static void quarter(double x, double y) {
        
        if(x>0 && y>0 )  System.out.println("birinchi chorak");
        if(x<0 && y>0 )  System.out.println("ikkinchi chorak");
        if(x<0 && y<0 )  System.out.println("uchinchi chorak");
        if(x>0 && y<0 )  System.out.println("to'rtinchi chorak");
    }
    // metod24.
    public static void event(int k) {
        if(k%2==0) System.out.println("true");
        if(k%2!=0) System.out.println("false");
    }
    // metod25.
    public static void isSquare(int K) {
        int i = 2;
        while (i*i < K) i++;
        System.out.println(i*i==K);
    }
    // metod26.
    public static void isPower5(int b) {
        while (b%5==0) {
            b = (b/5);
        }
        System.out.println(b==1);
    }
    // metod27.
    public static void isPowerN(int K, int N) {
        while (K%N==0) {
            K = K/N;
        }
        System.out.println(K==1);
    }
    // metod28.
    public static void isPrime(int n) {
        boolean tubmi = true;
        int i=2;
        while (i <= n /2) {
            if(n % i == 0){
                tubmi = false;
                break;
            }
            i++;
        }
        System.out.println(tubmi);
    }
    // metod29.
    public static void digitCount(double k) {
        int soni = 1;
        while (k/10>=1) {
            k = k / 10;
            soni++;
        }
        System.out.println(soni);
    }
    // metod30.
    public static void digitN(double k, double n) {
        int soni = 1;
        while (k/10>=1) {
            k = k / 10;
            soni++;
        }
        if(soni==n){
            System.out.println(n); 
        }else{
            System.out.println(-1);
        }
    }
    // metod31;
    public static void isPalindrom( double n) {
        int soni = 0;
        double t = n;
        while (t>0) {
            soni++;
            n = n / 10;
        }
        double unlik = Math.pow(10, (soni/2));
        double yarim1 = n/unlik;
        if (soni % 2 != 0) yarim1 = yarim1 / 10;
        double yarim2 = n % unlik;

        double teskari = 0;
        while (yarim1 > 0) {
            teskari = teskari * 10 + yarim1 % 10;
            yarim1 = yarim1 / 10;
        }
        System.out.println(teskari==yarim2);
    }










    // // metod37-38.
    // public static  double pow1(  double son, double daraja) {
    //     return Math.pow(son, daraja);
    // }
    

    
 









}

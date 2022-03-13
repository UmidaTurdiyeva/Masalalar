import java.util.Scanner;
// import java.util.concurrent.ForkJoinPool;

public class MinMax {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
       
        // MinMax1();
        // MinMax2();
        // MinMax3();
        // MinMax4();
        // MinMax5();
        // MinMax6();
        // MinMax7();
        // MinMax8();
        // MinMax9();

        // MinMax12();
        // MinMax13();
        // MinMax14();
        // MinMax15();
        // MinMax16();
        // MinMax17();
        // MinMax18();
        // MinMax19();
        // MinMax20();
        MinMax21();
        // MinMax22();
        // MinMax23();
        // MinMax24();
        // MinMax25();
        // MinMax26();
        // MinMax28();
    }






// eng katta va eng kichik son
    public static void MinMax1() {
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a > max){
              max = a;
            }
            if(a < min){
              min = a;
            }
        }
        System.out.println(max + " " + min);
    }
// eng kichik yuza
    public static void MinMax2() {
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int S = a * b;
            if(S<min){
                min = S;
            }
        }
        System.out.println(min);
    }
// eng katta perimetr
    public static void MinMax3() {
        int n = sc.nextInt();
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int S = a * b;
            if(S>max){
                max = S;
            }
        }
        System.out.println(max);
    }

// eng kichik element o'rni
    public static void MinMax4() {        
        int n = sc.nextInt();
        int d = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <n; i++){
            int a = sc.nextInt();
            if(a < min){
                min = a;
                d = i;
            }
        }
    System.out.println(d+1);
    }

//  eng katta zichlik
    public static void MinMax5() {
       int n = sc.nextInt(); 
       double max = Integer.MIN_VALUE;
       for( int i = 0; i < n; i++){
           double m = sc.nextDouble();
           double v = sc.nextDouble();
           double zichlik = m / v;
           if(zichlik > max){
               max =  zichlik;
           }
       }
       System.out.println(max);
    }
// MinMax6. Birinchi uchragan eng kichik va ohirgi uchragan eng katta
    public static void MinMax6() {
        System.out.println("n ga qiymat kiriting");
        int n = sc.nextInt();
        int c = 0; // max
        int b = 0; // min
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("a ga qiymat kiriting");
        for(int i = 1; i < n; i++){
            int a = sc.nextInt();
            if(a >= max){  // agar bir xil sonlar bo'lsa eng birinchisini oladi
              max = a;
              c = i;
            }
            if(a < min){
                min = a;
                b = i;                
            }
        }
        System.out.println("max: " + c + " min: " + b);
    }
    //MinMax7. Birinchi uchragan eng katta, ohirgi uchragan eng kichik
    public static void MinMax7() {
        System.out.println("n ga qiymat kiriting");
        int n = sc.nextInt();
        int c = 0; // max
        int b = 0; // min
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("a ga qiymat kiriting");
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a > max){  // agar bir xil sonlar bo'lsa eng birinchisini oladi
              max = a;
              c = i;
            }
            if(a <= min){ // ohirgi uchragan eng kichik
                min = a;
                b = i;                
            }
        }
        System.out.println("max: " + c + " min: " + b);
    }

//MinMax8. birinchi va ohirgi uchragan eng kichik element
    public static void MinMax8() {
        System.out.println("n ga qiymat kiriting");
        int n = sc.nextInt();
        int c = 0; 
        int b = 0; 
        int  min = Integer.MAX_VALUE;
        System.out.println("a ga qiymat kiriting");
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
             if(a < min){  // birinchi uchragan eng kichik
                min = a;
                b = i;                
            }else if(a == min){  // agar bir xil sonlar bo'lsa eng birinchisini oladi
              min = a;
              c = i;
            }

        }
        System.out.println("birinchi uchragan min: " + b + " oxirgi uchragan min: " + c);
    }
//MinMax9. birinchi va ohirgi uchragan katta element
    public static void MinMax9() {
       int n = sc.nextInt(); 
       int a = sc.nextInt(); 
       int max = a;
       int i1 = 1, i2 = 1;
       for (int i = 2; i <= n; i++) {
         a = sc.nextInt(); 
         if(max < a){
             i1 = i;
             max = a;
         }else if(max == a){
             i2 = i;
         }           
       }
       System.out.println(i1 + " " + i2);
    }
// MinMax10. Birichi uchragan extremal element. 
    public static void MinMax10() {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean kamayuvchi = a>b;
        for(int i = 2; i < n; i++){
            int c = sc.nextInt();
            if(
                (b<c && kamayuvchi) || (b>c && !kamayuvchi)
            ){
                System.out.println(b);
                break;
            }
            b = c;
        }
    }

    // MinMax11. Oxirgi uchragan ekstremal element
    public static void MinMax11() {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean kamayuvchi = a>b;
        int index = -1;
        for(int i = 2; i < n; i++){
            int c = sc.nextInt();
            if( (b<c && kamayuvchi) || (b>c && !kamayuvchi) ){
               index = i;
               kamayuvchi = !kamayuvchi;
            }
            b = c;
        }
        System.out.println(index);
    }
// MinMax12. Eng kichik musbat son aniqlang
    public static void MinMax12() {
        int n = sc.nextInt();
        int min = 0;
        int i = 1;
        for( i = 1; i<=n; i++){
            int a = sc.nextInt();
                if(a>0){
                    min = a;
                    break;
                }
            }   
        for(; i<=n; i++){
            int a = sc.nextInt();
            if(a>0 && min > a){
                min = a;
            }
        }            
        System.out.println(min);        
    }

// MinMax13. Birinchi uchragan eng katta toq element
    public static void MinMax13() {
        int n = sc.nextInt();
        int i = 1;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for( i = 1; i<=n; i++){
            int a = sc.nextInt();
            if(a%2!=0){
                max = a;
                break;
            }
        }
        for (; i <= n; i++) {
            int a = sc.nextInt();
            if(a > max && a%2!=0){
                max = a;
                index = i;
            }
        }
        
        System.out.println(index + " " + max);
    }
    // MinMax14. B sonidan katta bo'lgan, eng kichik elementni tartib 
    // raqamini chiqaruvchi programma tuzilsin
    public static void MinMax14() {
        int index = 0;
       int min = Integer.MAX_VALUE;
        System.out.println("n ga qiymat kiriting");
        int n = sc.nextInt();
        System.out.println("b ga qiymat kiriting");
        int b = sc.nextInt();
        System.out.println("a ga qiymat kiriting");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int c = Math.abs(a - b);
            if(c < min && c!=0 && a > b){
                min = c;
                index = i;              
            }        
        }
        System.out.println(index);
    }  
// MIn MAx15. B, C sonlari va 10 ta butun sondan tashkil topgan to'plam berilgan.
// (0 < B < C). Shu to'plamda (B , C) oraliqdagi eng katta elementni tartib raqamini 
// chiqaruvchi programma tuzilsin. Agar berilgan to'plamda (B, C) oraliqda
// son topilmasa, ikkita nol chiqarilsin.
    public static void MinMax15() {
        int n = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (b<=a && a<=c) {
                if(max < a){
                    max = a;
                    index = i;
                }
            }
        }
        System.out.println(index);

    }
//  MinMax16. Birinchi uchragan eng kichik elementgacha bo'lgan 
// elementlar sonini aniqlovchi programma tuzilsin.
    public static void MinMax16() {
        int index = 0;
        int soni = 0;
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a < min){
                min = a;
                index = i;
                soni++;
            }
        }
        System.out.println(soni + " " + index);
    }
//  MinMax17. Oxirgi uchragan eng katta elementdan keyin turgan
// elementlar sonini aniqlovchi programma tuzing.
    public static void MinMax17() {
        int index = 0;
        int soni = 0;
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a >= max){
                max = a;
                index = i;
                soni++;
            }
        }
        System.out.println(soni + " " + index);
        System.out.println(n-soni);
    }
// MinMax18. Birinchi va oxirgi uchragan eng katta element orasida
// turgan elementlar sonini chiqaruvchi programma tuzing.
    public static void MinMax18() {
        int n = sc.nextInt(); 
        int a = sc.nextInt(); 
        int max = a;
        int i1 = 1, i2 = 1;
        for (int i = 2; i <= n; i++) {
          a = sc.nextInt(); 
          if(max < a){
              i1 = i;
              max = a;
          }else if(max == a){
              i2 = i;
          }           
        }
        int c = Math.abs(i2 - i1);
        if(i1==i2){
            System.out.println(i1 + " " + i2);            
            System.out.println(c);
        }else{
            System.out.println(0);
        }
     }
// MinMax19.To'plamdagi eng kichik elementlat sonini chiqaring.
public static void MinMax19() {
    int soni = 1;
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        if(a < min){
            min = a;
        }else if(a == min){
            soni++;
        }
    }
    System.out.println("eng kichik min : "  + min + " minimumlar soni: " +  soni);
} // birinchi min yo'q qilish karak




// MinMax20. To'plamdagi ekstremal elementlar sonini aniqlang.
public static void MinMax20() {
    int soni = 0;
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    for (int i = 2; i < n-1; i++) {
        int c = sc.nextInt();
        if((a<b && b>c) || (a>b && b<c)){
            soni++;
        }
        a = b;
        b = c;        
    }
    System.out.println(soni);
}

// to'plamning o'rtacha qiymatini aniqlovchi programma tuzilsin
// o'qtacha qiymatni hisoblashda eng katta va eng kichik qiymatni hisobga olmang
public static void MinMax21() {
    //  N>2
    int n = sc.nextInt();
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        if(a > max){
            max = a;
            System.out.println("max: " + max);
        }
        if(a < min){
            min = a;
            System.out.println("min: " + min);
        }
        if( a != max || a != min ){
            System.out.println("a: " + a);
            sum += a;
            System.out.println("sum: " + sum);
        }
    }
    System.out.println(sum/2);
}

// to'plamdagi eng kichik ikkita qiymatni toping
    public static void MinMax22() {
        int n = sc.nextInt();
        int min1 = sc.nextInt();
        int min2 = sc.nextInt();
        if(min1>min2){
            int t = min1;
            min1 = min2;
            min2 = t;
        }
        for (int i = 2; i < n; i++) {
            int a = sc.nextInt();
            if(min1 > a){
                min2 = min1;
                min1 = a;
            }else if(min2>a){
                min2 = a;
            }
        }
        System.out.println(min1 + " " + min2);
    }

    public static void MinMax23() {
        int n = sc.nextInt();
        int max1 = sc.nextInt();
        int max2 = sc.nextInt();
        if(max1<max2){
            int t = max1;
            max1 = max2;
            max2 = t;
        }
        for (int i = 2; i < n; i++) {
            int a = sc.nextInt();
            if(max1 < a){
                max2 = max1;
                max1 = a;
            }else if(max2<a){
                max2 = a;
            }
        }
        System.out.println(max1 + " " + max2);
    }

    public static void MinMax24() {
        int n = sc.nextInt(); 
        double max = Integer.MIN_VALUE;
        double a = sc.nextDouble();
        for( int i = 1; i < n; i++){
            double b = sc.nextDouble();
            double sum = a + b;
            if(sum > max){
                max = sum;
            }
            a=b;
        }
        System.out.println(max);
     }

     public static void MinMax25() {
        int n = sc.nextInt(); 
        double min = Integer.MAX_VALUE;
        double a = sc.nextDouble();
        for( int i = 1; i < n; i++){
            double b = sc.nextDouble();
            double pow = a * b;
            if(pow < min){
                min =  pow;
            }
            a=b;
        }
        System.out.println(min);
     }
// chala
     public static void MinMax26() {
        int n = sc.nextInt();
        int max = 0;
        int soni = 0;
        boolean tugadi = false;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a%2==0){
                soni++;
                tugadi = true;
            }else if(a%2!=0 && tugadi){
                System.out.println(tugadi);
                soni = 0;
                tugadi = false;
            } 
            if(tugadi){
                if(max < soni){
                    max = soni;
                }
            }
        }
        System.out.println(max);
     }

     public static void MinMax28() {
        int n = sc.nextInt();
        int max = 0;
        int soni1 = 0;
        int soni2 = 0;
        int index = 0;
        boolean tugadi1 = true;
        boolean tugadi2 = true;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
                if(a==0 && tugadi2){
                    soni1++;
                    tugadi1 = true;
                    soni2 = 0;
                    index = i;
                }else if(a==1 && tugadi1){
                    soni2++;
                    soni1 = 0;
                    tugadi2 = true;
                    index = i;
                }
            if(tugadi1 || tugadi2){
                if(max < soni2){
                    max = soni2;
                }else if ( max < soni1){
                    max = soni1;
                }
            }
        }
        System.out.println(max);
        System.out.println(index);
        // birinchi index ushlani
     }





















}

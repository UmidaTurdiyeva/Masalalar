import java.util.Scanner;
// import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Massiv {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // // array 71
        // int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // int n = a.length; // n juft bo'lishi shart
        // int k = 0;
        // int m = n/2;
        // for (int i = 0; i < m; i++) {
        //    k = a[n-1-i];
        //    a[n-1-i] = a[i];
        //    a[i] = k;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }

        // // array 70
        // int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int n = a.length; // n juft bo'lishi shart
        // int m = n/2;
        // int k = 0;
        // for (int i = 0; i < m; i++) {
        //    k = a[i+m];
        //    a[i+m] = a[i];
        //    a[i] = k;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }


        // // array 69
        // int a[] = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        // int n = a.length;
        // for (int i = 0; i < n-1; i+=2) {
        //     int k = a[i];
        //     a[i] = a[i+1];
        //     a[i+1] = k;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }

        //   // array 68
        // int a[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        // int n = a.length;
        // int max = a[0];
        // int min = a[0];
        // for (int i = 1; i < n; i+=2) {
        //     if(a[i] > max){
        //         max = a[i];
        //     }
        //     if(a[i] < min){
        //         min = a[i];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if(a[i] == max){
        //         a[i] = min;
        //     }else if(a[i] == min){
        //         a[i] = max;
        //     } 
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }

        // //  array 67
        // int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int n = a.length;
        // int newA [] = new int [n];
        // int k = 0;
        // int b = 0;
        // for (int i = 0; i < n; i++) {
        //     if(a[i]%2!=0){
        //         k = a[i];
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     if(a[i]%2!=0){
        //         newA[i] = a[i] + k; 
        //     }else{
        //         newA[i] = a[i] + b;
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(newA[i] + " ");
        // }

        // //  array 66
        // int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int n = a.length;
        // int newA [] = new int [n];
        // int k = 0;
 
        // for (int i = 0; i < n; i++) {
        //     if(a[i]%2==0){
        //         k = a[i];
        //         break;
        //     }else{
        //         k=0;
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     newA[i] = a[i] + k;             
        // }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(newA[i] + " ");
        // }
     
        // //  array 65
        // int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int n = a.length;
        // System.out.println("k ga qiymat kiriting: ");
        // int k = sc.nextInt();
        // int newA [] = new int [n];
        // for (int i = 0; i < n; i++) {
        //     newA[i] = a[i] + k;  
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(newA[i] + " ");
        // }

        // // array 64  masalani so'ra
        // int a[] = {0, 3, 6, 9, 12};
        // int b[] = {1, 4, 7, 10, 13};
        // int d[] = {2, 5, 8, 11, 14};
        // int n = a.length;
        // int m = b.length;
        // int l = d.length;
        // int c[] = new int [n+m+l];
        // int s = c.length;
        // int j = 0;
        // for (int i = 0; i < n; i++) {
        //     if(a[i] < b[i] && b[i] < d[i]){
        //         c[j] = a[i];
        //         c[j+1] = b[i];
        //         c[j+2] = d[i];
        //         j+=3;
        //     }else if(a[i] < d[i] && d[i] < b[i]){
        //         c[j] = a[i];
        //         c[j+1] = d[i];
        //         c[j+2] = b[i];
        //         j+=3;
        //     }else if(b[i] < a[i] && a[i] < d[i]){
        //         c[j] = b[i];
        //         c[j+1] = a[i];
        //         c[j+2] = d[i];
        //         j+=3;
        //     }else if(b[i] < d[i] && d[i] < a[i]){
        //         c[j] = b[i];
        //         c[j+1] = d[i];
        //         c[j+2] = a[i];
        //         j+=3;
        //     }else if(d[i] < b[i] && b[i] < a[i]){
        //         c[j] = d[i];
        //         c[j+1] = b[i];
        //         c[j+2] = a[i];
        //         j+=3;                
        //     }else if(d[i] < a[i] && a[i] < b[i]){
        //         c[j] = d[i];
        //         c[j+1] = a[i];
        //         c[j+2] = b[i];
        //         j+=3;
        //     }

        // }
        // for (int i = 0; i < s; i++) {
        //    System.out.print(c[i] + " "); 
        // }

        // // array 63
        // int a[] = {0, 3, 4, 7, 8};
        // int b[] = {1, 2, 5, 6, 9};
        // int n = a.length;
        // int m = b.length;
        // int c[] = new int [n+m];
        // int s = c.length;
        // int j = 0;
        // for (int i = 0; i < n; i++) {
        //     if(a[i] < b[i]){
        //         c[j] = a[i];
        //         c[j+1] = b[i];
        //         j+=2;
        //     }else{
        //         c[j] = b[i];
        //         c[j+1] = a[i];
        //         j+=2;
        //     }
        // }
        // for (int i = 0; i < s; i++) {
        //    System.out.print(c[i] + " "); 
        // }



        // // array 62
        // int a [] = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5};
        // int n = a.length;
        // int b[] = new int[n];
        // int c[] = new int[n];
        // int x=0;
        // int y=0;
        // for (int i = 0; i < n; i++) {
        //     if(a[i] > 0){
        //         b[x] = a[i];
        //         x++;
        //         System.out.println(x);
        //     }else{
        //         c[y] = a[i];
        //         y++;
        //     }
        // }
        // for (int i = 0; i < x; i++) {
        //     System.out.print(b[i] + " ");
        // }
        // System.out.println( "b massiv elementlari soni:  " + x);
        // for (int i = 0; i < y; i++) {
        //     System.out.print(c[i] + " ");
        // }
        // System.out.println( "c massiv elementlari soni:  " + y);


        // // array 61
        // int a [] = {2, 4, 6, 8, 10, 12};
        // int n = a.length;
        // int b[] = new int[n];
        // int k = 0;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     int m = 0;            
        //     for (int j = i; j < n; j++) {
        //         sum += a[j];
        //         m++;
        //     }
        //     int surat = sum;
        //     b[k] = sum/m;
        //     sum = surat;
        //     k++;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }

        // // array 60
        // int a [] = {2, 4, 6, 8, 10, 12};
        // int n = a.length;
        // int b[] = new int[n];
        // int k = 0;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += a[j];
        //     }
        //     b[k] = sum;
        //     sum = b[k];
        //     k++;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }

        // // array 59
        // int a [] = {2, 4, 6, 8, 10, 12};
        // int n = a.length;
        // int b[] = new int[n];
        // int sum = 0;
        // int k = 1;
        // for (int i = 0; i < n; i++) {
        //     sum += a[i];
        //     int surat = sum;
        //     b[i] = sum/k;
        //     sum = surat;
        //     k++;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }

        // // array 58
        // int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int n = a.length;
        // int b[] = new int[n];
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     sum += a[i];
        //     b[i] = sum;
        //     sum = b[i];
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }



        // // array 57
        // int a [] = {1, 7, 2, 8, 3, 9, 4, 10, 5, 11, 6};
        // int n = a.length; 
        // int b [] = new int[n];
        // int j = 0;
        // for (int i = 0; i < (n+1)/2; i++) {
        //     int k = 2*i;
        //     b[j] = a[k];
        //     j++;
        // }
        // for (int i = 0; i < (n-1)/2; i++) {
        //     int k = 2*i+1;
        //     b[j] = a[k];
        //     j++;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }

        // // array 56
        // int a [] = {4, 5, 18, 3, 6, 5, 3, 4, 7, 3, 4, 8, 3, 4, 3};
        // int n = a.length; // n<=15
        // int b [] = new int[(n+1)/3];
        // int s = b.length;
        // int soni = 0;
        // for (int i = 1; i <= s; i++) {
        //     int k = i*3;
        //     b[soni] = a[k];
        //     soni++;
        // }
        // for (int i = 0; i < soni; i++) {
        //     System.out.print(b[i] + " ");
        // }
        // System.out.println();
        // System.out.println(soni);

        // // array 55
        // int a [] = {4, 5, 18, 3, 6, 5, 3, 4, 7, 2, 4, 8};
        // int n = a.length; // n<=15
        // int b [] = new int[(n+1)/2];
        // int soni = 0;
        // for (int i = 0; i < (n+1)/2; i++) {
        //     int k = 2*i+1;
        //        b[soni] = a[k];
        //        soni++;
           
        // }
        // for (int i = 0; i < soni; i++) {
        //     System.out.print(b[i] + " ");
        // }
        // System.out.println();
        // System.out.println(soni);



        // // array 54
    
        // int a [] = {4, 5, 18, 3, 6, 5, 3, 4, 7, 2, 4, 8};
        // int n = a.length;
        // int b [] = new int[(n+1)/2];
        // int soni = 0;
        // for (int i = 0; i < n; i++) {
        //    if(i%2==0){
        //        b[soni] = a[i];
        //        soni++;
        //    }
        // }
        // for (int i = 0; i < soni; i++) {
        //     System.out.print(b[i] + " ");
        // }
        // System.out.println();
        // System.out.println(soni);

        // // array 53
        // int n = 5;
        // int c [] = new int[n];
        // int a [] = {4, 5, 18, 3, 6};
        // int b [] = {9, 15, 8, 13, 2};
        // for (int i = 0; i < n; i++) {
        //    if(a[i] > b[i]){
        //        c[i] = a[i];
        //    }else{
        //        c[i] = b[i];
        //    } 
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(c[i] + " ");
        // }

        // // array 52
        // int n = sc.nextInt();
        // float a [] = new float[n];
        // float b [] = new float[n];
        // for (int i = 0; i < n; i++) {
        //     a[i] = sc.nextInt(); 
        // }
        // for (int i = 0; i < n; i++) {
        //     if(a[i] < 5){
        //         b[i] = 2 * a[i];
        //     }else{
        //         b[i] = a[i] / 2;
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }

        // //  array 51
        // System.out.println("n ga qiymat kiriting");
        // int n = sc.nextInt();
        // int a [] = new int [n];
        // int b [] = new int [n];
        // System.out.println("a massivga kiriting");
        // for (int i = 0; i < n; i++) {
        //     a[i] = sc.nextInt();
        // }
        // System.out.println("b massivga qiymat kiriting");
        // for (int i = 0; i < n; i++) {
        //     b[i] = sc.nextInt();
        // }

        // for (int i = 0; i < n; i++) {
             
        //     int c = a[i];
        //     a[i] = b[i];
        //     b[i] = c;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < n; i++) {
        //     System.out.print(b[i] + " ");
        // }
        // //  massiv bir qatorda chiqmadi 







        // // 1-50 bo'lgan massiv masalalari

        // int n = sc.nextInt();
        // int mas [] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     mas[i] = sc.nextInt();
        // }

        // // array 50
        // int soni = 0;
        // for (int i = 0; i < n-1; i++) {
        //     if(mas[i] > mas[i+1])
        //     soni++;
        // }
        // System.out.println(soni);

        // // array 49
        // int a = 0;
        // for (int i = 0; i < n-1; i++) {
        //     if((mas[i]>=1) && (mas[i+1]<=n)){
        //         if(mas[i]!=mas[i+1])
        //         a=0;;
        //     }else{
        //         a=i+1;
        //         break;
        //     }
        // }
        // System.out.println(a);

        // // array 48
        // int a = 0;
        // int soni = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i+1; j < n ; j++) {
        //         if(mas[i]==mas[j]){
        //             soni++;
        //         }
        //     }
        //     if(soni > a){
        //       a = soni; 
        //       soni = 0;           
        //     }
        // }
        // System.out.println(a+1);

        // // array 47
        // for (int i = 0; i < n-1; i++) {
        //     if( (mas[i] < mas[i+1])||(mas[i] > mas[i+1]) ) {
        //         if (mas[i]!=mas[i+1]){   
        //             System.out.println(mas[i]);
        //         }
        //     }
        // }

        // // array46
        // int r = sc.nextInt();
        // double masofa = Math.abs(r-(mas[0]+mas[1]));
        // int k=0;
        // for(int i=1; i< n-1; i++){
        //     double mk=Math.abs(r-(mas[i]+mas[i+1]));
        //     if(mk<masofa){
        //         masofa=mk;
        //         k=i;
        //     }
        // }
        // System.out.println(mas[k] + " " + mas[k+1]);

        // // ARRAY45
        // int index = 0;
        // int ayirma = Math.abs(mas[1] - mas[0]);
        // for (int i = 1; i < n - 1; i++) {
        //     if(ayirma > Math.abs(mas[i+1] - mas[i]))
        //         ayirma = Math.abs(mas[i+1] - mas[i]);
        //         index = i;
        // }
        // System.out.println(mas[index] + " " + mas[index+1]);

        // // array44
        // int k = 0;
        // int m = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j < n; j++) {
        //         if(mas[i]==mas[j]){
        //                 k = i;
        //                 m = j;                    
        //         }
        //     }
        // }
        // System.out.println(k + " " + m);





        // // array43
        // int soni = 1;
        // for (int i = 0; i < n - 1; i++) {
        //     if(mas[i] < mas[i+1] || mas[i] > mas[i+1]) soni++;
        // }
        // System.out.println(soni);


        // //  array42
        // double r = sc.nextInt();
        // int k = 0;
        // double ayirma = Math.abs( (mas[0] + mas[1]) - r);
        // for (int i = 1; i < n-1; i++) {
        //     if(  ayirma > Math.abs( (mas[i] + mas[i+1]) - r) ){
        //         ayirma = Math.abs( (mas[0] + mas[1]) - r);
        //         k = i;
        //     }
        // }
        // System.out.println(mas[k] + " " + mas[k+1]);

        // //  array41
        // int k = 0;
        // int sum = mas[0] + mas[1];
        // for (int i = 1; i < n-1; i++) {
        //     if(mas[i] + mas[i+1] > sum){
        //         sum = mas[i] + mas[i+1];
        //         k = i;
        //     }
        // }
        // System.out.println(mas[k] + " " + mas[k+1]);



        // // array40
        // double r = sc.nextInt();
        // int k = 0;
        // double ayirma = Math.abs( mas[0] - r);
        // for (int i = 1; i < mas.length; i++) {
        //     if(Math.abs(mas[i] - r) < ayirma){
        //         ayirma = Math.abs(mas[i] - r);
        //         k = i;
        //     }
        // }
        // System.out.println(mas[k]);


        // // array39 monoton oraliqlar soni
        // int soni = 0;
        // for (int i = 1; i < n-1; i++) {
        //     if((mas[i-1]>=mas[i] && mas[i]<mas[i+1]) || (mas[i-1]<=mas[i] && mas[i]>mas[i+1]))
        //     soni++;
        // }
        // if((mas[n-2]>=mas[n-1]) || (mas[n-2]<=mas[n-1])) soni++;
        // System.out.println(soni);


        //  // array38 monoton kamayuvchi
        // int soni = 0;
        // for (int i = 1; i < n-1; i++) {
        //     if(mas[i-1]>=mas[i] && mas[i]<mas[i+1])
        //     soni++;
        // }
        // if(mas[n-2]>=mas[n-1]) soni++;
        // System.out.println(soni);


        // // array37 monoton o'suvchi
        // int soni = 0;
        // for (int i = 1; i < n-1; i++) {
        //     if(mas[i-1]<=mas[i] && mas[i]>mas[i+1])
        //     soni++;
        // }
        // if(mas[n-2]<=mas[n-1]) soni++;
        // System.out.println(soni);




        // // array36
        // int max = Integer.MIN_VALUE;
        // for(int i = 1; i< n-1; i++){
        // boolean a = ((mas[i-1]<mas[i] && mas[i]>mas[i+1]) || (mas[i-1]>mas[i] && mas[i]<mas[i+1]));
        //     if(a!=true){
        //        if( mas[i] > max) {
        //         max = mas[i];
        //        }else{
        //         max = 0;
        //        }
        //     }
        // }
        // System.out.println(max);

        // // array35
        // int locMax = mas[1]; 
        // for(int i = 1; i< n-1; i++){
        //     if(mas[i-1]<mas[i] && mas[i]>mas[i+1]){
        //         if(locMax > mas[i]){
        //             locMax = mas[i];
        //         }else{
        //             locMax = locMax;
        //         }
        //     }
        // }
        // System.out.println(locMax);


        // // array34
        // int locMin = mas[0];
        // for(int i = 2; i< n-1; i++){
        //     if(mas[i-1]>mas[i] && mas[i]<mas[i+1]){
        //         if(locMin<mas[i]){
        //             locMin = mas[i];
        //         }else{
        //             locMin = locMin;
        //         }
        //     }
        // }
        // System.out.println(locMin);


        // // array33
        //  int index = -1;
        // for(int i = 1; i< n-1; i++){
        //     if(mas[i-1]<mas[i] && mas[i]>mas[i+1]){
        //         index = i;
        //     }
        // }
        // System.out.println(index);
        
        
        // // array32
        // int index = -1;
        // for(int i = 1; i< n-1; i++){
        //     if(mas[i-1]>mas[i] && mas[i]<mas[i+1]){
        //         index = i;
        //         break;
        //     }
        // }
        // System.out.println(index);


    //  // array31
    //   int n = sc.nextInt();
    //   int mas [] = new int[n];
    //   int soni = 0;
    //   for (int i = 0; i < n; i++) {
    //       mas[i] = sc.nextInt();
    //    }
    //  for (int i = n-1; i > 1; i--) {    
    //         if(mas[i-1] > mas[i]){
    //         soni++;
    //         System.out.println(i);            
    //          }
    //     }
    //      System.out.println(soni);




    //       // array30
    //   int n = sc.nextInt();
    //   int mas [] = new int[n];
    //   int soni = 0;
    //   for (int i = 0; i < n; i++) {
    //       mas[i] = sc.nextInt();
    //    }
    // for (int i = 0; i < n; i++) {
    
    //     if(mas [i] < mas[i+1]){
    //         soni++;
    //         System.out.println(i);            
    //     }
    // }
    // System.out.println(soni);


    //   // array29
    //   int n = sc.nextInt();
    //   int mas [] = new int[n];
    //   for (int i = 0; i < n; i++) {
    //       mas[i] = sc.nextInt();
    //    }
    //    int kattasi = mas[0];
    //    int max = 0;
       
    //    for (int i = 1; i < n; i++) {
    //       if(i%2!=0){
    //         if(mas[i] > kattasi){
    //            max = mas[i];   
    //       }else{
    //        max = kattasi;
    //       }
    //    }
    //   }
    //   System.out.println(max);

    //   // array28
    //    int n = sc.nextInt();
    //    int mas [] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //        mas[i] = sc.nextInt();
    //     }
    //     int kichigi = mas[0];
    //     int min = 0;
        
    //     for (int i = 1; i < n; i++) {
    //        if(i%2==0){
    //          if(mas[i] < kichigi){
    //             min = mas[i];   
    //        }else{
    //         min = kichigi;
    //        }
    //     }
    //    }
    //    System.out.println(min);



    //             // array27
    //    int n = sc.nextInt();
    //    int mas [] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //        mas[i] = sc.nextInt();
    //    }
    //    int s = 0;
    //    for (int i = 0; i < n; i++) {
    //    boolean x = mas[i] > 0;
    //    boolean y = mas[i+1] > 0;
    //          if(x==true){
    //                if(y==true){
    //                 s = mas[i+1];
    //                 break;
    //                }
    //          }else{
    //               if(y==false){
    //                s = mas[i+1];
    //                break;
    //                }
    //          }
    //    }
    //    System.out.println(s);





    //     // array26
    //    int n = sc.nextInt();
    //    int mas [] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //        mas[i] = sc.nextInt();
    //    }
    //    int s = 0;
    //    for (int i = 0; i < n; i++) {
    //    boolean x = mas[i]%2 == 0;
    //    boolean y = mas[i+1]%2 == 0;
    //          if(x==true){
    //                if(y==true){
    //                 s = mas[i+1];
    //                 break;
    //                }
    //          }else{
    //               if(y==false){
    //                s = mas[i+1];
    //                break;
    //                }
    //          }
    //    }
    //    System.out.println(s);


        
    //   // array25
    //    int n = sc.nextInt();
    //    int mas [] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //        mas[i] = sc.nextInt();
    //    }
    //    int q = mas[1] / mas[0];
    //    for (int i = 0; i < n-1; i++) {
    //        if(q !=(mas[i+1]/mas[i])){
    //            q=0;
    //            break;
    //        }
    //    }
    //     System.out.println(q);

    //     // array24
    //    int n = sc.nextInt();
    //    int mas [] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //        mas[i] = sc.nextInt();
    //    }
    //    int d = mas[1] - mas[0];
    //    for (int i = 0; i < n-1; i++) {
    //        if(d !=(mas[i+1]-mas[i])){
    //            d=0;
    //            break;
    //        }
    //    }
    //     System.out.println(d);

    // // array 23
    // System.out.println("n ga qiymat kiriting");
    // int n = sc.nextInt();
    // System.out.println("k ga qiymat kiriting");
    // int k = sc.nextInt();
    // System.out.println("l ga qiymat kiriting");
    // int l = sc.nextInt();
    // int s = 0;
    // int p = 0;
    // double sum1 = 0.0;
    // double sum2 = 0.0;
    // // 0<=k<=l<n
    // int mas [] = new int[n]; 
    // for (int i = 0; i < n; i++) {
    //     mas[i] = sc.nextInt(); 
    // }  
    // for (int i = 0; i < k; i++) {
    //     sum1+=mas[i];
    //     s++;
    // }
    // System.out.println(s);
    // for (int j = l; j < n; j++) {
    //     sum2+=mas[j];
    //     p++;
    // }
    // System.out.println(p);
    // System.out.println((sum1+sum2)/(s+p));

    // // array22
    // System.out.println("n ga qiymat kiriting");
    // int n = sc.nextInt();
    // System.out.println("k ga qiymat kiriting");
    // int k = sc.nextInt();
    // System.out.println("l ga qiymat kiriting");
    // int l = sc.nextInt();
    // double sum1 = 0.0;
    // double sum2 = 0.0;
    // // 0<=k<=l<n
    // int mas [] = new int[n]; 
    // for (int i = 0; i < n; i++) {
    //     mas[i] = sc.nextInt(); 
    // }  
    // for (int i = 0; i < k; i++) {
    //     sum1+=mas[i];
    // }
    // for (int j = l; j < n; j++) {
    //     sum2+=mas[j];
    // }
    // System.out.println(sum1+sum2);
    

    // // array21
    // System.out.println("n ga qiymat kiriting");
    // int n = sc.nextInt();
    // System.out.println("k ga qiymat kiriting");
    // int k = sc.nextInt();
    // System.out.println("l ga qiymat kiriting");
    // int l = sc.nextInt();
    // int s = 0;
    // double sum = 0.0;
    // // 0<=k<=l<n
    // int mas [] = new int[n]; 
    // for (int i = 0; i < n; i++) {
    //     mas[i] = sc.nextInt(); 
    // }  
    // for (int i = k; i <= l; i++) {
    //     sum+=mas[i];
    //     s++;
    // }
   
    // System.out.println(sum/s);

    //   // array20
    //   System.out.println("n ga qiymat kiriting");
    //   int n = sc.nextInt();
    //   System.out.println("k ga qiymat kiriting");
    //   int k = sc.nextInt();
    //   System.out.println("l ga qiymat kiriting");
    //   int l = sc.nextInt();
    //   double sum = 0.0;
    //   // 0<=k<=l<n
    //   int mas [] = new int[n]; 
    //   for (int i = 0; i < n; i++) {
    //       mas[i] = sc.nextInt(); 
    //   }  
    //   for (int i = k; i <= l; i++) {
    //       sum+=mas[i];
    //   }
     
    //   System.out.println(sum);







    }


}

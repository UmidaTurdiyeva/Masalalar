public class Main {
    public static void main(String[] args) {
        Kompleks z1 = new Kompleks();
        z1.a =2;
        z1.b = 5;
        Kompleks z2 = new Kompleks();
        z2.a = 6;
        z2.b = 9;
        Kompleks z3 = z1.qoshish(z2);
        Kompleks z4 = z1.ayirish(z2);
        Kompleks z5 = z1.kopaytirish(z2);
        Kompleks z6 = z1.bolish(z2);
        
        kompleksPrint(z1);
        kompleksPrint(z2);
        kompleksPrint(z3);
        kompleksPrint(z4);
        kompleksPrint(z5);
        kompleksPrint(z6);

        

    }
    public static void kompleksPrint(Kompleks k){
        System.out.println(k.a + (k.b>=0 ? "+": "") + k.b + "i");
    }
}

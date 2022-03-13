public class Kompleks {
    double a;
    double b;

    Kompleks qoshish(Kompleks z){
        Kompleks z3 = new Kompleks();
        z3.a = this.a  + z.a;
        z3.b = this.b  + z.b;
        return z3;
    }

    Kompleks ayirish(Kompleks z){
        Kompleks z3 = new Kompleks();
        z3.a = this.a  - z.a;
        z3.b = this.b - z.b;
        return z3;

    }

    Kompleks kopaytirish(Kompleks z){
        Kompleks z3 = new Kompleks();
        z3.a = this.a * z.a - this.b * z.b;
        z3.b = this.a * z.b - this.b * z.a;
        return z3;
    }

    Kompleks bolish(Kompleks z){
        Kompleks z3 = new Kompleks();
        z3.a = (this.a * z.a + this.b * z.b) / (z.a * z.a + this.b * this.b);
        z3.b = (this.a * z.b - this.b * z.a) / (z.a * z.a + this.b * this.b);
        return z3;
    }

 
}

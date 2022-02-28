import java.util.Random;

public class ComputeMethods5026211006 {

        public double fToC (double TempF) {
            double TempC = 5.0/9*(TempF-32);
            return TempC;
        }

        public double hypotenuse (int A, int B) {
            double hypo = Math.sqrt((Math.pow(A, 2)) + (Math.pow(B, 2)));
            return hypo;
        }

        public int roll () {
            Random dice = new Random();
            int dice1 = dice.nextInt(12)+1;
            return dice1;
        }
}

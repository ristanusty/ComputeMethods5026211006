import javax.swing.*;

public class TestClass5026211006 {
    public static void main(String[] args) {

        //Calculating Temperature
        String TempF = JOptionPane.showInputDialog(null, "Enter Temperature here! (degree Fahrenheit)" , "Temperature Converter", 3);
        double TempF1 = Double.parseDouble(TempF);
        ComputeMethods5026211006 CompMet = new ComputeMethods5026211006();
        double TempC = CompMet.fToC(TempF1);
        JOptionPane.showMessageDialog(null, "This is new Temperature! (in Celcius) : " +TempC+"\u00B0C", "Temperature Converter", 1);

        //Calculating Hypotenuse
        String A = JOptionPane.showInputDialog(null, "Enter side length of a triangle! (in Centimeter)", "Hypotenuse Calculator", 3);
        int intA = Integer.parseInt(A);
        String B = JOptionPane.showInputDialog(null, "Enter another side length! (in Centimeter)", "Hypotenuse Calculator", 3);
        int intB = Integer.parseInt(B);
        double hypo = CompMet.hypotenuse(intA, intB);
        JOptionPane.showMessageDialog(null, "Hypotenuse = " +hypo+ "cm\u00B2", "Hypotenuse Calculator", 1);

        //Calculating sum of dice
        int dice1 = CompMet.roll();
        JOptionPane.showMessageDialog(null, "The sum of dice is " +dice1+ ".");

    }
}
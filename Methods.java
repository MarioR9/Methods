import javax.swing.*;

public class Methods{
 public static void main(String[] args) {

       String input = JOptionPane.showInputDialog("Enter Number to output absolute, square root and power ^10");
       int N = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"Absolute value of " +N+ " is "+Math.round(calcu(N)) + "\n" +"Square Root of " +N+ " is "+ Math.round(sqrt(N))+ "\n" + N +" power of 10 is  "+Math.round(power(N)));

            }
             public static double power(int x1) {
                return (x1*x1*x1*x1*x1*x1*x1*x1*x1*x1);

    }

            public static double calcu(int num) {
                return (num >= 0) ? num : (-1 * num);
            }

            public static double sqrt(int number) {
                double x;
                double sqareroot = number / 2;
                do {
                    x = sqareroot;
                    sqareroot = (x + (number / x)) / 2;
                } while ((x - sqareroot) != 0);
                return sqareroot;

            }


        }



import java.math.BigInteger;
import java.util.Scanner;

public class TestRational {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first rational number: ");
    BigInteger numerator1 = input.nextBigInteger();
    input.next();
    BigInteger denominator1 = input.nextBigInteger();

    System.out.print("Enter the second rational number: ");
    BigInteger numerator2 = input.nextBigInteger();
    input.next();
    BigInteger denominator2 = input.nextBigInteger();

    Rational rational1 = new Rational(numerator1, denominator1);
    Rational rational2 = new Rational(numerator2, denominator2);

    Rational sum = rational1.add(rational2);
    Rational difference = rational1.subtract(rational2);
    Rational product = rational1.multiply(rational2);
    Rational quotient = rational1.divide(rational2);

    System.out.println(rational1 + " + " + rational2 + " = " + sum);
    System.out.println(rational1 + " - " + rational2 + " = " + difference);
    System.out.println(rational1 + " * " + rational2 + " = " + product);
    System.out.println(rational1 + " / " + rational2 + " = " + quotient);

    System.out.println(rational2 + " is " + rational2.doubleValue());
  }
}

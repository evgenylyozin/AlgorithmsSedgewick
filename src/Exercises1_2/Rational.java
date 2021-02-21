package Exercises1_2;

import java.util.Objects;

public class Rational {
    private long numerator;
    private long denominator;

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational plus (Rational b) {
        long commonDenominator = this.denominator*b.denominator;
        long thisNumerator = this.numerator*b.denominator;
        long thatNumerator = b.numerator*this.denominator;
        long commonNumerator = thisNumerator+thatNumerator;
        long gcd = gcd(commonNumerator,commonDenominator);
        return new Rational(commonNumerator/gcd,commonDenominator/gcd);
    }

    private long gcd(long p, long q) {
        if (q == 0) return p;
        long r = p % q;
        return gcd(q,r);
    }

    public Rational minus (Rational b) {
        long commonDenominator = this.denominator*b.denominator;
        long thisNumerator = this.numerator*b.denominator;
        long thatNumerator = b.numerator*this.denominator;
        long commonNumerator = thisNumerator-thatNumerator;
        long gcd = gcd(commonNumerator,commonDenominator);
        return new Rational(commonNumerator/gcd,commonDenominator/gcd);
    }

    public Rational times (Rational b) {
        long commonDenominator = this.denominator*b.denominator;
        long commonNumerator = this.numerator*b.numerator;
        long gcd = gcd(commonNumerator,commonDenominator);
        return new Rational(commonNumerator/gcd,commonDenominator/gcd);
    }

    public Rational divides (Rational b) {
        long commonDenominator = this.denominator*b.numerator;
        long commonNumerator = this.numerator*b.denominator;
        long gcd = gcd(commonNumerator,commonDenominator);
        return new Rational(commonNumerator/gcd,commonDenominator/gcd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(2,3);
        Rational r2 = new Rational(3,4);
        System.out.println(r1.minus(r2));
        System.out.println(r1.plus(r2));
        System.out.println(r1.times(r2));
        System.out.println(r1.divides(r2));
    }
}

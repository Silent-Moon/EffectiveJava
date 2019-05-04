package ch4.item17;

// Immutable complex number class, use final modifier on class for immutability
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
    }

    @Override
    public int hashCode() {
        // Use Java API to compute hash code
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public boolean equals(Object obj) { // Computation starts from 1. lowest cost; 2. most probable the matches.
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) obj;
        return (Double.compare(this.re, c.re) == 0) && (Double.compare(this.im, c.im) == 0);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

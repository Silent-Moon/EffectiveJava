package ch4.item17;

// Immutable class with static factories instead of constructors
public class AlternativeComplex {
    private final double re;
    private final double im;

    private AlternativeComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static AlternativeComplex valueOf(double re, double im) {
        return new AlternativeComplex(re, im);
    }

    // The rest should resemble that in Complex
}

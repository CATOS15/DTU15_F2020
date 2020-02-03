package Lektion1.Kompleks;

public interface IComplex {
    // return a string representation of the invoking Complex object
    String toString();
    double abs();
    double phase();
    IComplex plus(IComplex b);
    IComplex minus(IComplex b);
    IComplex times(IComplex b);
    IComplex scale(double alpha);
    IComplex conjugate();
    IComplex reciprocal();
    double re();
    double im();
    IComplex divides(IComplex b);
    IComplex exp();
    IComplex sin();
    IComplex cos();
    IComplex tan();

    static IComplex plus(IComplex a, IComplex b) {
        return a.plus(b);
    }

    boolean equals(Object x);
    int hashCode();
}

//public class Complex implements IComplex {
//    private double re, im;
//
//    public IComplex plus (IComplex a) {
//
//    }
//}
//
//public interface IUltra {
//
//    double ul();
//}
//
//public class UltraComplex implements IComplex, IUltra {
//    private double re, im, ul;
//
//    public UltraComplex (double re, double im, double ul) {
//        this.re = re;
//        this.im = im;
//        this.ul = ul;
//    }
//
//    public IComplex plus (IComplex a) {
//        if (a instanceof UltraComplex) {
//            UltraComplex ua = (UltraComplex)a;
//            return new UltraComplex(re + a.re(), im + a.im(), ul + ua.ul());
//        } else {
//
//        }
//    }
//}
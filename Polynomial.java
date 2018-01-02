//Name: Minjie Zhao
//USC ID: 7550095433
//USC loginid:minjiezh
//CSCI 455 PA2
//Spring 2017


import java.util.ArrayList;

/**
 A polynomial. Polynomials can be added together, evaluated, and
 converted to a string form for printing.
 */
public class Polynomial {

    ArrayList array = new ArrayList();//store coeff and expons


    /**
     Creates the 0 polynomial
     */
    public Polynomial() {


    }


    /**
     Creates polynomial with single term given
     */
    public Polynomial(Term term) {
        array.add(term);
    }


    /**
     Returns the Polynomial that is the sum of this polynomial and b
     (neither poly is modified)
     */
    public Polynomial add(Polynomial b) {
        ArrayList sumArray = new ArrayList();


        return new Polynomial();  // dummy code.  just to get stub to compile
    }


    /**
     Returns the value of the poly at a given value of x.
     */
    public double eval(double x) {
        double sum = 0;

        return 0;         // dummy code.  just to get stub to compile
    }


    /**
     Return a String version of the polynomial with the
     following format, shown by example:
     zero poly:   "0.0"
     1-term poly: "3.2x^2"
     4-term poly: "3.0x^5 + -x^2 + x + -7.9"

     Polynomial is in a simplified form (only one term for any exponent),
     with no zero-coefficient terms, and terms are shown in
     decreasing order by exponent.
     */
    public String toFormattedString() {
        return "";        // dummy code.  just to get stub to compile
    }


    // **************************************************************
    //  PRIVATE METHOD(S)

    /**
     Returns true iff the poly data is in a valid state.
     */
    private boolean isValidPolynomial() {
        return false;     // dummy code.  just to get stub to compile
    }

}
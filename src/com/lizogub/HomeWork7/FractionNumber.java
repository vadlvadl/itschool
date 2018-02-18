package com.lizogub.HomeWork7;

public class FractionNumber {
    // Fractional number
    private Integer a = 0; // a - numerator
    private Integer b = 1; // b - denominator

    private int resultA = 0;
    private int resultB = 0;

    public FractionNumber(){

    }

    public FractionNumber(int a){
        this.a = a;
        this.b = 1;
    }

    public FractionNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    /**
     * Set integer value
     * @param a
     */
    public void setNumber(int a){
        this.a = a;
        this.b = 1;
    }

    /**
     * Set Fractional number
     * @param a - numerator
     * @param b - denominator
     */
    public void setNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String getString(){
        return this.formatNumber(this.a, this.b);
    }

    /**
     * Return String with result of adding
     * @param number
     * @return
     */
    public FractionNumber add(FractionNumber number){
        if(this.b == number.b){
            this.resultA = this.a + number.a;
            this.resultB = this.b;
        } else {
            this.resultA = this.a * number.b + this.b * number.a;
            this.resultB = this.b * number.b;
        }

//        return this.formatNumber(this.resultA, this.resultB);
        return new FractionNumber(this.resultA, this.resultB);
    }

    /**
     * Return String with result of subtraction
     * @param number - subtrahend
     * @return
     */
    public FractionNumber sub(FractionNumber number){
        if(this.b == number.b){
            this.resultA = this.a - number.a;
            this.resultB = this.b;
        } else {
            this.resultA = this.a * number.b - this.b * number.a;
            this.resultB = this.b * number.b;
        }

        return new FractionNumber(this.resultA, this.resultB);
    }

    /**
     * Returns String with result of multiplication
     * @param number
     * @return
     */
    public FractionNumber mul(FractionNumber number){
        this.resultA = this.a * number.a;
        this.resultB = this.b * number.b;

        return new FractionNumber(this.resultA, this.resultB);
    }

    public FractionNumber pow(int degree){
        if(degree == 0){
            this.resultA = 1;
            this.resultB = 1;

            return new FractionNumber(this.resultA, this.resultB);
        } else if (degree < 0){
            degree = Math.abs(degree);

            this.resultA = (int) Math.pow(this.b, degree);
            this.resultB = (int) Math.pow(this.a, degree);
        } else {
            this.resultA = (int) Math.pow(this.a, degree);
            this.resultB = (int) Math.pow(this.b, degree);
        }

        return new FractionNumber(this.resultA, this.resultB);
    }

    private String formatNumber(int a, int b){
        if (a % b == 0){
            Integer result = a / b;
            return result.toString();
        } else if (a > b) {
            int residue = a % b;
            int intPart = a / b;
            return intPart + " " + residue + "/" + b;
        }
        return a + "/" + b;
    }
}

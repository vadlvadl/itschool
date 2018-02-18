package com.lizogub.HomeWork7;

public class Matrix {
    private int cols = 0;
    private int rows = 0;
    private FractionNumber[][] data;

    public Matrix(){

    }

    public Matrix(FractionNumber[][] data){
        this.data = data;
        this.detectMatrixSize();
    }

    public String getString(){
        String result = "";

        for (int i = 0; i < this.data.length; i++){
            result += "|";
            for (int j = 0; j < this.data[i].length; j++){
                result += " " + this.data[i][j] + " |";
            }
            result += "\n";
        }

        return result;
    }

    private void detectMatrixSize(){
        this.rows = this.data.length;

        for (FractionNumber[] x: this.data){
            if(x.length > this.cols){
                this.cols = x.length;
            }
        }
    }
}

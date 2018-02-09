package com.lizogub;

import java.util.Scanner;

public class HomeWork4 {
    private int gameMode = 0; // Режим игры: 1 - с компьютером, 2 - с человеком
    private int sizeField = 3; //Размер игрового поля
    private int[][] field = new int[sizeField][sizeField]; // Игровое поле
    private boolean gameOver = false;
    private char symbolPlayer1 = 'X';
    private char symbolPlayer2 = '0';

    public int counterUserWin = 0, counterComputerWin = 0;

    private void detectGameMode(){
        boolean inputActive = true;
        int mode = 0;
        Scanner scn = new Scanner(System.in);

        while (inputActive) {
            System.out.println("Выберите режим игры:\n1 - с компьютером\n2 - с человеком");
            mode = scn.nextInt();
            if ((mode == 1) || (mode == 2)) {
                this.gameMode = mode;
                inputActive = false;
            }
        }
    }

    public void printField(){
        int counter = 1;

        for(int i = 0; i < this.sizeField; i++){
            StringBuilder row = new StringBuilder("");
            for(int j = 0; j < this.sizeField; j++){
                row.append(" ");
                if(this.field[i][j] == 0) {
                    row.append(counter);
                } else {
                    if(this.field[i][j] == 1){
                        row.append(this.symbolPlayer1);
                    } else {
                        row.append(this.symbolPlayer2);
                    }
                }
                if(j < (this.sizeField -1)){
                    row.append(" |");
                }
                counter++;
            }
            System.out.println(row);
            if(i < (this.sizeField -1))System.out.println("-----------");
        }
    }

    public void makeStepUser1(){
        int id = 0;
        System.out.println("User1, ваш ход! Укажите номер ячейки, в которую хотите поставить крестик:");
        Scanner scn = new Scanner(System.in);
        do {
            if(id != 0) System.out.println("Пожалуйста, укажите пустую ячейку:");
            id = scn.nextInt();
        } while(!this.isEmptyCell(id - 1));

        id--;
        int y = id / this.sizeField;
        int x = id % this.sizeField;
        this.field[y][x] = 1;
        this.printField();
    }

    public void makeStepUser2(){
        int id = 0;
        System.out.println("User2, ваш ход! Укажите номер ячейки, в которую хотите поставить крестик:");
        Scanner scn = new Scanner(System.in);
        do {
            if(id != 0) System.out.println("Пожалуйста, укажите пустую ячейку:");
            id = scn.nextInt();
        } while(!this.isEmptyCell(id - 1));

        id--;
        int y = id / this.sizeField;
        int x = id % this.sizeField;
        this.field[y][x] = 2;

        this.printField();
    }

    private void checkGameOver(){
        int val = 0;
        for(int i=0; i < this.sizeField; i++){
            // Проверяем одинаковые ли элементы построчно
            Integer s = this.field[i][0];
            boolean lineCompleted = false;
            for(int j=1; j < this.sizeField;j++){
                if(!s.equals(this.field[i][j])) {
                    lineCompleted = false;
                    break;
                }
                lineCompleted = true;
            }
            if(lineCompleted)  {
                this.gameOver = true;
                break;
            }

            // Проверяем одинаковые ли элементы по колонкам
            Integer c = this.field[0][i];
            boolean colCompleted = false;
            for(int j=1; j < this.sizeField;j++){
                if(!c.equals(this.field[i][j])) {
                    colCompleted = false;
                    break;
                }
                colCompleted = true;
            }
            if(colCompleted) {
                this.gameOver = true;
                break;
            }
        }

    }

    private boolean isEmptyCell(int cell){
        int rangeStart = 0;
        int rangeEnd = this.sizeField * this.sizeField - 1;
        if((cell < rangeStart) || (cell > rangeEnd)) return false;
        int y = cell / this.sizeField;
        int x = cell % this.sizeField;
        return (this.field[y][x] == 0) ? true : false;
    }

    public void start() {
       this.detectGameMode();

       while(!this.gameOver){
           this.printField();

           this.makeStepUser1();
           checkGameOver();
           this.makeStepUser2();
           checkGameOver();
       }

       System.out.println(this.gameMode);
  }
}

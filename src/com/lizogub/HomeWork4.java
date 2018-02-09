package com.lizogub;

import java.util.Scanner;

public class HomeWork4 {
    private int gameMode = 0; // Режим игры: 1 - с компьютером, 2 - с человеком
    private int sizeX = 3, sizeY = 3, fieldSize = 3; //Размер игрового поля
    private int[][] field = new int[sizeY][sizeX]; // Игровое поле
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

        for(int i = 0; i < this.sizeY; i++){
            StringBuilder row = new StringBuilder("");
            for(int j = 0; j < this.sizeX; j++){
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
                if(j < (this.sizeX -1)){
                    row.append(" |");
                }
                counter++;
            }
            System.out.println(row);
            if(i < (this.sizeY -1))System.out.println("-----------");
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
        int y = id / this.sizeX;
        int x = id % this.sizeX;
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
        int y = id / this.sizeX;
        int x = id % this.sizeX;
        this.field[y][x] = 2;

        this.printField();
    }

    private void checkGameOver(){
        int val = 0;
        for(int i=0; i < this.sizeY; i++){
            for(int j=0; j < this.sizeX;j++){

            }
        }
    }

    private boolean isEmptyCell(int cell){
        int y = cell / this.sizeX;
        int x = cell % this.sizeX;
        return (this.field[y][x] == 0) ? true : false;
    }

    public void start() {
       this.detectGameMode();

       while(!this.gameOver){
           this.printField();

           this.makeStepUser1();
           this.makeStepUser2();
       }

       System.out.println(this.gameMode);
  }
}

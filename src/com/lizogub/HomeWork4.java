package com.lizogub;

import java.util.Scanner;

public class HomeWork4 {
    private int boardSize = 3; //Размер игрового поля
    private int[][] boardValues = new int[boardSize][boardSize]; // Игровое поле
    private  int boardInitValue = 8; // Начальное значение каждой клетки поля, должно быть больше 1
    private boolean gameOver = false;
    private char symbolPlayer1 = 'X';
    private char symbolPlayer2 = '0';

    public int counterWinUser1 = 0, counterWinUser2 = 0;
    public boolean draw = false;
    public String winnerName = "", user1Name = "" , user2Name = "";
    
    private void init(){
        this.gameOver = false;
        this.draw = false;

        for(int i = 0; i < this.boardSize; i++){
            for(int j = 0; j < this.boardSize; j++){
                this.boardValues[i][j] = this.boardInitValue;
            }
        }
    }

    public void printBoard(){
        int counter = 1;

        System.out.println("\n\n----------------------\n\n");

        for(int i = 0; i < this.boardSize; i++){
            StringBuilder row = new StringBuilder("");
            for(int j = 0; j < this.boardSize; j++){
                row.append(" ");
                if(this.boardValues[i][j] == this.boardInitValue) {
                    row.append(counter);
                } else {
                    if(this.boardValues[i][j] == 0){
                        row.append(this.symbolPlayer1);
                    } else {
                        row.append(this.symbolPlayer2);
                    }
                }
                if(j < (this.boardSize -1)){
                    row.append(" |");
                }
                counter++;
            }
            System.out.println(row);
            if(i < (this.boardSize -1))System.out.println("-----------");
        }

        System.out.println("\n\n----------------------\n\n");
    }

    public void makeStep(int userN){
        int id = 0;

        if(userN == 0){
            System.out.println(this.user1Name + ", ваш ход! Укажите номер ячейки, в которую хотите поставить крестик:");
        } else {
            System.out.println(this.user2Name + ", ваш ход! Укажите номер ячейки, в которую хотите поставить крестик:");
        }

        Scanner scn = new Scanner(System.in);
        do {
            if(id != 0) System.out.println("Пожалуйста, укажите пустую ячейку:");
            id = scn.nextInt();
        } while(!this.isEmptyCell(id - 1));

        id--;
        int y = id / this.boardSize;
        int x = id % this.boardSize;
        this.boardValues[y][x] = userN;
        this.printBoard();
    }

    private boolean checkEmptyCells(){
        boolean emptyCellsAvailable = false;

        for(int i=0; i < this.boardSize; i++){
            for(int j=0; j < this.boardSize;j++){
                if(this.boardValues[i][j] == this.boardInitValue){
                    emptyCellsAvailable = true;
                }
            }
        }

        return emptyCellsAvailable;
    }

    private void checkGameOver(){
        int rowSum, colSum , diag1Sum, diag2Sum;
        boolean lineCompleted = false;

        for(int i=0; i < this.boardSize; i++){
            rowSum = 0;
            colSum = 0;
            diag1Sum = 0;
            diag2Sum = 0;

            for(int j=0; j < this.boardSize;j++){
                rowSum += this.boardValues[i][j];
                colSum += this.boardValues[j][i];
                diag1Sum += this.boardValues[j][j];
                diag2Sum += this.boardValues[j][this.boardSize - j - 1];
            }

            if((rowSum == 0) || (colSum == 0) || (diag1Sum == 0) || (diag2Sum == 0))  {
                lineCompleted = true;
                this.counterWinUser1++;
                this.winnerName = this.user1Name;
            }
            if((rowSum == 3)|| (colSum == 3) || (diag1Sum == 3) || (diag2Sum == 3))  {
                lineCompleted = true;
                this.counterWinUser2++;
                this.winnerName = this.user2Name;
            }
            if (lineCompleted){
                this.gameOver = true;
                break;
            }
        }
        if((lineCompleted == false) && (this.checkEmptyCells() == false)){
            this.gameOver = true;
            this.draw = true;
        }
    }

    private boolean isEmptyCell(int cell){
        int rangeStart = 0;
        int rangeEnd = this.boardSize * this.boardSize - 1;
        if((cell < rangeStart) || (cell > rangeEnd)) return false;
        int y = cell / this.boardSize;
        int x = cell % this.boardSize;
        return (this.boardValues[y][x] == this.boardInitValue) ? true : false;
    }

    public void start() {
        int userSwitch = 0; // User number

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя для игрока 1:");
        if(scn.hasNextLine()){
            this.user1Name = scn.nextLine();
        } else {
            this.user1Name = "Player1";
        }

        System.out.println("Введите имя для игрока 2:");
        if(scn.hasNextLine()){
            this.user2Name = scn.nextLine();
        } else {
            this.user2Name = "Player2";
        }

        while(true) {
            this.init();

            while (!this.gameOver) {
                this.printBoard();

                this.makeStep(userSwitch);

                if (userSwitch == 0) {
                    userSwitch = 1;
                } else {
                    userSwitch = 0;
                }

                checkGameOver();
            }

            if(this.draw){
                System.out.println("Данная партия окончена. Ничья.");
            } else {
                System.out.println("В этой партии победил " + this.winnerName);
            }
            System.out.println("Количество очков:\n  " + this.user1Name + " - " + this.counterWinUser1 + "\n  " + this.user2Name + " - " + this.counterWinUser2);
            System.out.println("Желаете продолжить? (Y/n)");

            if(scn.hasNext() && (scn.next().startsWith("y"))){
                continue;
            } else {
                System.out.println("Спасибо за игру!");
                break;
            }
        }
  }
}

package com.example.trisqchecker.logic;

public class sq {
    int number;

    public sq(int num){

        number = num;
    }

    public boolean checkPerfectSquare(){

        double sq = Math.sqrt(number);
        return ((sq - Math.floor(sq)) == 0);

    }
}

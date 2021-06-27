package com.example.trisqchecker.logic;

public class tri {
    private int number;
    public tri(int num){
        number = num;
    }
    public boolean isTriangular() {
        if (number < 0)
            return false;
        int sum = 0;
        for (int n = 1; sum <= number; n++) {
            sum = sum + n;
            if (sum == number)
                return true;
        }
        return false;
    }
}
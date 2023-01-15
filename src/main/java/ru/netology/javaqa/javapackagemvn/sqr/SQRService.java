package ru.netology.javaqa.javapackagemvn.sqr;

public class SQRService {
    public int calcSqrt(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 100; i++) {
            int root = i * i;
            if (root >= min) {
                if (root <= max) {
                    counter++;

                }
            }
        }
        return counter;
    }
}


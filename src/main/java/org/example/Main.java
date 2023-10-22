package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public boolean isPrime(int number){
        if (number == 1 || number == 2 || number == 3){
            return true;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public boolean isMultiple(int number, int divisor){
        return number % divisor == 0;
    }


}

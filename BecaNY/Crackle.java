package Ejercicios.BecaNY;

public class Crackle {
        public void divisibleBy3() {
            if (100 % 3 == 0){
                System.out.println("Crackle");
            }
            if (100 % 5 == 0) {
                System.out.println("Pop");
            }
            if (100 % (3 & 5) == 0) {
                System.out.println("CracklePop");
            }
        }
    }


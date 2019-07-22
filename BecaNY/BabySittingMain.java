package Ejercicios.BecaNY;

public class BabySittingMain {
    public static void main(String[] args) {

            Baby baby = new Baby();
            BabySitter babySitter = new BabySitter();

            System.out.println("Does baby feels good? " + baby.feelsGood());

            System.out.println("From 1 to 10, whats the mood of the baby sitter today? "+ babySitter.goodMood());

        }
    }

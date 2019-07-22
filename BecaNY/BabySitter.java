package Ejercicios.BecaNY;

public class BabySitter implements BabySitting {
    public Integer babiesToday = 1;
    public Integer restingHours = 9;

    public Integer sleepHoursNeeded() {
        return Baby.sleepingHours + 5;
    }

    public int goodMood(){
        return (this.restingHours + this.babiesToday);
    }

    @Override
    public Boolean feelsGood() {
        return null;
    }
}
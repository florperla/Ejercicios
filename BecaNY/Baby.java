package Ejercicios.BecaNY;

public class Baby implements BabySitting {

    public Boolean cryingTimes(){
        return this.sleepingHours < 8;
    }

    public Boolean wantToEat(){
        return this.feedingTimes < 4;
    }

    public Boolean feelsGood(){
        return (sleepingHours + feedingTimes >= 10);
    }
}

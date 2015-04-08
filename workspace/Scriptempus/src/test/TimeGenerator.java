package test;

public class TimeGenerator {
    private int hour;
    private int minutes;
    private boolean past;
    private boolean before;
    private boolean half;

    public TimeGenerator(int hour, int minutes) {
        setValues(hour, minutes);
    }

    public void setValues(int hour, int minutes) {
        this.hour = hour;
        minutes = roundToNearestFive(minutes).intValue();

        if (minutes > 27)
            this.minutes = minutes - 30;
        else
            this.minutes = minutes;
        
        if ((minutes > 32 && minutes < 38) || (minutes < 23 && minutes > 2))
            this.past = true;
        if (minutes > 22 && minutes < 28) {
            this.minutes = 5;
            this.before = true;
        }
        if (minutes > 22)
        {
            if (this.hour == 12 || this.hour == 0)
                this.hour = 1;
            else if (this.hour > 12)
                this.hour = this.hour - 11;
            else
                this.hour++;
        }else{
            if (this.hour == 12 || this.hour == 0)
                this.hour = 0;
            else
                this.hour = this.hour - 11;
        }
        if (minutes > 37) {
            this.minutes = 30 - this.minutes;
            if (this.minutes > 0)
                this.before = true;
        }
        if (minutes > 22 && minutes < 38)
            this.half = true;

    }

    public Double roundToNearestFive(int number) {
        Double num = Double.parseDouble(number + "");
        if (num % 5 == 0)
            return num;
        else if (num % 5 < 2.5)
            num = num - num % 5;
        else
            num = num + (5 - num % 5);
        return num;
    }

    @Override
    public String toString() {
        String out = "Es isch ";
        if (minutes != 0)
            out += minutes + " ";
        if (past)
            out += "ab ";
        if (before)
            out += "vor ";
        if (half)
            out += "haubi ";
        out += hour + "i";
        return out;
    }
}


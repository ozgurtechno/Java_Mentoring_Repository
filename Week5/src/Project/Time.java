package Project;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours){
        this.hours = hours;
    }

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getDayPart(){
        if(hours >= 5 && hours < 12)
            return "morning";
        else
        if(hours >= 12 && hours < 17)
            return "afternoon";
        else
        if(hours >= 17 && hours < 21)
            return "evening";
        else
            return "night";
    }

    public void showTime(boolean isTwelveHourFormat){
        if(isTwelveHourFormat){
            if(hours >= 12)
                System.out.println(hours-12 + ":" + minutes + ":" + seconds + " PM");
            else
                System.out.println(hours + ":" + minutes + ":" + seconds + " AM");
        }
        else
            System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

package module7;

public class Time {

    public final static Time ONE_HOUR = new Time(1, 0, 0);
    public final static Time ONE_DAY = new Time(24, 0, 0);
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public static int convertToSeconds(Time time) {
        return time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
    }

    public Time addTime(Time other) {
        int otherSeconds = convertToSeconds(other);
        int thisSeconds = convertToSeconds(this);
        int res = otherSeconds + thisSeconds;
        return new Time(res / 3600, (res % 3600) / 60, res % 60);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}

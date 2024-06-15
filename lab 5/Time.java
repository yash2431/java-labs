public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void addTime(Time otherTime) {
        this.minute += otherTime.minute;
        this.hour += otherTime.hour + this.minute / 60;
        this.minute %= 60;
        this.hour %= 24;
    }

    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    public static void main(String[] args) {
        Time time1 = new Time(10, 30);
        Time time2 = new Time(2, 45);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);

        time1.addTime(time2);

        System.out.println("Time 1 + Time 2: " + time1);
    }
}

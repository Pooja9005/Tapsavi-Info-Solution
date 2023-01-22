public class Main {

    public static void main(String[] args) {
        prinDayOfWeek(0);
        prinDayOfWeek(1);
        prinDayOfWeek(2);
        prinDayOfWeek(3);
        prinDayOfWeek(4);
        prinDayOfWeek(5);
        prinDayOfWeek(6);
        prinDayOfWeek(7);

    }
    public static void prinDayOfWeek(int day) {
        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        }else if (day == 1) {
            dayOfWeek = "Monday";
        }else if (day == 2) {
            dayOfWeek = "Wednesday";
        }else if (day == 4) {
            dayOfWeek = "Thursday";
        }else if (day == 5) {
            dayOfWeek = "Friday";
        }else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + "stand for " + dayOfWeek);


    }
}

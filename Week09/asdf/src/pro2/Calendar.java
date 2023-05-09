package pro2;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar cal = java.util.Calendar.getInstance();

        int year = cal.get(cal.YEAR);
        int month = cal.get(cal.MONTH) + 1;
        int date = cal.get(cal.DATE);
        int dayOfWeek = cal.get(cal.DAY_OF_WEEK);


        String[] weekDays = {"일", "월", "화", "수", "목", "금", "토"};
        String[] sun = {"오전","오후"};

        int amPm = cal.get(cal.AM_PM);

        int hour = cal.get(cal.HOUR);
        int minute = cal.get(cal.MINUTE);
        int second = cal.get(cal.SECOND);

        System.out.println( year+ "년 "+ month+"월 "+ date+"일");
        System.out.println(weekDays[dayOfWeek-1]+"요일 " + sun[amPm]);
        System.out.println(hour+"시 "+minute+"분 "+second+"초 ");

    }
}

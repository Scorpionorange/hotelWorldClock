/**
 * Created by ScorpionOrange on 2016/10/02.
 */
public class HotelWorldClockTest {
    public static void main(String[] args){

        /*
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"));
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour12 = calendar.get(Calendar.HOUR);
        int hour24 = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year + "-" + month + "-" + day);
        System.out.println("in 12 hours format: " + hour12 + ":" + minute + ":" + second);
        System.out.println("in 24 hours format: " + hour24 + ":" + minute + ":" + second);
        */

        HotelEmployee John_Smith = new HotelEmployee();
        String[] citys = {"北京", "东京", "南京",""};
        int[] cityTimeZones = {1, 2, 3, 0};
        John_Smith.updateWorldClock(citys, cityTimeZones);
    }
}

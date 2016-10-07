import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ScorpionOrange on 2016/10/02.
 */
public class WorldClock {
    // 当前系统的城市名称
    private String currentCityName = "北京";

    // 当前系统的毫秒数
    private long currentSystemMilliSecond = System.currentTimeMillis();

    // 当前系统的时区
    private int currentSystemTimeZone = 8;

    // 转换成GMT时区的毫秒数及时间
    private long GMTMilliSecond = currentSystemMilliSecond - 3600000*currentSystemTimeZone;
    //private Date GMTTime = new Date(GMTMilliSecond);
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd EEEE HH:mm:ss");

    /* 打印输出带格式的GMT时间
     * System.out.println(simpleDateFormat.format(GMTTime));
     */

    String citytName; // 世界时钟所显示的城市名称；
    int cityTimeZone; // 世界时钟所显示的城市的时区，按-12 ~ +12显示；
    long ciytMilliSecond; // 该时区的毫秒数；
    Date cityTime; // 该时区的时间；

    public WorldClock(){
        citytName = "格林威治";
        cityTimeZone = 0;
        ciytMilliSecond = GMTMilliSecond;
        cityTime = new Date(ciytMilliSecond);
    }

    public WorldClock(String citytName, int cityTimeZone){
        this.citytName = citytName;
        this.cityTimeZone = cityTimeZone;
        ciytMilliSecond = GMTMilliSecond + 3600000*cityTimeZone;
        cityTime = new Date(ciytMilliSecond);
    }

    // 貌似没什么用；
    /*
    public void setCurrentCity(String citytName, int cityTimeZone){
        this.currentCityName = cityName;
        this.currentSystemTimeZone = cityTimeZone;
    }
    */

    public void getTime(){
        System.out.println(" " + citytName + " 当前的时间是：" + simpleDateFormat.format(cityTime));
    }
}

/**
 * Created by ScorpionOrange on 2016/10/02.
 */
public class HotelEmployee {
    public void updateWorldClock(String[] cityNames, int[] cityTimeZones){
        if(cityNames.length == 0 || cityTimeZones.length == 0){
            System.out.println("城市列表或时区列表错误，请重新核对！");
        }
        else if (cityNames.length != cityTimeZones.length){
            System.out.println("城市列表与时区列表不一致，请重新核对！");
        }
        else {
            for(int i = 0; i < cityNames.length; i ++ ){
                if(cityNames[i].equals("") || cityTimeZones.equals("")){
                    new WorldClock().getTime();
                }
                else {
                    new WorldClock(cityNames[i], cityTimeZones[i]).getTime();
                }
            }
        }
    }
}

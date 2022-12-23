import java.time.ZonedDateTime;

/**
 * @author l moonlight
 * @create 2022-12-22 23:16
 */

public class T2 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now(); //默认时区
        System.out.println(dateTime);
        //2020-12-22T23:18:02.571+08:00[Asia/Shanghai]
    }
}

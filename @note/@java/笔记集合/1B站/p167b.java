import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class p167b {
    public static void main(String[] args)throws ParseException{
        // 计算 我活了多少天

                // JDK7
        // 计算毫秒
        // String birthday = "2004年4月16日";

        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd天");

        // Date date = sdf.parse(birthday);
        // long birthdayTime = date.getTime();

        // 当前时间
        // long todayTime = System.currentTimeMillis();

        // 计算 隔离多少天
        // long time = System.currentTimeMillis();
        // System.err.println(time /1000/60/60/24);



                    // JDK8
           LocalDate ld1 = LocalDate.of(2004,4,16);
           LocalDate ld2 = LocalDate.now();

           long days = ChronoUnit.DAYS.between(ld1, ld2);
           System.err.println(days);
           
    }
}

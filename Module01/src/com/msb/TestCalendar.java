package src.com.msb;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2020/12/28 - 上午11:21
 * @Description: src.com.msb
 * @version: 1.0
 */
public class TestCalendar {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想要查看的日期（提示：请按照例如2012-5-6的格式书写）：");
        String strDate = sc.next();
        //string---->Date
        java.sql.Date date = java.sql.Date.valueOf(strDate);
//        System.out.println(date);
        //Date----->Calendar
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
//        System.out.println(cal);
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        int maxDay = cal.getActualMaximum(Calendar.DATE);
        int nowDay = cal.get(Calendar.DATE);

        cal.set(Calendar.DATE, 1);
        int num = cal.get(Calendar.DAY_OF_WEEK);
        int day = num - 1;
//        System.out.println(day);
        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= maxDay; i++) {
            if (i == nowDay) {
                System.out.print(i + "*" + "\t");
            } else {
                System.out.print(i + "\t");
            }
            if ((i+day)%7 == 0) {
                System.out.println();
            }
        }
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(18);
        list.add(39);
        list.add(60);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

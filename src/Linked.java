import java.text.SimpleDateFormat;
import java.util.*;

public class Linked {
    public static void main(String[] args) {

//        LinkedList <String> list = new LinkedList<>();
//        list.add("dasd");
//        list.add("vxcvx");
//        list.add("dgfgdfg");
//        list.add("derter");
//
//        System.out.println(list);
//
//
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(123,"Petia");
//        map.put(323,"Susan");
//        map.put(302,"Dan");
//        map.put(101,"Gleb");
//
//        System.out.println(map);
//
//        Set<Integer> setI = new HashSet<>(map.keySet());
//        System.out.println(setI);
//
//        ArrayList<String> arrayList = new ArrayList<>(map.values());
//        System.out.println(arrayList);
//
//        Calendar calendar = new GregorianCalendar(2018,Calendar.JANUARY,24);
//        System.out.println( calendar.get(Calendar.DAY_OF_YEAR));
        String date = "JUL 22 2013";

        Date date1 = new Date(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(calendar.getTime());

        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));


//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateF);
//        System.out.println(simpleDateFormat.format(calendar.getTime()));

//        Date date = calendar.getTime();
//        System.out.println(date);
//
//        Date date2 = new Date("MAY 1 2017");
//        System.out.println(date2.getDay());









    }



}

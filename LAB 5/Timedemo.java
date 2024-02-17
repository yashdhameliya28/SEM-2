public class Timedemo {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        t1.hour = 2;
        t1.minutes = 35;
        t1.second = 80;
        
        t2.hour = 3;
        t2.minutes = 45;
        t2.second = 30;

        t1.add(t2);
        System.out.println(t1.hour);
        System.out.println(t1.minutes);
        System.out.println(t1.second);
    }
}

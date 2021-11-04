import java.util.*;


class Main {

    public static void main(String[] args) {
        ByTwos byTows = new ByTwos();
        //ByThrees byThrees = new ByThrees();
        //Series.printStuff();
        byTows.printStuff();
        Series ob;
        //Static: without making an object
        //System.out.println((Series.Max));
        for (int i=0; i< 6; i++){
            ob = byTows;
            //System.out.println(byTows.getNext());
            System.out.println("ByTwos:" + ob.getNext());
            //ob = byThrees;
            //System.out.println("ByThrees:" + ob.getNext());
        }



    }
}

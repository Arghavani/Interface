public class ByThrees implements Series {
    int val;
    //constructor
    ByThrees(){
        val = 0;
    }
    public int getNext(){
        val +=3;
        return val;
    }
}

public class ByTwos implements Series {
    int val;
    //constructor
    ByTwos(){
        val = 0;
    }
    public int getNext(){
        if(val >=Max){
            System.out.println(ErrorMSG);
            System.out.println("I am here");

        }else {


            val += 2;
        }
        return val;
    }
    public int getPrev(){
        val -= 2;
        return val;
    }
    /*public void printStuff(){
        System.out.println("I am ByTwos Class.");
    }*/
    //this is a comment
    public void printSome(){
        System.out.println("hey good morning");
    }
    public void print2Some(String todo){
        System.out.println("to do");
    }
    public void feature2() {
        System.out.println("to do ");
    }
}

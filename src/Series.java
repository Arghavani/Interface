public interface Series {
    int Max = 10;
    String ErrorMSG = "Cannot go above value:" + Max;
    int getNext();
// this is a default method
   /* default void printStuff(){
        System.out.println("Live From New York. It's Satarday Night.");
    }*/
    default void printStuff(){
        System.out.println("Live From New York. It's Satarday Night.");
        printMoreStuff();
    }

    private void printMoreStuff(){
        System.out.println("More Stuff");
    }

}

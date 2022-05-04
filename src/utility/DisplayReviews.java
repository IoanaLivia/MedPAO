package utility;
import entities.Review;

public class DisplayReviews {
    private static Review[] arrRev = new Review[1000];
    private static int index = 0;

    public static void incrIndex(){
        index += 1;
    }

    public static void insert(Review r){
        arrRev[index] = r;
        incrIndex();
    }

    public static void display() {
        index = 0;
        while(index < 10){
            if(arrRev[index] == null) break;
            System.out.println(arrRev[index]);
            incrIndex();
        }
    }
}

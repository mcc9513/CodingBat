import static java.lang.Math.abs;

public class CodingBat {
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking){
            if(hour<7 || hour>20){
                return true;
            }
            return false;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 20));
    }
}




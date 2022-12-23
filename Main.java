import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static final int rep = 50000;
    public static void main(String[] args) {
        int total = 0;
        boolean[] bulbs = new boolean[6];
        for (int j = 0; j < rep; j++) {

            for (boolean bulb : bulbs) {
                bulb = false;
            }
            int counter =0;
            boolean result = false;

            while (!result){
                //int randomNum = ThreadLocalRandom.current().nextInt(0, 6);
                Random random = new Random();
                int randomNum = random.nextInt(6);
                bulbs[randomNum] = !bulbs[randomNum];
                result = bulbs[0] && bulbs[1] && bulbs[2] && bulbs[3] && bulbs[4] && bulbs[5];
                counter++;
            }
            total += counter;
        }
        System.out.println("Avg. required repeat:" + total/rep);
    }
}
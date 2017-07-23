/**
 * Created by chamod on 7/23/17.
 */
public class Main {
    public static void main(String[] args) {
        CountMinSketch<Integer> countMinSketch = new CountMinSketch<Integer>(0.01, 0.1);

        countMinSketch.insert(120);
        countMinSketch.insert(120);
        countMinSketch.insert(120);

        countMinSketch.insert(550);
        countMinSketch.insert(550);

        countMinSketch.insert(300);
        countMinSketch.insert(300);
        countMinSketch.insert(300);
        countMinSketch.insert(300);
        countMinSketch.insert(300);

        for(int i = 0; i < 100; i++){
            countMinSketch.insert(i);
        }


        System.out.println("Count of 120 : " + countMinSketch.approximateCount(120));
        System.out.println("Count of 550 : " + countMinSketch.approximateCount(550));
        System.out.println("Count of 300 : " + countMinSketch.approximateCount(300));


        for(int i = 0; i < 100; i++){
            System.out.println("Count of " + i + " : " + countMinSketch.approximateCount(i));
        }
    }
}

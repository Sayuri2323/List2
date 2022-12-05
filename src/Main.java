import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> divisorsOf52=new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(25);
        divisorsOf52.add(52);
        System.out.println(divisorsOf52);

        List<Integer> randomNumbers=new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.size());
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);
    }
}
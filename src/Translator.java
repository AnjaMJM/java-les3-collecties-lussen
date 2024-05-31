import java.util.HashMap;
import java.util.Map;

public class Translator {

    Map<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] alphabetic, int[] numeric){
        for (int i = 0; i < numeric.length ; i++) {
//            numeric[i] = Integer.valueOf(alphabetic[i]);
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number){

        return numericAlpha.get(number);
    }
}

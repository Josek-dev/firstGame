import java.util.Arrays;

public class fillTheArray {

        drawTheNumber toDraw = new drawTheNumber();
        String winPerson = toDraw.getName();
        int howMany = winPerson.length();

        String[] bottoms = new String[howMany];

        public String getBottoms() {
            Arrays.fill(bottoms, "_");
            String printed = Arrays.toString(bottoms).substring(1).replace("]", "").replace(",", "");
            return printed;
        }
    }


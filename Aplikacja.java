public class Aplikacja {
    public static void main(String args[]) {
        drawTheNumber toDraw = new drawTheNumber();
        fillTheArray toFill = new fillTheArray();

        int winner = toDraw.getNumber();
        String printed = toFill.getBottoms();

        String winPerson = toDraw.getName();


        System.out.println("Zwycięski numer to: " + (winner+1) + " czyli słowo: " +winPerson);
        System.out.println("Uzupełnij słowo: " +printed );
    }
}

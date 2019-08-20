public class drawTheNumber {

    private String[] stringsToChoice = new String[]{"Alan", "Mann", "Kota"};
    private int n = stringsToChoice.length;

    private int Number = (int) (Math.random() * n);
    private String Word = stringsToChoice[Number];

    public int getNumber() {
        int number = Number;
        return number;
    }
    public String getName() {
        String word = Word;
        return word;
    }
}





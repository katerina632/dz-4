public class SecondClass {

    private int someValue = 1;

    public String newString() {
        String newString = String.format("---<%d>---",someValue);
        System.out.println(newString);
        return newString;
    }
}

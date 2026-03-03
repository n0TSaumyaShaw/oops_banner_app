public class test {

    public static void main(String[] args) {

        // Inline declaration and initialization using String.join()
        String[] lines = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", "*     *", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*       ", "     * ", "     * "),
            String.join("   ", "*     *", "*       ", "*    *  ", "*    *  "),
            String.join("   ", " ***** ", "*       ", " ***** ", " ***** ")
        };

        // Enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
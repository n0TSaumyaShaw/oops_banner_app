public class OOPSBannerApp {

    public static void main(String[] args) {

        // Populate banner using helper methods
        String[] lines = {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        // Print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Method to construct each full banner row
    public static String buildLine(int row) {
        return String.join("   ",
                buildO(row),
                buildO(row),
                buildP(row),
                buildS(row)
        );
    }

    // Pattern for letter O
    public static String buildO(int row) {
        String[] pattern = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return pattern[row];
    }

    // Pattern for letter P
    public static String buildP(int row) {
        String[] pattern = {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
        return pattern[row];
    }

    // Pattern for letter S
    public static String buildS(int row) {
        String[] pattern = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        return pattern[row];
    }
}
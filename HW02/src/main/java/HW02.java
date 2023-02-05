
public class HW02 {
    public static void main(String[] args) {
        String first = "Check string";
        String second = "Check string";
        StringBuilder third_str = new StringBuilder();
        String third = "gnirts kcehC";
        third_str.append(third);
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(third_str.reverse().toString().equals(first));

        int a = 3;
        int b = 56;
        StringBuilder mathABsum = new StringBuilder();
        mathABsum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        System.out.println(mathABsum);
        System.out.println(mathABsum.insert(mathABsum.indexOf("="), "равно").deleteCharAt(mathABsum.indexOf("=")));

        StringBuilder mathABdif = new StringBuilder();
        mathABdif
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
        System.out.println(mathABdif);
        System.out.println(mathABdif.insert(mathABdif.indexOf("="), "равно").deleteCharAt(mathABdif.indexOf("=")));

        StringBuilder mathABmult = new StringBuilder();
        mathABmult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mathABmult);
        System.out.println(mathABmult.replace(mathABmult.indexOf("="), mathABmult.indexOf("=") + 1, "равно"));

        StringBuilder mathABdiv = new StringBuilder();
        mathABdiv
                .append(a)
                .append(" / ")
                .append(b)
                .append(" = ")
                .append((float)a / b);
        System.out.println(mathABdiv);
        System.out.println(mathABdiv.replace(mathABdiv.indexOf("="), mathABdiv.indexOf("=") + 1, "равно"));

        StringBuilder testStrB = new StringBuilder();
        String testStr = new String();
        for (int i = 0; i < 10001; i++) {
            testStrB.append("=");
            testStr += "=";
        }
        long startSB = System.currentTimeMillis();
        for (int i = 0; i < 10001; i++) {
            testStrB.replace(testStrB.indexOf("="), testStrB.indexOf("=") + 1, "равно");
        }
        System.out.println(System.currentTimeMillis() - startSB);
        long startStr = System.currentTimeMillis();
        String newTestStr = testStr.replace("=", "равно");
        System.out.println(System.currentTimeMillis() - startStr);
        System.out.println(newTestStr);
    }
}

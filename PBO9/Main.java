// Sri Wahyuni KH
//TI22 I
// 20220040117

public class Main {
    public static void main(String[] args) {
        String text = "AYUNI";
        int length = text.length();

        for (int i = 0; i < length; i++) {
            System.out.println(text.substring(0, length - i) + "* ".repeat(i));
        }

        for (int i = 0; i < length; i++) {
            System.out.print("* ".repeat(i));
            System.out.print(text.charAt(i));
            System.out.println("* ".repeat(length - i - 1));
        }

        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() / 2) {
                System.out.println(text);
            } else {
                System.out.println("* * *" + text.charAt(i) + "* * *");
            }
        }
    }

}
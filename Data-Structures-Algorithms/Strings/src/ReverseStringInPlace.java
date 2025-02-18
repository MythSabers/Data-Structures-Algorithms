public class ReverseStringInPlace {
    public static void main(String[] args) {
        char[] c = "I am a human".toCharArray();
        reverseWords(c);
        printReverse(c);
    }

    public static void reverseWords(char[] c) {
        int start = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                reverse(c, start, i - 1);
                start = i + 1;
            }
        }

        reverse(c, start, c.length - 1);
        reverse(c, 0, c.length - 1);
    }

    public static void reverse(char[] c, int low, int high) {
        while (low <= high) {
            char temp = c[low];
            c[low] = c[high];
            c[high] = temp;

            low++;
            high--;
        }
    }

    public static void printReverse(char[] c) {
        for (char i : c)
            System.out.print(i);
    }
}

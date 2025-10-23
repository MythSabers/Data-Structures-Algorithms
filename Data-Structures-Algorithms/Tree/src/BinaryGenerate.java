public class BinaryGenerate {
    public static void main(String[] args) {
        generate(3, "");
    }

    public static void generate(int n, String current) {
        if (current.length() == n) {
            System.out.println(current);
            return;
        }
        generate(n, current + "0");
        generate(n, current + "1");
    }
}

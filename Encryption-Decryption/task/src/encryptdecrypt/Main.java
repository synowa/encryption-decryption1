package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String data = "";
        int key = 0;
        for (int i = 0; i < args.length - 1; i++) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            } else if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            } else if ("-data".equals(args[i])) {
                data = args[i + 1];
            }
        }

        char[] charsFromMessage = data.toCharArray();
        if ("enc".equals(mode)) {
            for (char c : charsFromMessage) {
                c = (char) (c + key);
                System.out.print(c);
            }
        } else if ("dec".equals(mode)) {
            for (char c : charsFromMessage) {
                if (c - key <= 122) {
                    c = (char) (c - key);
                } else {
                    c = (char) (c - key + 26);
                }
                System.out.print(c);
            }
        }
    }
}
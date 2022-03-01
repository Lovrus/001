package DomZad;

class Parser {
    public Parser() {
    }

    public static void main(String[] var0) {
        String[] var1 = var0;
        int var2 = var0.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            String var4 = var1[var3];

            try {
                String[] var5 = var4.split("=");
                if (var5[0].equals("--param")) {
                    System.out.println("Have `--param` with value: " + var5[1]);
                }
            } catch (ArrayIndexOutOfBoundsException var6) {
                System.out.println("'" + var4 + "' in not valid '--key=value' argument");
            }
        }

    }
}
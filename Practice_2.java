class Practice_2 {
    public static void print() {
        int n = 6;
        int m = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n  || j == 1|| j == m ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   "); // print space inside the box
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        print();
    }
}

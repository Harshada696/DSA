public class Pattern {

    public void SolidSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void HalloBox(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void RightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void InvertedRightAngledTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void PyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void HallowPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void DiamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void SandglassPattern(int n) {
    // Upper inverted triangle
    for (int i = 0; i < n; i++) {
        // Spaces
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 0; j < 2 * (n - i) - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Lower triangle
    for (int i = 1; i < n; i++) {
        // Spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public void ButterflyPattern(int n) {
    // Upper half
    for (int i = 1; i <= n; i++) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Lower half
    for (int i = n; i >= 1; i--) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

    public void ZigZagPattern(int n) {
        for (int i = 1; i <= 3; i++) { // Always 3 rows for zig-zag pattern
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void FloydsTriangle(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
}
    public void BinaryTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((i + j) % 2 + " ");
        }
        System.out.println();
    }
}




    public static void main(String[] args) {
        int n = 5;
        Pattern p = new Pattern();

        System.out.println("1. SOLID SQUARE PATTERN");
        p.SolidSquare(n);

        System.out.println("2. HALLOW BOX PATTERN");
        p.HalloBox(n);

        System.out.println("3. RIGHT ANGLE TRIANGLE PATTERN");
        p.RightAngledTriangle(n);

        System.out.println("4. INVERTED RIGHT ANGLE TRIANGLE");
        p.InvertedRightAngledTriangle(n);

        System.out.println("5. PYRAMID PATTERN");
        p.PyramidPattern(n);

        System.out.println("6. HALLOW PYRAMID PATTERN");
        p.HallowPyramidPattern(n);

        System.out.println("7. DIAMOND PATTERN");
        p.DiamondPattern(n);
        System.out.println("8. BUTTERFLY PATTERN:");
        p.ButterflyPattern(n);

        System.out.println("9. SANDGLASS PATTERN:");
        p.SandglassPattern(n);
        System.out.println("10. ZIG-ZAG PATTERN:");
        p.ZigZagPattern(n);
        System.out.println("11. FLOYD'S TRIANGLE:");
        p.FloydsTriangle(n);
        System.out.println("12. BINARY TRIANGLE:");
        p.BinaryTriangle(n);

    }
}

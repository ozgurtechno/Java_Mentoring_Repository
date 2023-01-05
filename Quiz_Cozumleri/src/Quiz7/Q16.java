package Quiz7;

public class Q16 {
    public int getNum() {
        return 45;
    }
    public abstract class Bar {
        public int getNum() {
            return 38;
        }
    }

    public static void main(String[] args) {
        Q16 t = new Q16() {
            public int getNum() {
                return 22;
            }
        };
        Q16.Bar f = t.new Bar() {
            public int getNum() {
                return 57;
            }
        };

        System.out.println(f.getNum() + " " + t.getNum());
    }
}

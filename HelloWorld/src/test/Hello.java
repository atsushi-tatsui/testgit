package test;
/**
 *
 * @author tatsui
 * @version 1.0.0
 */

public class Hello {
private static final class French {
        @Override
        public String toString() {
            String french = "Bonjour le monde!";
            return french;
        }
    }

/**
 *
 * @param args
 */
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//	    System.out.println("Hello");
//	}

    public static void main(String[] args) {
        tranceWord(new French());
    }

    public static void tranceWord(Object obj) {
        System.out.println(obj.toString());
    }
}


/**
 * Created by linhonggu on 1/5/17.
 */
public class TokenizeDemo {
    static String e1 = "2 * 4 + 2";
    static String e2 = "(2 * 44) +      2";
    static String e3 = "   25 + x";

    public static void main(String[] args) {
        Tokenizer t = new MySimpleTokenizer(e3);
        while (t.hasNext()){
            System.out.println("  " + t.current());
            t.next();
        }
    }
}

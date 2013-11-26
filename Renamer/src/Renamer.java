/**
 * Created with IntelliJ IDEA.
 * User: Emanuele
 * Date: 24/11/13
 * Time: 21.07
 * To change this template use File | Settings | File Templates.
 */
public class Renamer {

    public static String remove(String in, String charToRemove) {
        in = in.replace(charToRemove, "");
        return in;
    }

    public static String replace(String name, String oldchar, String newchar) {
        return name.replace(oldchar,newchar);
    }
}

package u3a1;

public class StringObject {

    void addString(String s1, String s2) {
        s1 = s1 + s2;
        // Markierung 3
    }

    public static void main(String[] args) {
        StringObject ref = new StringObject();
        String mystring = "Give ";
        StringBuffer mybuffer = new StringBuffer("Give ");
        // Markierung 1

        mystring = mystring + "me six ";
        mybuffer.append("me six ");
        // Markierung 2

        ref.addString(mystring, "lines");
        mybuffer.append("lines");
        // Markierung 4

        System.out.println(mystring);
        System.out.println(mybuffer);
    }
}

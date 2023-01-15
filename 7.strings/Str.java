public class Str {
    public static void main(String[] args) {
        
        String name = new String("bhavesh");

        //string constant pool

        //immutable string
        System.out.println(name.charAt(0));
        System.out.println(name.length());

        //mutable string using buffer

        StringBuffer sb = new StringBuffer("bhavesh");
        sb.append(" sakpal");
        System.out.println(sb);

        
    }
}

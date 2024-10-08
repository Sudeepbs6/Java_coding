public class Strings {
    public static void main(String[] args) 
    {
        // String name = "sudeep";
        // name = name + " battineni";
        // System.out.println("Hello "+ name);

        StringBuffer sb = new StringBuffer("Sudeep ");
        // System.out.println(sb.capacity());               // For looking the space/capacity.

        // System.out.println(sb.length());                 // For checking the length.
        
        // sb.append(" battineni");                        // To add/append
        

        // String str = sb.toString();                         // To convert into String
        // sb.deleteCharAt(2);                           // To delete a word
        sb.insert(7,  "B");                    // To insert a string
        System.out.println(sb);
    }
}


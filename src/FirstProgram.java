public class FirstProgram {
    public static void main(String[] args){
        //single line comment
        /* multi-line comment */
        System.out.println("Another java program incoming...");

        //looking at the difference between string
        String str1 = new String("jess");
        String str2 = "jess";

        //this is because new String creates a new storage location for that variable
        //if you have another string with the same value String str3="jess", it will be == t str1 because both are pointing to
        //the same memory location unlike new String which is creating a new location afresh.
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}

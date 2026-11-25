public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        String name="RLHarath";
        try{
            System.out.println(name.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("String out of range");
        }
    }
    
}

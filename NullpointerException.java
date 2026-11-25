public class NullpointerException {
    
    public static void main(String[] args) {
        try
        {
            String str=null;
            System.out.println(str.length());

        }
        catch (NullPointerException e)
        {
            System.out.println("null pointer str is null");
        }
    }
    
}

    


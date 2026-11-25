public class WebsiteValidator {
    public static void main(String[] args) {
        String url="https://www.google.com";
        if(url.startsWith("https://"))
        {
            System.out.println("secure webisite url");
        }
        else{
            System.out.println("invalid website protocol");
        }
    }
    
}

public class FileValidator {
    public static void main(String[] args) {
        String fileName="student_report.pdf";
        if(fileName.endsWith(".pdf"))
        {
            System.out.println("PDF file");
        }
        else
        {
            System.out.println("different File Format");
        }
    }
    
}

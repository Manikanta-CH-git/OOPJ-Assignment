import java.io.File;
public class FilePathChecker{
    public static void main(String args[]){
        String filePath="src/images/test@malinator.jpg";
        File file=new File(filePath);
        System.out.println("Absoulte path:"+file.getAbsolutePath());
        if(file.exists()){
            System.out.println("File exisits.");
            
        }else{
            System.out.println("File not found");
        }
    }
}
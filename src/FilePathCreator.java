import java.io.File;
import java.io.IOException;
public class FilePathCreator{
    public static void main(String args[]){
        String filePath="src/images/test@malinator.jpg";
        File file=new File(filePath);
        try{
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
                System.out.println("Directoiees create"+file.getParentFile().getAbsolutePath());
                
            }
            if(!file.exists()){
                if(file.createNewFile()){
                    System.out.println("File created:"+file.getAbsolutePath());
                }else{
                    System.out.println("failed to create");
                }  
                }else{
                        System.out.println("filer alreday ecists");
                        
                        }
            }catch(IOException e){
                e.printStackTrace();
            
        }
    }
    
}
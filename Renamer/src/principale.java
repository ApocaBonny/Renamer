import java.io.File;
import java.lang.annotation.RetentionPolicy;

/**
 * Created with IntelliJ IDEA.
 * User: Emanuele
 * Date: 24/11/13
 * Time: 21.11
 * To change this template use File | Settings | File Templates.
 */
public class principale {

    public static void main(String args[])
            throws java.io.IOException   {

        String directory="D:\\tmp";
        File dirFile = new File(directory);
        if(dirFile.isDirectory()){
            File[] files = dirFile.listFiles();
            for (File file:files){
                if(!file.isDirectory()){
                    System.out.println(file.getName());
                    String newname=reneameFileVideo(file.getName());
                    String estensioneFile = getEstensioneFile(file.getPath());

                    if(!file.renameTo(new File(directory+"\\"+newname+estensioneFile))){
                       System.out.println("errore");
                   }

                }
            }
        }

}

    private static String reneameFileVideo(String name) {
        String oldchar = null;
        String newchar = null;
        name = Renamer.replace(name,oldchar,newchar);
        return name;
    }

    private static String getEstensioneFile(String nomeFile){
        return nomeFile.substring(nomeFile.lastIndexOf("."));
    }
}

package com.example.javafxdemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class FileManaging{
    public static void main(String[] args) throws IOException {
        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);

        String folderPath = currentPath+"\\src\\main\\java\\com\\example\\javafxdemo\\img";
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
        }

        File old = new File("C:\\Users\\PMK\\Desktop\\672190.jpg");
        System.out.println(old.getName());
        File copy = new File(folderPath+"\\"+old.getName());
        if(copy.exists()){
            if(!FileUtils.contentEquals(old,copy)){
                File newCopy = new File(folderPath+"\\"+
                        Calendar.getInstance().getTimeInMillis() +old.getName());
                FileUtils.copyFile(old,newCopy);
            }
        }
        else{
            FileUtils.copyFile(old,copy);
        }

        File del = new File(folderPath+"\\1646490875202672190.jpg");
        boolean isDeleted = FileUtils.deleteQuietly(del);
        if(isDeleted){
            System.out.println("File is deleted");
        }
    }
}

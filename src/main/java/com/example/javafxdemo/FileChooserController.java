package com.example.javafxdemo;

import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class FileChooserController {

    public void onSingleBtnClicked(){
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(
          new FileChooser.ExtensionFilter("Image File","*.png")
        );
        File selectedFile = fc.showOpenDialog(null);

        if(selectedFile == null) return;
        String path = selectedFile.getAbsolutePath();
        File file = selectedFile.getAbsoluteFile();
        System.out.println(file);
        System.out.println(path);
    }

    public void onMultiBtnClicked(){
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image File","*.png")
        );
        List<File> selectedFiles = fc.showOpenMultipleDialog(null);

        if(selectedFiles.size()==0) return;
        for(File out: selectedFiles){
            System.out.println(out.getAbsolutePath());
        }
    }
}

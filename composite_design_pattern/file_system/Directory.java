package composite_design_pattern.file_system;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> files;

    public Directory(String directoryName){

        this.directoryName = directoryName;

        files = new ArrayList<>();


    }

    public void addFile(FileSystem file){

        files.add(file);

    }

    @Override
    public void ls() {
        System.out.println("d-"+directoryName);
        for(FileSystem file : files){

            file.ls();

        }

    }
    
}

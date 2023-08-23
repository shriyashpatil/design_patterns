package composite_design_pattern.file_system;

public class File implements FileSystem{

    String filename;

    public File(String fileName){

        this.filename = fileName;
    }

    @Override
    public void ls() {

        System.out.println("f-"+filename);

    }
    
}

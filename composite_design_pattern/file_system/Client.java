package composite_design_pattern.file_system;

public class Client {
    
    public static void main(String args[]){

        // create Directory Composite Design Pattern
        Directory compositeDesignPatternDirectory = new Directory("composite-design-pattern");

        /// create one directory filesystem in composite design pattern
        Directory fileSystem = new Directory("file-system");

        compositeDesignPatternDirectory.addFile(fileSystem);

        /// create file and add in the file system directory
        FileSystem client = new File("Client.java");
        fileSystem.addFile(client);


        /// create another file and add in composite design pattern file
        FileSystem readMe = new File("README.md");

        compositeDesignPatternDirectory.addFile(readMe);


        /// ls composite design pattern directory
        compositeDesignPatternDirectory.ls();

        /// ls file system directory
        fileSystem.ls();
    }

}

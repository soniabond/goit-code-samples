package module10.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {

    private List<File> files = new ArrayList<>();

    public void findFiles(File directory) {

        for (File file : directory.listFiles()) {
            if(file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                findFiles(file);
            }
        }
    }

    public List<File> getFiles() {
        return files;
    }
}

package module10.company;

import java.io.File;
import java.io.IOException;

public class FileFinderTest {

    public static void main(String[] args) throws IOException {
        File file = new File("payments");
        FileFinder fileFinder = new FileFinder();
        fileFinder.findFiles(file);
        for (File listFile : fileFinder.getFiles()) {
            System.out.println(listFile.getCanonicalPath());
        }
    }
}

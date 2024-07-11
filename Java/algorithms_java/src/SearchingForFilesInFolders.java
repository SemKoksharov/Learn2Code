import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchingForFilesInFolders {


    public static void main(String[] args) {
        List<File> found = new ArrayList<>();

        String typeToSearch = FileType.AUDIO_MP3.getExtension();

        searchFile(new File("/home/semkoksharov66/"), found, typeToSearch);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Search results:");
        if (found.isEmpty()) {
            System.out.println("No files found.");
        } else {
            for (File file : found) {
                if (file != null) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            System.out.println("Total files found: " + found.size());
        }


    }

    private static void searchFile(File root, List<File> fileList, String extension) {
        if (root.isDirectory()) {
            System.out.println("Searching at: " + root.getAbsolutePath());
            File[] directoryFiles = root.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList, extension);
                    } else {
                        if (file.getName().toLowerCase().endsWith(extension)) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }

    public enum FileType {
        JPG_IMAGE(".jpg"), PNG_IMAGE(".png"), AUDIO_MP3(".mp3");
        private String extension;

        FileType(String extension) {
            this.extension = extension;
        }

        public String getExtension() {
            return extension;
        }
    }
}


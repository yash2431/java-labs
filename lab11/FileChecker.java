import java.io.File;

public class FileChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileChecker <file_or_directory_name>");
            return;
        }

        String name = args[0];
        File file = new File(name);

        if (!file.exists()) {
            System.out.println("File or directory does not exist.");
            return;
        }

        if (file.isFile()) {
            System.out.println("File Size: " + file.length() + " bytes");
        } else if (file.isDirectory()) {
            System.out.println("Directory Contents:");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("Not a valid file or directory.");
        }
    }
}

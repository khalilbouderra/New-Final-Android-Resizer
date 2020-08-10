import java.io.File;

public class Utils {
    public static final String[] DRAWABLE_SUPPORTED_IMAGE = {"png", "jpg"};

    public static boolean isDrawableSupportImage(File image) {
        for (String format : DRAWABLE_SUPPORTED_IMAGE) {
            if (getExtension(image.getAbsolutePath()).equalsIgnoreCase(format))
                return true;
        }
        return false;
    }

    public static String getExtension(String f) {
        String extension = "";
        int i = f.lastIndexOf('.');
        if (i > 0) {
            extension = f.substring(i + 1);
        }
        return extension;
    }
}

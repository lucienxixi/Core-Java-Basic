package assignment2.question16;

public class Criteria {
    private String path;
    private boolean includeSubFolder;
    private String extension;

    public Criteria() {
    }

    public Criteria(String path, boolean includeSubFolder, String extension) {
        setPath(path);
        setIncludeSubFolder(includeSubFolder);
        setExtension(extension);
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setIncludeSubFolder(boolean includeSubFolder) {
        this.includeSubFolder = includeSubFolder;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public boolean isIncludeSubFolder() {
        return includeSubFolder;
    }

    public String getExtension() {
        return extension;
    }
}

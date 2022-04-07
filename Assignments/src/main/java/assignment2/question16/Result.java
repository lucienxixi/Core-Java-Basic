package assignment2.question16;

public class Result {
    int filesCount;
    int folderCount;
    String folderName;
    String extension;

    public Result() {
    }

    public Result(int filesCount, int folderCount, String folderName, String extension) {
        this.filesCount = filesCount;
        this.folderCount = folderCount;
        this.folderName = folderName;
        this.extension = extension;
    }
}

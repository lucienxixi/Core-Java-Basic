package assignment2.question16;

import java.io.File;

public class FileCounter {

    public void count(Criteria criteria) {
        Result result = new Result(0, 0, criteria.getPath(), criteria.getExtension());
        dfs(criteria.getPath(), criteria.getExtension(), result);

        System.out.println(String.format("There are %d file(s) and %d folder(s) inside folder %s with extension %s.",
                result.filesCount,
                result.folderCount,
                criteria.getPath(),
                criteria.getExtension()));
    }

    public void dfs(String path, String extension, Result result) {
        File dir = new File(path);
        File[] fileArr = dir.listFiles();

        if (fileArr.length == 0) {
            return;
        }

        for (int i = 0; i < fileArr.length; i++) {
            File dir1 = fileArr[i];
            if (dir1.isDirectory()) {
                result.folderCount++;
                dfs(dir1.getPath(), extension, result);
            }
            if (dir1.isFile() && dir1.getName().endsWith(extension)) {
                result.filesCount++;
            }
        }
    }
}

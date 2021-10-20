import java.io.File;

/**
 * FileContentFather 类
 * 操作人：小白
 * 日期：2021/10/19
 * 时间：14:36
 * 自定义的文件内容父类
 * file 文件地址
 * name 文件名字
 */
public class FileContentFather {
    File file;
    String name;
    public FileContentFather(File file, String name){
        this.file = file;
        this.name = name;
    }
}

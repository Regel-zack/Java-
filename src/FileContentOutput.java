import java.io.*;

/**
 * FileContentOutput 类
 * 操作人：小白
 * 日期：2021/10/20
 * 时间：7:22
 * 文件内容输出内容子类
 * 继承自文件内容父类
 *
 */
public class FileContentOutput extends  FileContentFather{
    private String content;
    private String[] contentLists = new String[5];

    // 向控制台输出文件内容，做测试用
    public void put(){
        for (String n :
                contentLists) {
            System.out.println(n);
        }
    }

    // 获取具体某一行内容
    public String getOutputContent(int n){
        return contentLists[n];
    }

    public int getListsLength(){
        return contentLists.length;
    }

    public FileContentOutput(File file, String name) throws IOException {
        super(file, name);

        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((content = br.readLine()) != null){
            contentLists[i] = content;
            i++;
        }
    }
}

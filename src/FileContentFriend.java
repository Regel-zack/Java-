import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileContentFriend 类
 * 操作人：小白
 * 日期：2021/10/19
 * 时间：15:03
 * 文件内容好友子类
 * 继承自文件内容父类
 * put() 用于测试，向控制台输出其中存储到的好友名字
 * content 字符串，主要用于承接字符串内容
 * contentLists 字符串数组，用于存储好友名字
 */
public class FileContentFriend extends FileContentFather{
    private String content = null;
    private String[] contentLists = new String[3];

    public void put(){
        for (String n : contentLists
                ) {
            System.out.println(n);
        }
    }

    public String getFriendContent(int n){
        return contentLists[n];
    }

    public int getListsLength(){
        return contentLists.length;
    }


    public FileContentFriend(File file, String name) throws IOException {
        super(file, name);

        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((content = br.readLine()) != null){
            contentLists[i] = content;
            i++;
        }
    }
}

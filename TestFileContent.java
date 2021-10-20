import java.io.File;
import java.io.IOException;

/**
 * TestFileContent 类
 * 操作人：小白
 * 日期：2021/10/19
 * 时间：14:52
 */
public class TestFileContent {
    public static void main(String[] args) throws IOException {
        FileContentFriend fileContent = new FileContentFriend(new File("D:\\readFile\\find.txt"),"friend");

        fileContent.put();
        System.out.println(fileContent.getFriendContent(1));
    }
}

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * test 类
 * 操作人：小白
 * 日期：2021/10/19
 * 时间：7:56
 */
public class test {
    public static void main(String[] args) throws AWTException, IOException {
        // 创建实例化模拟键盘操作对象
        Robot robot = new Robot();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = null;
        // 定义开始时间
        long startTime = System.currentTimeMillis();

        int i = 0;
        int n = 0;

        // 读取要发送的内容的文件
        FileContentOutput read_input_file = new FileContentOutput(new File("D:\\readFile\\output.txt"),"ContentOutput");
        // 读取要寻找的好友的名字的文件 这里需要去到这个文件夹下输入要发送的好友名字
        FileContentFriend read_find_file = new FileContentFriend(new File("D:\\readFile\\find.txt"),"ContentFriend");

        // 进入微信
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_W);

        while (i < read_find_file.getListsLength()) {
            // 移动鼠标到搜索框 具体需要看你的主机的位置，x是到屏幕左边的距离，y是到屏幕顶部的距离
            robot.mouseMove(100, 30);
            robot.delay(50);
            // 搜索好友
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            tText = new StringSelection(read_find_file.getFriendContent(i));
            clip.setContents(tText, null);
            System.out.println("要发送给好友 --> " + read_find_file.getFriendContent(i));
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // 按回车进入聊天框
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(500);

            System.out.println("将会发送以下内容：");

            // 下面这个循环开始发送内容
            while (n < read_input_file.getListsLength()) {
                tText = new StringSelection(read_input_file.getOutputContent(n));
                System.out.println(read_input_file.getOutputContent(n));
                clip.setContents(tText, null);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(800); // 如果有漏消息的情况，请将这个延时设置的大一点，单位为毫秒，每一千毫秒等于一秒
                n++;
            }
            n = 0;
            i++;
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime=" + elapsedTime);
    }
}

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;

/**
 * test 类
 * 操作人：小白
 * 日期：2021/10/18
 * 时间：12:26
 */

public class test {
    public static void main(String[] args) throws AWTException, IOException {
        // 创建实例化模拟键盘操作对象
        Robot robot = new Robot();
        //test t = new test();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = null;
        Toolkit tolkit = Toolkit.getDefaultToolkit();

        // 读取要发送的内容的文件
        File read_input_file = new File("D:\\readFile\\output.txt");
        // 读取要寻找的好友的名字的文件 这里需要去到这个文件夹下输入要发送的好友名字
        File read_find_file = new File("D:\\readFile\\find.txt");

        BufferedReader br = new BufferedReader(new FileReader(read_input_file));
        BufferedReader br1 = new BufferedReader(new FileReader(read_find_file));
        // 承接字符串文本
        String lists;

        // 移动鼠标到搜索框 具体需要看你的主机的位置，x是到屏幕左边的距离，y是到屏幕顶部的距离
        robot.mouseMove(100,30);
        robot.delay(50);
        // 搜索好友
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        lists = br1.readLine();
        tText = new StringSelection(lists);
        clip.setContents(tText,null);
        System.out.println("要发送给好友 --> " + lists);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        //t.find();
        // 按回车进入聊天框
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);

//        做测试发送信息
//        robot.keyPress(KeyEvent.VK_1);
//        robot.keyRelease(KeyEvent.VK_1);


        System.out.println("将会发送以下内容：");
        // 下面这个循环将会发送内容，直到output.txt文件里的内容每一行都发送完毕，一次性一个聊天窗口发送
//        while ((lists = br.readLine()) != null){
//            tText = new StringSelection(lists);
//            System.out.println(lists);
//            clip.setContents(tText,null);
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SHIFT);
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_SHIFT);
//
//            robot.delay(500);
//        }

        // 下面这个循环也会发送内容，但是是读取到一行内容就发送一行内容
        while ((lists = br.readLine()) != null){
            tText = new StringSelection(lists);
            System.out.println(lists);
            clip.setContents(tText,null);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            robot.delay(500);
        }

        // 回车发送 如果选用读取一行就发送一行可以将下面这三行注释掉，不注释掉也不影响运行
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void find() throws AWTException{
        // 查找好友，这里具体是”文件传输助手“ 如果需要查找其他好友可以去 find.txt 文件里修改对应的好友名字

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_Z);
        robot.keyRelease(KeyEvent.VK_Z);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        robot.delay(50);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
    }
}

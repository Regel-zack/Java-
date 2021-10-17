import jdk.nashorn.internal.ir.CallNode;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;

/**
 * Test 类
 * 操作人：小白
 * 日期：2021/10/15
 * 时间：15:12
 *
 * 实现了给好友自动发信息或者是做一个备忘录的功能
 *
 * 1.创建实例化对象
 * 2.移动鼠标到搜索框
 * 3.搜索好友
 * 4.按回车进入聊天框
 * 5.输入要发送的内容
 * 6.回车发送
 * 7.结束
 */
public class Test {


    public static void main(String[] args) throws AWTException, IOException {
        // 创建实例化对象
        Robot robot = new Robot();
        Test t = new Test();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = null;
        Toolkit tolkit = Toolkit.getDefaultToolkit();
        File file = new File("D:\\readFile\\output.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String lists;

        // 移动鼠标到搜索框
        robot.mouseMove(100,30);
        robot.delay(50);
        // 搜索好友
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        t.find();
        // 按回车进入聊天框
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);

//        robot.keyPress(KeyEvent.VK_1);
//        robot.keyRelease(KeyEvent.VK_1);

        while ((lists = br.readLine()) != null){
            tText = new StringSelection(lists);
            System.out.println(lists);
            clip.setContents(tText,null);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_SHIFT);

            robot.delay(500);
        }




        // 回车发送
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void find()throws AWTException{
        // 查找好友，这里具体是”文件传输助手“

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

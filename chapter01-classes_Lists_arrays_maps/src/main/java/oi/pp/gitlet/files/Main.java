package oi.pp.gitlet.files;
import oi.pp.gitlet.Utils;
import java.io.File;
import java.io.IOException;

import static oi.pp.gitlet.Utils.writeObject;

/**
 * @author supanpan
 * @date 2024/02/08
 */
public class Main {
    public static final File CWD = new File(System.getProperty("user.dir"));

    public static void main(String[] args) {
        System.out.println(CWD.getPath());


        try {
            File f = new File(CWD, "dummy.txt");// 这个时候dummy.txt文件并不存在
            // 创建一个文件
            f.createNewFile();
            System.out.println("文件存在吗？"+f.exists());
            Utils.writeContents(f, "Hello, world!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File d = new File(CWD, "dummy");
        d.mkdir();// 创建目录

        Utils.writeObject(new File(d, "model.ser"), new Model("supanpan"));

        Model m = Utils.readObject(new File(d, "model.ser"), Model.class);
        System.out.println(m.getName());
    }
}

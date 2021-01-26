package src.com.IOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/3 - 下午3:49
 * @Description: src.com.IOFile
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File f = new File("/Users/chenzhi/Desktop/马士兵课件/text.txt");
//        System.out.println(f.canRead());
//        System.out.println("文件是否可写："+f.canWrite());
//        System.out.println("文件的名字："+f.getName());
//        System.out.println("上级目录："+f.getParent());
//        System.out.println("是否是一个目录："+f.isDirectory());
//        System.out.println("文件的大小："+f.length());
//        System.out.println("是否存在："+f.exists());
//
//        System.out.println("绝对路径："+f.getAbsolutePath());
//        System.out.println("相对路径："+f.getPath());
        //字符流读写操作
//        File f = new File("/Users/chenzhi/Desktop/马士兵课件/text.txt");
//        FileReader fr = new FileReader(f);
//        File f2 = new File("/Users/chenzhi/Desktop/马士兵课件/demo.txt");
//        FileWriter fw = new FileWriter(f2);
//
//        char[] ch = new char[5];
//        int n = fr.read(ch);
//        while (n!=-1) {
//            System.out.println(n);
//            String s = new String(ch, 0, n);
//            fw.write(s);
//            n = fr.read(ch);
//        }
//
//        fw.close();
//        fr.close();
        //字节流读取图片的操作
//        File f = new File("/Users/chenzhi/Desktop/马士兵课件/25X35.jpg");
//        FileInputStream fi = new FileInputStream(f);
//
////        int count = 0;//定义一个计数器，用来计读入的字节的个数
//        byte[] bytes = new byte[1024*6];
//
//        int len = fi.read(bytes);
//        while (len != -1) {
////            count++;
//            System.out.println(len);
//            len = fi.read(bytes);
//        }
////        System.out.println(count);
//
//        fi.close();
//        //字节流读写图片的操作
//        File f1 = new File("/Users/chenzhi/Desktop/马士兵课件/25X35.jpg");
//        FileInputStream fi = new FileInputStream(f1);
//        File f2 = new File("/Users/chenzhi/Desktop/马士兵课件/25X25 2.jpg");
//        FileOutputStream fo = new FileOutputStream(f2);
//
//        BufferedInputStream bi = new BufferedInputStream(fi);
//        BufferedOutputStream bo = new BufferedOutputStream(fo);
//
//        byte[] b = new byte[1024*6];
//        int len = bi.read(b);
//        while (len != -1) {
//            bo.write(b, 0, len);
//            len = bi.read(b);
//        }
//
//        bo.close();
//        bi.close();
        //字符处理流操作字符
//        File f1 = new File("/Users/chenzhi/Desktop/马士兵课件/text.txt");
//        FileReader fr = new FileReader(f1);
//        BufferedReader br = new BufferedReader(fr);
//        File f2 = new File("/Users/chenzhi/Desktop/马士兵课件/demo.txt");
//        FileWriter fw = new FileWriter(f2);
//        BufferedWriter bw = new BufferedWriter(fw);
////        //方式1：利用缓冲字符数组
////        char[] ch = new char[5];
////        int len = br.read(ch);
////        while (len != -1) {
////            bw.write(ch, 0, len);
////            len = br.read(ch);
////        }
//        //方式2：读取string
//        String str = br.readLine();
//        while (str != null) {
//            bw.write(str);
//            bw.newLine();
//            str = br.readLine();
//        }
//
//        br.close();
//        bw.close();
//        //字节流字符流转换
//        File f1 = new File("/Users/chenzhi/Desktop/马士兵课件/text.txt");
//        FileInputStream fi = new FileInputStream(f1);
//        InputStreamReader is = new InputStreamReader(fi);
//        File f2 = new File("/Users/chenzhi/Desktop/马士兵课件/demo.txt");
//        FileOutputStream fo = new FileOutputStream(f2);
//        OutputStreamWriter os = new OutputStreamWriter(fo);
//
//        char[] ch = new char[10];
//        int len = is.read(ch);
//        while (len != -1) {
//            os.write(ch, 0, len);
//            len = is.read(ch);
//        }
//
//        os.close();
//        is.close();
        //数据流的使用
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("/Users/chenzhi/Desktop/马士兵课件/demo.txt")));
//        dos.writeUTF("你好");
//        dos.writeBoolean(false);
//        dos.writeDouble(7.9);
//        dos.writeInt(82);
//        DataInputStream dis = new DataInputStream(new FileInputStream(new File("/Users/chenzhi/Desktop/马士兵课件/demo.txt")));
//        System.out.println(dis.readUTF());
//        System.out.println(dis.readBoolean());
//        System.out.println(dis.readDouble());
//        System.out.println(dis.readInt());
        //序列化反序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/chenzhi/Desktop/马士兵课件/demo01.txt")));
//        oos.writeObject("你好");
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/chenzhi/Desktop/马士兵课件/demo01.txt")));
//        String str = (String)(ois.readObject());
//        System.out.println(str);
//        ois.close();
        Person p = new Person("lili", 19);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/chenzhi/Desktop/马士兵课件/demo02.txt")));
        oos.writeObject(p);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/chenzhi/Desktop/马士兵课件/demo02.txt")));
        //读入内存：
        Person p2 = (Person)(ois.readObject());
        System.out.println(p2/*.toString()*/);
        //关闭流：
        ois.close();
    }
}

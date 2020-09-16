package day03;
//使用文件流复制myfile.txt文件为myfile_cp.txt
import java.io.IOException;
import java.io.*;
public class File_copyByfile {
	public static void main(String[] args) throws IOException {
		String fileSrc = "E:/JMPX/myfile.txt";
		String fileDes = "E:/JMPX/Copy/myfile_cp.txt";
		InputStream fis = null; // 声明输入流对象
		OutputStream fos = null; // 声明输出流对象
		try {
		fis = new FileInputStream(fileSrc);
		fos = new FileOutputStream(fileDes);
		long num = 0; // 读取字节计数
		int bt = 0; // 每次读入字节内容
		// 当读入文件末尾时，读入数据的值为-1，每次读入一个字节，存放变量bt中，直到读完整个文件
		while ((bt = fis.read()) != -1) {
			// 以字母的形式逐个输出文件的每个字节
			fos.write(bt); // 将字节写入输出流中，实现copy功能
			}
			System.out.println(" 文件复制成功");
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			} finally {//确保流能正常关闭
			try {
			fis.close();
			fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
			}
		}
}

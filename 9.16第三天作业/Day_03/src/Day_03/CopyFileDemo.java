package Day_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		String fileSrc = "C:/Users/Administrator/Desktop/java/9.16/Day_03/myfile.txt";
		String fileDes = "C:/Users/Administrator/Desktop/java/9.16/Day_03/myfile_cp.txt";
		InputStream fis = null; 
		OutputStream fos = null; 
		try {
		fis = new FileInputStream(fileSrc);
		fos = new FileOutputStream(fileDes);
		long num = 0;
		int bt = 0; 
		while ((bt = fis.read()) != -1) {
			fos.write(bt); 
			num++;
			}
			System.out.println("读取的字节数为" + num + "\n 文件复制成功");
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			} finally {
			try {
			fis.close();
			fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
			}
			}
			
	
 
}

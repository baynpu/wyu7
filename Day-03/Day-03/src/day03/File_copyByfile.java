package day03;
//ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt
import java.io.IOException;
import java.io.*;
public class File_copyByfile {
	public static void main(String[] args) throws IOException {
		String fileSrc = "E:/JMPX/myfile.txt";
		String fileDes = "E:/JMPX/Copy/myfile_cp.txt";
		InputStream fis = null; // ��������������
		OutputStream fos = null; // �������������
		try {
		fis = new FileInputStream(fileSrc);
		fos = new FileOutputStream(fileDes);
		long num = 0; // ��ȡ�ֽڼ���
		int bt = 0; // ÿ�ζ����ֽ�����
		// �������ļ�ĩβʱ���������ݵ�ֵΪ-1��ÿ�ζ���һ���ֽڣ���ű���bt�У�ֱ�����������ļ�
		while ((bt = fis.read()) != -1) {
			// ����ĸ����ʽ�������ļ���ÿ���ֽ�
			fos.write(bt); // ���ֽ�д��������У�ʵ��copy����
			}
			System.out.println(" �ļ����Ƴɹ�");
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			} finally {//ȷ�����������ر�
			try {
			fis.close();
			fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
			}
		}
}

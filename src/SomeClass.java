import java.io.*;

public class SomeClass {
	public static void main(String[] args) throws IOException {
		System.out.print("Hello, World!");

		String str = "Hello";
		FileOutputStream outputStream = new FileOutputStream("1.txt");
		byte[] strToBytes = str.getBytes();
		outputStream.write(strToBytes);

		outputStream.close();
	}
}

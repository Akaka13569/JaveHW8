package CH08;

import java.io.*;
import java.net.*;

public class Q08_02 {

	public static void main(String[] args) {
		try{
			methodA() ;
		} catch (IOException I) {
			
		} catch (ArithmeticException e) {
			
		}
		System.out.println("program ends");
	}
	static void methodA() throws IOException {
		int i = 3/0;
		URL urlA = new URL("http://www.seed.net.tw");
		FileInputStream fis = new FileInputStream("D:\\Test.txt");
	}
}

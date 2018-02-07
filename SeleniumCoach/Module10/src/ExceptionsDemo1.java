import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo1 {

	public static void main(String[] args) throws Exception {
		sample1();//method with checked exception
		sample2();
	}
	
	public static void sample1() throws InterruptedException {
		System.out.println("A");
		Thread.sleep(2000);
		System.out.println("B");
	}
	
	public static void sample2() throws IOException {
		FileInputStream is = new FileInputStream(new File("D:\\testdata.txt"));
	}

}

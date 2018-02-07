public class Operations {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a>b);//false
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		System.out.println(a=b);//10
		System.out.println(a==b);//false
		System.out.println((a==b)&&(a!=b));//True && False = False
		System.out.println((a==b)||(a!=b));//True || False = True
		System.out.println(!(a==b));//false
		System.out.println(!(a!=b));//true
	}

}

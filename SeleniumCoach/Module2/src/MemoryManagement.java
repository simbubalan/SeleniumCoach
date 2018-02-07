
public class MemoryManagement {
	
	public String sName;
	public int rolNo;
	public static String colName;
	
	public static void main(String[] args) {
		MemoryManagement s1 = new MemoryManagement();
		s1.display();
		s1.sName="Venkat";
		s1.rolNo=100;
		colName="MindQ";
		s1.display();
		
		System.out.println("--------------------------");
		MemoryManagement s2 = new MemoryManagement();
		s2.display();//Venkat-100-MindQ
		s2.sName="ABCD";
		s2.rolNo=101;
		s2.display();
		System.out.println("--------------------------");
		MemoryManagement s3 = new MemoryManagement();
		s3.display();//null-0-MindQ
		colName="ACE";
		s2.display();//ABCD-101-ACE
		s1.display();//Venkat-100-ACE
		
	}
	
	public void display(){
		System.out.println(sName+"-"+rolNo+"-"+colName);
	}

	
	
}












import java.util.*;



public class DataMember_Initialization{
	public static void main(String[] args){

		// Add a = new Add();
		
		// System.out.println(a.sum(10,20,30));
		// System.out.println(a.sum(12,12));
		// System.out.println(a.sum(33));
		// System.out.println(a.sum());

		// System.out.println(a instanceof Add);
		

		byte arr[] = {66,65,67,68,69};
		char carr[]={65,66,67,68,69,70};

		StringBuffer sb = new StringBuffer("StringBuffer Object!");

		String s = new String(arr);
		String s1 = new String(carr);
		System.out.println(s1);

		String s2 = new String(sb);
		System.out.println(s2);

		String s3 = s2.concat("AADITYA!");
		System.out.println(s3);

	}
}



class Add{

	private int a;
	private int b;
	private int c;

	public int sum(int n1, int n2, int n3){
		return n1+n2+n3;
	}
	
	public int sum(int n1, int n2){
		return n1+n2;
	}
	
	public int sum(int n1){
		return n1;
	}
	
	public String sum(){
		return "Nothing is Provided!";
	}

}

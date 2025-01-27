package tryprograms;

public class reverstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reword="delicious";
		int l=reword.length();
		String newword="";
		char a;
		System.out.println("String Length is "+l);
		for(int i =0;i<l;i++)
		{
			a=reword.charAt(i);
			//System.out.println(a);
			newword=a+newword;
			System.out.println(newword);
		}
		System.out.println("String is : "+reword);
		System.out.println("Reverse word id " +newword);


}
}

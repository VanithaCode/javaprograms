package tryprograms;

public class reverstring {
	
	
	void normalidea()
	{
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
	void stringbufferidea()
	{
		String reword = "important";
		StringBuffer buffer = new StringBuffer();
		buffer.append(reword);
		System.out.println("ReverString  using StringBuffer is :"+buffer.reverse());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
reverstring r1 = new reverstring();
r1.normalidea();
r1.stringbufferidea();
		
}
}


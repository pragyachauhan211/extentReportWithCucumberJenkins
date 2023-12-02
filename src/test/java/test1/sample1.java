package test1;

public class sample1 {
	public static int day=0;
	
	public static int switchMethod1()
	{
		day++;
		
		System.out.println(day);
		return day;
		
	}

	public static void main(String[] args) {
		sample2 s = new sample2();
		s.switchMethod();

	}

}

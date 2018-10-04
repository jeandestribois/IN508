public class Fraction
{
	private int num, den;
	Fraction()
	{
		this.num=1;
		this.den=1;
	}
	Fraction(int num, int den)
	{
		this.num=num;
		this.den=den;
	}
	String toString()
	{
		String s="this.num"+"\n_\n"+"this.den";
		return s;
	}
}
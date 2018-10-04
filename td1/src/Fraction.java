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
	public String toString()
	{
		return this.num+"/"+this.den;
	}
}
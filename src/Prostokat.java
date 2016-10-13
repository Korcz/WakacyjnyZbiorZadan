
public class Prostokat extends Figura
{
	private double bokA;
	private double bokB;
	
	

	public Prostokat(double bokA, double bokB)
	{
		this.bokA = bokA;
		this.bokB = bokB;
	}

	@Override
	public double pole()
	{
		return bokA * bokB;
	}

	@Override
	public String toString()
	{
		return "Pole prostokata wynosi " + pole();
	}

}

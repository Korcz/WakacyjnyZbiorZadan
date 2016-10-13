
public class Kolo extends Figura
{
	
	private double promien;
	
	

	public Kolo(double promien)
	{
		this.promien = promien;
	}



	@Override
	public double pole()
	{
		return Math.PI * (promien * promien); 
	}



	@Override
	public String toString()
	{
		return "Pole kola wynosi " + pole();
	}
	
	

}

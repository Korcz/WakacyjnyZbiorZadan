
public class Urzadzenie
{
	private String nazwaProducenta;
	private double cena;
	
	
	
	public Urzadzenie(String nazwaProducenta, double cena)
	{
		this.nazwaProducenta = nazwaProducenta;
		this.cena = cena;
	}
	public String getNazwaProducenta()
	{
		return nazwaProducenta;
	}
	public void setNazwaProducenta(String nazwaProducenta)
	{
		this.nazwaProducenta = nazwaProducenta;
	}
	public double getCena()
	{
		return cena;
	}
	public void setCena(double cena)
	{
		this.cena = cena;
	}
	
	
	public double obliczCene()
	{
		return this.cena;
	}
	
	@Override
	public String toString()
	{
		return "Urzadzenie [nazwaProducenta=" + nazwaProducenta + ", cena=" + cena + "]";
	}
	
	
}

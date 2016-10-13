
public class Pralka extends Urzadzenie
{
	private int liczbaProgramow;
	private double pojemnosc;

	public Pralka(String nazwaProducenta, double cena,
			int liczbaProgramow, double pojemnosc)
	{
		super(nazwaProducenta, cena);
		this.liczbaProgramow = liczbaProgramow;
		this.pojemnosc = pojemnosc;
	}

	public int getLiczbaProgramow()
	{
		return liczbaProgramow;
	}

	public void setLiczbaProgramow(int liczbaProgramow)
	{
		this.liczbaProgramow = liczbaProgramow;
	}

	public double getPojemnosc()
	{
		return pojemnosc;
	}

	public void setPojemnosc(double pojemnosc)
	{
		this.pojemnosc = pojemnosc;
	}
	
	@Override
	public double obliczCene()
	{
		double cena = getCena();
		
		if (liczbaProgramow > 10 && pojemnosc > 50)
		{
			cena = getCena() + 300;
		}
		else if (liczbaProgramow > 10)
		{
			cena = getCena() + 100;
		}
		else if (pojemnosc > 50) {
			cena = getCena() + 200;
		}
		
		
		return cena;
	}

	@Override
	public String toString()
	{
		return super.getNazwaProducenta() + " Pralka [liczbaProgramow=" + liczbaProgramow + ", pojemnosc=" + pojemnosc + "]" + "Cena " + obliczCene();
	}
	
	

}

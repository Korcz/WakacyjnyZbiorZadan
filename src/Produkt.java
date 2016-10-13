import java.util.Arrays;

public class Produkt
{
	private Skladnik[] tab;
	
	

	public Produkt()
	{
		System.out.println("Podaj ");
		this.tab = tab;
	}



	public void obliczCene(Skladnik[] tab)
	{
		double sum = 0;
		for (int i = 0; i < tab.length; i++)
		{
			sum = tab[i].getCena();
		}
		
		System.out.println("Cena produktu wynosi: " + sum * 1.15);
	}
	
}

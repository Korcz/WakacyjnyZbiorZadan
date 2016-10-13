import java.util.Scanner;

public class Skladnik
{
	private String nazwa;
	private double waga;
	private double cena;
	
	
	
	
	public Skladnik(String nazwa, double waga, double cena)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nazwa.length(); i++)
		{
			char z = Character.toLowerCase(nazwa.charAt(i));
			sb.append(z);
		}
		this.nazwa = sb.toString();
		
		if (waga > 0)
		{
			this.waga = waga;
		}
		else {
			waga = 0;
			System.out.println("Blad wagi");
		}
		
		if (cena > 0)
		{
			this.cena = cena;
		}
		else {
			this.cena = 0;
			System.out.println("Blad ceny");
		}
	}
	
	public Skladnik()
	{
		String nap = "";
		Scanner sc = new Scanner(System.in); 
		do
		{
			System.out.println("Podaj nazwe");
			
			this.nazwa = nap = sc.nextLine();
		} while (!nap.matches("[A-Z]+"));
		
		/*StringBuilder sb = new StringBuilder(nap);
		for (int i = 0; i < sb.length(); i++)
		{
			char z = Character.toLowerCase(sb.charAt(i));
			sb.append(z);
		}
		this.nazwa = sb.toString();*/
		
		do
		{
			System.out.println("Podaj wage > 0");
			double waga = Double.parseDouble(sc.nextLine());
			this.waga = waga;
		} while (waga <= 0);
		
		do
		{
			System.out.println("Podaj cene > 0");
			double cena = Double.parseDouble(sc.nextLine());
			this.cena = cena;
		} while (cena <= 0);
		
	}

	public String getNazwa()
	{
		return nazwa;
	}
	
	public void setNazwa(String nazwa)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nazwa.length(); i++)
		{
			char z = Character.toLowerCase(nazwa.charAt(i));
			sb.append(z);
		}
		this.nazwa = sb.toString();
	}
	public double getWaga()
	{
		return waga;
	}
	public void setWaga(double waga)
	{
		if (waga > 0)
		{
			this.waga = waga;
		}
		else {
			waga = 0;
			System.out.println("Blad wagi");
		}
	}
	public double getCena()
	{
		return cena;
	}
	public void setCena(double cena)
	{
		if (cena > 0)
		{
			this.cena = cena;
		}
		else {
			this.cena = 0;
			System.out.println("Blad ceny");
		}
	}

	@Override
	public String toString()
	{
		return "Skladnik [nazwa=" + nazwa + ", waga=" + waga + ", cena=" + cena + "]";
	}
	
	
}

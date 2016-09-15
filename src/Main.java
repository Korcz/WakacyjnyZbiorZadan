import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main

{
	// public Scanner sc = new Scanner(System.in);

	public static void pp1(double x)
	{
		System.out.println("Zadnie 1 \n");
		System.out.println("Podaj liczbe rzeczywist¹:");
		Scanner sc = new Scanner(System.in);
		double x1 = Double.parseDouble(sc.nextLine());

		double wynik = (2 * (Math.pow(x1, 12))) + (3 * (Math.pow(x1, 5)) - (4 * (Math.pow(x1, 2))));

		System.out.println("Wynik wielomianu: 2x^12+3x^5-4x^2 dla x = " + x1 + " wynosi: " + wynik);
		System.out.println("--------------------------------------------------");

	}

	public static void pp2()
	{
		System.out.println("Zadanie 2 \n");
		Random rnd = new Random();
		int x = rnd.nextInt(51) - 50;

		if (/* x > Double.NEGATIVE_INFINITY && */x < -40)
		{
			System.out.println("Liczba " + x + " jest w przedziale <-~, -40)");
		} else if (x >= -40 && x < -20)
		{
			System.out.println("Liczba " + x + " jest w przedziale <-40, -20)");
		} else if (x >= -20 && x <= 20)
		{
			System.out.println("Liczba " + x + " jest w przedziale <-20, 20>");
		} else if (x > 20 /* && x < Double.POSITIVE_INFINITY */)
		{
			System.out.println("Liczba " + x + " jest w przedziale <20, +~>");
		}

		System.out.println("--------------------------------------------------");

	}

	public static void pp3()
	{

		System.out.println("Zadanie 3 \n");
		System.out.println("Podaj trzy liczby ca³kwite \nPodaj pierwsz¹ liczbê:");
		Scanner sc = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		double liczba1 = Double.parseDouble(sc.nextLine());
		lista.add(liczba1);
		System.out.println("Podaj drug¹ liczbê:");
		double liczba2 = Double.parseDouble(sc.nextLine());
		lista.add(liczba2);
		System.out.println("Podaj trzeci¹ liczbê:");
		double liczba3 = Double.parseDouble(sc.nextLine());
		lista.add(liczba3);

		double srednia = ((Collections.max(lista) + Collections.min(lista)) / 2);

		// System.out.println("Srednia wynosi " + srednia);

		Collections.sort(lista);

		double mid = lista.get(1);

		if (srednia > mid)
		{
			System.out.println("Srednia wieksza od " + mid);
		} else if (srednia < mid)
		{
			System.out.println("Srednia mniejsza od " + mid);
		} else
		{
			System.out.println("Sredna rowna " + mid);
		}

		System.out.println("--------------------------------------------------");

		/*
		 * System.out.println("Zadanie 3 \n"); System.out.println(
		 * "Podaj trzy liczby ca³kwite \nPodaj pierwsz¹ liczbê:"); Scanner sc =
		 * new Scanner(System.in); double liczba1 =
		 * Double.parseDouble(sc.nextLine()); System.out.println(
		 * "Podaj drug¹ liczbê:"); double liczba2 =
		 * Double.parseDouble(sc.nextLine()); System.out.println(
		 * "Podaj trzeci¹ liczbê:"); double liczba3 =
		 * Double.parseDouble(sc.nextLine()); double minVal = Math.min(liczba1,
		 * Math.min(liczba2, liczba3)); double maxVal = Math.max(liczba1,
		 * Math.min(liczba2, liczba3)); double mid = 0; if(liczba1 != minVal &&
		 * liczba1 != maxVal) { mid = liczba1; } if(liczba2 != minVal && liczba2
		 * != maxVal) { mid = liczba2; } if(liczba3 != minVal && liczba3 !=
		 * maxVal) { mid = liczba3; }
		 */
	}

	public static void pp4()
	{
		System.out.println("Zadanie 4\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj dwa boki trojkatow rownobocznych\nPodaj bok pierwszego trojkata:");
		double bok1 = Double.parseDouble(sc.nextLine());
		System.out.println("Podaj bok drugiego trojkata");
		double bok2 = Double.parseDouble(sc.nextLine());

		double pole1 = (Math.pow(bok1, 2) * Math.sqrt(3)) / 4;
		double pole2 = (Math.pow(bok2, 2) * Math.sqrt(3)) / 4;

		double procent = (pole2 / pole1) * 100;

		System.out.println("Pole drugiego trojkata stanowi " + procent + "% pola pierwszego trojkata.");
		System.out.println("--------------------------------------------------");
	}

	public static void pp5()
	{
		System.out.println("Zadanie 5\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe calkowita");
		int x = Integer.parseInt(sc.nextLine());
		int pow = 2;

		while (pow + 5 < x)
		{
			System.out.print(pow + ", ");
			pow *= 2;
		}
		System.out.println("--------------------------------------------------");

	}

	public static void pp6()
	{
		System.out.println("Zadanie 6\n");
		int a = 0;
		int b = 0;
		int c = 0;

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj trzy liczby\nPodaj pierwsz¹ liczbê:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj drug¹ liczbê:");
			b = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj trzeci¹ liczbê:");
			c = Integer.parseInt(sc.nextLine());
		} while ((a * b * c) < 10 || ((a < b) && (b < c)));

		int suma1 = 0;
		for (int i = a; i <= b; i++)
		{
			suma1 += i;
		}
		int suma2 = 0;
		for (int i = b; i <= c; i++)
		{
			suma2 += i;
		}

		System.out.println("Wieksza suma wynosi:");
		if (suma1 > suma2)
		{
			System.out.println(suma1);
		} else
		{
			System.out.println(suma2);
		}
		System.out.println("--------------------------------------------------");
	}

	public static void pp7()
	{
		int a = 0;
		List<Integer> lista = new ArrayList<>();

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj liczbê:");
			a = Integer.parseInt(sc.nextLine());
			lista.add(a);
		} while (a < 100);

		List<Integer> sumy = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++)
		{
			int num = lista.get(i);
			int sum = 0;
			while (num > 0)
			{
				sum = sum + num % 10;
				num = num / 10;
			}
			sumy.add(sum);
		}
		System.out.println("Najwiêksza suma cyfr wynosi: " + Collections.max(sumy));
		System.out.println("--------------------------------------------------");
	}

	public static void pp8()
	{
		int a = 0;
		int b = 0;

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj dwie liczby:\nPodaj pierwsz¹:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj drug¹:");
			b = Integer.parseInt(sc.nextLine());
		} while (a > b);

	}

	public static void pp10()
	{
		Random rnd = new Random();
		int a = rnd.nextInt(21);

		boolean czyPrawda = false;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Podaj pewsza liczbe");
			int x1 = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj druga");
			int x2 = Integer.parseInt(sc.nextLine());
			double srednia = (x1 + x1) / 2;

			if (Math.abs(srednia - a) < 2)
			{
				czyPrawda = true;
			}
		} while (czyPrawda = false);
		System.out.println("Hura!");
	}

	public static void pp11()
	{
		double min = -0.45;
		double max = 6.24;

		Random rnd = new Random();
		double los = min + (max - min) * rnd.nextDouble();

		int ile = 0;

		for (int i = 0; i < los; i++)
		{
			ile = i;
		}

		System.out.println(los);
		System.out.println(ile);

	}

	public static void tab01()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj rozmiar tablicy");
		int a = Integer.parseInt(sc.nextLine());
		int[] tab = new int[a];

		for (int i = 0; i < tab.length; i++)
		{
			Random rnd = new Random();
			tab[i] = 10 + rnd.nextInt(41);
		}

		int sum = 0;
		for (int i = 0; i < tab.length; i++)
		{
			if ((tab[i] % 5) % 2 == 0)
			{
				sum += tab[i];
				System.out.print(tab[i] + "\t");
			}
		}
		System.out.println("\nSuma " + sum);

	}

	public static void tab02()
	{
		Random rnd = new Random();
		int a = 9 + rnd.nextInt(30);
		int[] tab = new int[a];

		for (int i = 0; i < tab.length; i++)
		{
			tab[i] = rnd.nextInt(46) - 30;
		}

		for (int i : tab)
		{
			System.out.print(i + "\t");
		}
		System.out.println("----------------------------");

		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] < 0)
			{
				tab[i] = Math.abs(tab[i]);
			} else
			{
				; // wartosc odwrotna...? tablica intow..?
			}
		}

		for (int i : tab)
		{
			System.out.print(i + "\t");
		}

	}

	public static void tab03()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj rozmiar");
		int rozmiar = Integer.parseInt(sc.nextLine());

		double[] tab = new double[rozmiar];

		for (int i = 0; i < tab.length; i++)
		{
			System.out.println("Podaj " + (i + 1) + "¹ wartoœæ z " + tab.length + "iu");
			tab[i] = Double.parseDouble(sc.nextLine());
		}

		double sum = 0;

		for (int i = 0; i < tab.length; i++)
		{
			sum += tab[i];
		}
		double x = ((sum / tab.length) * 2) * 0.1;

		for (int i = 0; i < tab.length; i++)
		{
			tab[i] = tab[i] + x;
		}

		for (double d : tab)
		{
			System.out.println(d + "\t");
		}
	}

	public static void tab04()
	{
		Random rnd = new Random();
		int dim = 10 + rnd.nextInt(36);
		int[] tab = new int[dim];

		for (int i = 0; i < tab.length; i++)
		{
			tab[i] = 2 + rnd.nextInt(39);
		}

		int a, b;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj dwie liczby:\nPodaj pierwsza:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj druga:");
			b = Integer.parseInt(sc.nextLine());
		} while (a > b);

		int sum = 0;
		int licznik = 0;
		System.out.println("a= " + a + " b= " + b);
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] >= a && tab[i] <= b)
			{
				System.out.print(tab[i] + "\t");
				sum += tab[i];
				licznik++;
			}
		}
		double avg = sum / licznik;
	}

	public static void main(String[] args)
	{
		tab04();
	}
}
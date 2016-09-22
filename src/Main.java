import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		// System.out.println("a= " + a + " b= " + b);
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] >= a && tab[i] <= b)
			{
				// System.out.print(tab[i] + "\t");
				sum += tab[i];
				licznik++;
			}
		}
		double avg = sum / licznik;
		System.out.println("Srednia = " + avg);
	}

	/*
	 * Pobierz od u¿ytkownika rozmiar oraz elementy tablicy typu int. Oblicz,
	 * ile w tablicy jest elementów, które s¹ dzielnikami liczby, któr¹
	 * wczeœniej wylosujesz z przedzia³u <5, 100>.
	 */
	public static void tab05()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj rozmiar");
		int rozmiar = Integer.parseInt(sc.nextLine());

		int[] tab = new int[rozmiar];

		for (int i = 0; i < tab.length; i++)
		{
			System.out.println("Podaj " + (i + 1) + "¹ wartoœæ z " + tab.length + "iu");
			tab[i] = Integer.parseInt(sc.nextLine());
		}

		int licznik = 0;
		Random rnd = new Random();
		int x = 5 + rnd.nextInt(96);
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] % x == 0)
			{
				licznik++;
			}
		}
		System.out.println(licznik + " elementow jest dzielnikami liczby " + x);
	}

	/*
	 * Pobierz od u¿ytkownika rozmiar tablicy i utwórz tablicê elementów typu
	 * int. Elementy tablicy losujesz z przedzia³u <-10, 20>, je¿eli element
	 * tablicy znajduje siê pod indeksem parzystym lub z przedzia³u <30,50>,
	 * je¿eli element tablicy znajduje siê pod indeksem nieparzystym. Oblicz
	 * sumê elementów tablicy, które dziel¹ siê przez indeks, pod którym siê
	 * znajduj¹.
	 */
	public static void tab06()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj rozmiar");
		int rozmiar = Integer.parseInt(sc.nextLine());

		int[] tab = new int[rozmiar];

		Random rnd = new Random();
		for (int i = 0; i < tab.length; i++)
		{
			if (i % 2 == 0)
			{
				tab[i] = rnd.nextInt(31) - 10;
			} else
			{
				tab[i] = 30 + rnd.nextInt(81);
			}
		}
		int sum = 0;
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] % i == 0)
			{
				sum += tab[i];
			}
		}
	}

	/*
	 * Rozmiar oraz elementy tablicy s¹ losowane z przedzia³u <10,30>. Wypisz te
	 * elementy tablicy, które przy dzieleniu przez 5 daj¹ resztê, która jest
	 * wiêksza od ostatniej cyfry dzielonego elementu tablicy.
	 */

	public static void tab07()
	{
		Random rnd = new Random();
		int dim = 10 + rnd.nextInt(21);

		double[] tab = new double[dim];

		double min = 10;
		double max = 30;

		for (int i = 0; i < tab.length; i++)
		{
			double x = min + (max - min) * rnd.nextDouble();
		}

		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] % 5 > tab[i] % 10)
			{
				System.out.println(tab[i] + "\t");
			}
		}
	}

	/*
	 * Rozmiar tablicy losowany jest z przedzia³u <4, 10>. Pobieraj od
	 * u¿ytkownika elementy tablicy dot¹d, dopóki ka¿dy kolejny element tablicy,
	 * pocz¹wszy od drugiego, nie bêdzie wiêkszy od elementu poprzedniego.
	 * Wypisz elementy otrzymanej tablicy.
	 */

	public static void tab08()
	{
		Random rnd = new Random();
		int dim = 4 + rnd.nextInt(15);

		int[] tab = new int[dim];

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczbe:");
		tab[0] = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < tab.length - 1; i++)
		{
			do
			{
				System.out.println("Podaj nastepna liczbe:");
				tab[i + 1] = Integer.parseInt(sc.nextLine());
			} while (tab[i] <= tab[i + 1]);
		}

		for (int i : tab)
		{
			System.out.println(i + "\t");
		}

	}

	/*
	 * Rozmiar tablicy losowany jest z przedzia³u <9, 33>. Losuj kolejne
	 * elementy tablicy z przedzia³u <2, 30> dopóki nie bêd¹ liczb¹ podzieln¹
	 * przez 3.
	 */
	public static void tab09()
	{
		Random rnd = new Random();
		int dim = 9 + rnd.nextInt(43);

		int[] tab = new int[dim];

		for (int i = 0; i < tab.length; i++)
		{
			do
			{
				tab[i] = 2 + rnd.nextInt(33);
			} while (tab[i] % 3 != 0);
		}

	}

	/*
	 * Rozmiar tablicy pobierany jest od u¿ytkownika. Elementy tablicy s¹
	 * losowane z przedzia³u <a,b>. Liczby a i b to wartoœci typu int pobierane
	 * od u¿ytkownika, dopóki nie bêdzie spe³niony warunek a < b. Wypisz z
	 * tablicy wszystkie te elementy, które posiadaj¹ parzysty indeks i s¹
	 * podzielne przez wartoœæ wyra¿enia b – a
	 */
	public static void tab10()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wymiar");
		int dim = Integer.parseInt(sc.nextLine());

		int[] tab = new int[dim];

		Random rnd = new Random();

		int a, b;

		do
		{
			System.out.println("Podaj przedzial:\nPodaj a:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj b:");
			b = Integer.parseInt(sc.nextLine());

		} while (a >= b);

		for (int i = 0; i < tab.length; i++)
		{
			tab[i] = a + rnd.nextInt(b + a + 1);
		}

		for (int i = 0; i < tab.length; i++)
		{
			if (i % 2 == 0 && tab[i] % (b - a) == 0)
			{
				System.out.println(tab[i] + "\t");
			}
		}

	}

	/*
	 * Pobieraj od u¿ytkownika napis, dopóki nie bêdzie sk³ada³ siê z samych
	 * du¿ych liter. PrzeprowadŸ analizê pobranego napisu: a) Zlicz, ile w
	 * napisie znajduje siê znaków, których kod ASCII posiada nieparzyst¹ cyfrê
	 * jednoœci b) Oblicz sumê kodów ASCII znaków znajduj¹cych siê na parzystych
	 * indeksach w napisie. Nastêpnie znajdŸ pierwsz¹ liczbê z przedzia³u <65,
	 * 90>, która jest dzielnikiem wyznaczonej wczeœniej sumy. Bêdzie to kod
	 * ASCII jednej z du¿ych liter alfabetu. Zlicz, ile w napisie wystêpuje
	 * liter wiêkszych od wyznaczonej litery.
	 */

	public static void nap1()
	{
		Scanner sc = new Scanner(System.in);
		String nap;
		do
		{
			System.out.println("Podaj napis:");
			nap = sc.nextLine();
		} while (!nap.matches("[A-Z]+"));

		// a)
		int licznik = 0;
		for (int i = 0; i < nap.length(); i++)
		{
			if ((nap.charAt(i) % 10) % 2 != 0)
			{
				licznik += nap.charAt(i);
			}
		}

		// b
		int sum = 0;
		for (int i = 0; i < nap.length(); i++)
		{
			if (i % 2 == 0)
			{
				sum += nap.charAt(i);
			}
		}

		int dzielnik = 0;
		for (int i = 65; i < 90; i++)
		{
			if (sum % i == 0)
			{
				dzielnik = i;
			}
		}

		int licznik2 = 0;
		for (int i = 0; i < nap.length(); i++)
		{
			if (nap.charAt(i) > dzielnik)
			{
				licznik2++;
			}
		}

	}

	/*
	 * Zad 2 Pobierz od u¿ytkownika dwa napisy. Wszystkie spó³g³oski z
	 * pierwszego napisu zast¹p samog³osk¹, która jako pierwsza, pocz¹wszy od
	 * indeksu o numerze 0, pojawi³a siê w napisie drugim. Je¿eli w drugim
	 * napisie nie wyst¹pi³a samog³oska wyœwietl komunikat NIEPRAWID£OWE DANE
	 * WEJŒCIOWE.
	 */

	public static void nap02()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwszy napis");
		String nap1 = sc.nextLine();
		System.out.println("Podaj drugi napis");
		String nap2 = sc.nextLine();

		char samogloska = ' ';
		boolean czySamogloska = true;
		for (int i = 0; i < nap2.length(); i++)
		{
			char z = Character.toLowerCase(nap2.charAt(i));

			if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'y')
			{
				samogloska = z;
				czySamogloska = true;
				break;
			} else
			{
				czySamogloska = false;
			}
		}

		if (czySamogloska == false)
		{
			System.out.println("NIEPRAWID£OWE DANE WEJŒCIOWE");
		}

		System.out.println("samogloska: " + samogloska);

		StringBuilder sb = new StringBuilder(nap1);
		for (int i = 0; i < nap1.length(); i++)
		{
			char z = Character.toLowerCase(nap1.charAt(i));

			if (!(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'y'))
			{
				sb.setCharAt(i, samogloska);
			}
		}

		System.out.println("wynik: " + sb.toString());
	}

	/*
	 * Zad 3 Pobierz od u¿ytkownika napis i wykonaj zestawienie, w którym
	 * wypiszesz, ile w napisie jest ma³ych liter, du¿ych liter oraz cyfr.
	 */

	public static void nap03()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj napis");
		String nap1 = sc.nextLine();

		int duze = 0;
		int male = 0;
		int liczba = 0;

		for (int i = 0; i < nap1.length(); i++)
		{
			char z = nap1.charAt(i);

			if (Character.isUpperCase(nap1.charAt(i)))
			{
				duze++;
			}

			if (Character.isLowerCase(z))
			{
				male++;
			}

			if (Character.isDigit(z))
			{
				liczba++;
			}
		}

		System.out.println("Duze " + duze + ", male " + male + ", liczby " + liczba);

	}

	/*
	 * Zad 4 Pobieraj od u¿ytkownika napis, dopóki jego d³ugoœæ nie bêdzie
	 * liczb¹ parzyst¹. Nastêpnie zamieñ miejscami kolejne pary znaków, tak jak
	 * pokazano to w przyk³adzie: przed -> ABCDEF, po -> BADCFE. Wypisz
	 * zmodyfikowany napis.
	 */

	public static void nap04() // ??? :(
	{
		String nap = "";

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj napis");
			nap = sc.nextLine();
		} while (nap.length() + 1 % 2 == 0);

		StringBuilder sb = new StringBuilder(nap);

		for (int i = 0; i < sb.length() - 1; i++)
		{
			char ch1 = sb.charAt(i);
			char ch2 = sb.charAt(i + 1);
			sb.setCharAt(i, ch2);
			sb.setCharAt(i + 1, ch1);
		}

		System.out.println(sb.toString());
	}
	
	/*

	/*
	 * Zad 1 Napisz funkcjê, która przyjmuje jako argument wspó³czynniki
	 * równania kwadratowego a, b, c i zwraca liczbê miejsc zerowych tego
	 * równania.
	 */
	public static int fun01(double a, double b, double c)
	{
		int lMiejscZero = 0;
		double delta = b * b - (4 * (a * c));
		if (delta > 0)
		{
			lMiejscZero = 2;
		} else if (delta == 0)
		{
			lMiejscZero = 1;
		} else
		{
			lMiejscZero = 0;
		}
		return lMiejscZero;
	}

	/*
	 * Zad 2 Napisz funkcjê, która przyjmuje jako argument napis i zamienia w
	 * nim wszystkie du¿e litery na ma³e, a ma³e litery na du¿e. Funkcja zwraca
	 * tak zmodyfikowany napis.
	 */

	public static String fun02(String nap)
	{
		StringBuilder sb = new StringBuilder(nap);
		for (int i = 0; i < sb.length(); i++)
		{
			if (Character.isUpperCase(sb.charAt(i)))
			{
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			}
		}
		String nap2 = sb.toString();
		return nap2;
	}

	/*
	 * Zad 3 Napisz funkcjê, która przyjmuje jako argument trzy liczby typu
	 * double i zwraca najwiêksz¹ z nich.
	 */
	public static double fun03(double a, double b, double c)
	{
		double[] tab = { a, b, c };
		double maxV = Arrays.stream(tab).max().getAsDouble();

		return maxV;
	}

	/*
	 * Zad 4 Napisz funkcjê, która przyjmuje jako argument trzy liczby typu
	 * double – boki trójk¹ta i zwraca prawdê, je¿eli jest to trójk¹t
	 * prostok¹tny lub fa³sz, je¿eli nie jest to trójk¹t prostok¹tny.
	 */

	public static boolean fun04(double a, double b, double c)
	{
		boolean czyProstokatny = false;

		if (a * a + b * b == c * c)
		{
			czyProstokatny = true;
		} else
		{
			czyProstokatny = false;
			return czyProstokatny = false;
		}
		if (czyProstokatny == true)
		{
			System.out.println("True");
		} else
		{
			System.out.println("False");
			return czyProstokatny = false;
		}
		return false;
	}
	
	

	// ******** WAKACYJNY ZBIOR ZADAN ***

	/*
	 * Pobierz od u¿ytkownika listê dowolnych marek samochodów. Nastêpnie
	 * stosuj¹c strumienie zwróæ kolekcjê Set marek, które maj¹ w nazwie
	 * sk³adaj¹cej siê z samych du¿ych liter co najmniej 3 samog³oski, których
	 * suma kodów ASCII jest liczb¹ parzyst¹ o nieparzystej cyfrze dziesi¹tek.
	 */
	public static void str1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liste marek samocodow");

		List<String> marki = new ArrayList<>();

		String marka;
		for (int i = 0; i < 5; i++)
		{
			do
			{
				System.out.println("Podaj marke");
				marka = sc.nextLine();
			} while (!marka.matches("[A-Z]+"));
			System.out.println("DODANO MARKE NR " + i);
			marki.add(marka);
		}

		Predicate<String> p1 = nap ->
		{
			int licz = 0;
			for (int i = 0; i < nap.length(); i++)
			{
				String jedenZnak = String.valueOf(nap.charAt(i));
				if (jedenZnak.matches("[aeyuioAEYUIO]"))
				{
					licz++;
				}
			}

			return licz >= 3;
		};

		Predicate<String> p2 = nap ->
		{
			int suma = 0;
			for (int i = 0; i < nap.length(); i++)
			{
				suma += nap.charAt(i);
			}

			return suma % 2 == 0 && ((suma % 100) / 10) % 2 != 0;

		};

		Set<String> przefiltrowaneMarki = marki.stream().filter(p1.and(p2)).collect(Collectors.toSet());
		przefiltrowaneMarki.forEach(s ->
		{
			System.out.println(s);
		});
	}

	/*
	 * Pobierz od u¿ytkownika listê dowolnych liczb ca³kowitych. Nastêpnie
	 * stosuj¹c strumienie odrzuæ liczby, których kwadraty s¹ liczb¹ wiêksz¹ od
	 * 100 i posortuj pozosta³e liczby wed³ug kryterium: najwiêksza liczba to
	 * ta, która posiada najwiêksz¹ cyfrê dziesi¹tek. Posortowane elementy
	 * wypisz w konsoli.
	 */

	public static void str2()
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Podaj liczbe calkowita");
			lista.add(Integer.parseInt(sc.nextLine()));
		}

		lista.stream().filter(e ->
		{
			return (e * e) > 100;
		}).sorted((e1, e2) ->
		{
			if ((e1 % 100) > (e2 % 100))
			{
				return -1;
			} else
			{
				return 1;
			}
		}).forEach(e ->
		{
			System.out.println(e);
		});
	}

	public static void main(String[] args)
	{
		nap04();
	}
}
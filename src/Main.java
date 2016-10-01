import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main

{
	// public Scanner sc = new Scanner(System.in);

	public static void pp1(double x)
	{
		System.out.println("Zadnie 1 \n");
		System.out.println("Podaj liczbe rzeczywistą:");
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
		System.out.println("Podaj trzy liczby całkwite \nPodaj pierwszą liczbę:");
		Scanner sc = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		double liczba1 = Double.parseDouble(sc.nextLine());
		lista.add(liczba1);
		System.out.println("Podaj drugą liczbę:");
		double liczba2 = Double.parseDouble(sc.nextLine());
		lista.add(liczba2);
		System.out.println("Podaj trzecią liczbę:");
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
		 * "Podaj trzy liczby całkwite \nPodaj pierwszą liczbę:"); Scanner sc =
		 * new Scanner(System.in); double liczba1 =
		 * Double.parseDouble(sc.nextLine()); System.out.println(
		 * "Podaj drugą liczbę:"); double liczba2 =
		 * Double.parseDouble(sc.nextLine()); System.out.println(
		 * "Podaj trzecią liczbę:"); double liczba3 =
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
			System.out.println("Podaj trzy liczby\nPodaj pierwszą liczbę:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj drugą liczbę:");
			b = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj trzecią liczbę:");
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
			System.out.println("Podaj liczbę:");
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
		System.out.println("Największa suma cyfr wynosi: " + Collections.max(sumy));
		System.out.println("--------------------------------------------------");
	}

	public static void pp8()
	{
		int a = 0;
		int b = 0;

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj dwie liczby:\nPodaj pierwszą:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Podaj drugą:");
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
			System.out.println("Podaj " + (i + 1) + "ą wartość z " + tab.length + "iu");
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
	 * Pobierz od użytkownika rozmiar oraz elementy tablicy typu int. Oblicz,
	 * ile w tablicy jest elementów, które są dzielnikami liczby, którą
	 * wcześniej wylosujesz z przedziału <5, 100>.
	 */
	public static void tab05()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj rozmiar");
		int rozmiar = Integer.parseInt(sc.nextLine());

		int[] tab = new int[rozmiar];

		for (int i = 0; i < tab.length; i++)
		{
			System.out.println("Podaj " + (i + 1) + "ą wartość z " + tab.length + "iu");
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
	 * Pobierz od użytkownika rozmiar tablicy i utwórz tablicę elementów typu
	 * int. Elementy tablicy losujesz z przedziału <-10, 20>, jeżeli element
	 * tablicy znajduje się pod indeksem parzystym lub z przedziału <30,50>,
	 * jeżeli element tablicy znajduje się pod indeksem nieparzystym. Oblicz
	 * sumę elementów tablicy, które dzielą się przez indeks, pod którym się
	 * znajdują.
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
	 * Rozmiar oraz elementy tablicy są losowane z przedziału <10,30>. Wypisz te
	 * elementy tablicy, które przy dzieleniu przez 5 dają resztę, która jest
	 * większa od ostatniej cyfry dzielonego elementu tablicy.
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
	 * Rozmiar tablicy losowany jest z przedziału <4, 10>. Pobieraj od
	 * użytkownika elementy tablicy dotąd, dopóki każdy kolejny element tablicy,
	 * począwszy od drugiego, nie będzie większy od elementu poprzedniego.
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
	 * Rozmiar tablicy losowany jest z przedziału <9, 33>. Losuj kolejne
	 * elementy tablicy z przedziału <2, 30> dopóki nie będą liczbą podzielną
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
	 * Rozmiar tablicy pobierany jest od użytkownika. Elementy tablicy są
	 * losowane z przedziału <a,b>. Liczby a i b to wartości typu int pobierane
	 * od użytkownika, dopóki nie będzie spełniony warunek a < b. Wypisz z
	 * tablicy wszystkie te elementy, które posiadają parzysty indeks i są
	 * podzielne przez wartość wyrażenia b – a
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
	 * Pobieraj od użytkownika napis, dopóki nie będzie składał się z samych
	 * dużych liter. Przeprowadź analizę pobranego napisu: a) Zlicz, ile w
	 * napisie znajduje się znaków, których kod ASCII posiada nieparzystą cyfrę
	 * jedności b) Oblicz sumę kodów ASCII znaków znajdujących się na parzystych
	 * indeksach w napisie. Następnie znajdź pierwszą liczbę z przedziału <65,
	 * 90>, która jest dzielnikiem wyznaczonej wcześniej sumy. Będzie to kod
	 * ASCII jednej z dużych liter alfabetu. Zlicz, ile w napisie występuje
	 * liter większych od wyznaczonej litery.
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
	 * Zad 2 Pobierz od użytkownika dwa napisy. Wszystkie spółgłoski z
	 * pierwszego napisu zastąp samogłoską, która jako pierwsza, począwszy od
	 * indeksu o numerze 0, pojawiła się w napisie drugim. Jeżeli w drugim
	 * napisie nie wystąpiła samogłoska wyświetl komunikat NIEPRAWIDŁOWE DANE
	 * WEJŚCIOWE.
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
			System.out.println("NIEPRAWIDŁOWE DANE WEJŚCIOWE");
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
	 * Zad 3 Pobierz od użytkownika napis i wykonaj zestawienie, w którym
	 * wypiszesz, ile w napisie jest małych liter, dużych liter oraz cyfr.
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
	 * Zad 4 Pobieraj od użytkownika napis, dopóki jego długość nie będzie
	 * liczbą parzystą. Następnie zamień miejscami kolejne pary znaków, tak jak
	 * pokazano to w przykładzie: przed -> ABCDEF, po -> BADCFE. Wypisz
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
	 * Zad 5 Pobierz od użytkownika dwa napisy i wygeneruj trzeci napis. Trzeci
	 * napis zawiera na początku same samogłoski z napisu pierwszego, a
	 * następnie same spółgłoski z napisu drugiego. Przykład: napis pierwszy ->
	 * abcdef, napis drugi -> ghijkl, wynik -> aeghjkl.
	 */

	public static void nap05()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj dwa napisy:\nPodaj pierwszy:");
		String nap1 = sc.nextLine();
		System.out.println("Podaj drugi:");
		String nap2 = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < nap1.length(); i++)
		{
			char z = Character.toLowerCase(nap1.charAt(i));

			if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'y')
			{
				sb.append(z);
			}
		}

		for (int i = 0; i < nap2.length(); i++)
		{
			char z = Character.toLowerCase(nap2.charAt(i));

			if (Character.isLetter(z) && !(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'y'))
			{
				sb.append(z);
			}
		}

		System.out.println(sb.toString());

	}

	/*
	 * Zad 6 Pobierz od użytkownika napis. Kod ASCII wszystkich znaków, które
	 * znajdują się pod indeksem parzystym zwiększ o 10, natomiast kod ASCII
	 * pozostałych znaków zmniejsz o 5. Po tej zmianie oblicz, ile liter
	 * znajduje się w zmodyfikowanym napisie.
	 */

	public static void nap06()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj napis");
		String nap1 = sc.nextLine();

		int[] asciiTab = new int[nap1.length()];
		for (int i = 0; i < asciiTab.length; i++)
		{
			if (i % 2 == 0)
			{
				asciiTab[i] = nap1.charAt(i) + 10;
			} else
			{
				asciiTab[i] = nap1.charAt(i) - 5;
			}

		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < asciiTab.length; i++)
		{
			sb.append(Character.toString((char) asciiTab[i]));
		}
				
		int licznik = 0;
		for (int i = 0; i < sb.length(); i++)
		{
			if (Character.isLetter(sb.charAt(i)))
			{
				licznik++;
			}
		}
		
		System.out.println("W zmodfikowanym napisie znajduje sie " + licznik + " liter.");
	}

	/*
	 * Zad 7 Pobieraj od użytkownika dwa napisy, dopóki nie będą posiadały tej
	 * samej długości. Następnie wygeneruj trzeci napis, który będzie zawierał w
	 * sobie na przemian znaki z pierwszego i drugiego napisu. Przykładowo wyraz
	 * pierwszy ABCD oraz wyraz drugi EFGH dają wynik AEBFCGDH.
	 */
	
	public static void nap07()
	{
		String nap1;
		String nap2;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj dwa napisy:\nPodaj pierwszy:");
			nap1 = sc.nextLine();
			System.out.println("Podaj drugi:");
			nap2 = sc.nextLine();

		} while (nap1.length() != nap2.length());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < nap1.length(); i++)
		{
				sb.append(nap1.charAt(i));
				sb.append(nap2.charAt(i));
		}
		
		System.out.println(sb.toString());
	}

	/*
	 * Zad 8 Pobierz od użytkownika napis i sprawdź, ile występuje w nim
	 * wyrazów. Zbadaj, ile wyrazów zaczyna się z dużej litery oraz ile wyrazów
	 * zaczyna się z małej litery. Wypisz na ekranie otrzymane wyniki.
	 */
	
	public static void nap08()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj napis");
		String nap1 = sc.nextLine();

		String[] napTab = nap1.split(" ");
		
		int duze = 0;
		int male = 0;
		for (int i = 0; i < napTab.length; i++)
		{
			if (Character.isUpperCase(napTab[i].charAt(0)))
			{
				duze++;
			}
			else if (Character.isLowerCase(napTab[i].charAt(0)))
			{
				male++;
			}
		}
		
		System.out.println(duze + " wyrazy zaczyaja sie od wielkiej litery a " + male + " mala.");
		
		
		/*for (String string : napTab)
		{
			System.out.println(string + "\n");
		}*/
	}

	/*
	 * Zad 9 Pobierz od użytkownika napis i powiel w nim n razy wszystkie
	 * wystąpienia znaku podanego przez użytkownika, gdzie n to liczba pobrana
	 * przez użytkownika. Przykład: Wyraz: abecadlo, n = 3, znak od użytkownika
	 * = a wynik: aaabecaaadlo
	 */
	
	public static void nap09()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj napis");
		String nap1 = sc.nextLine();
		String x = "";
		do
		{
			System.out.println("Podaj litere:");
			x = sc.nextLine();
		} while (x.length() != 1);
		System.out.println("Podaj cyfre:");
		int n = Integer.parseInt(sc.nextLine());
		char z = x.charAt(0);
		
		
		
		StringBuilder sb = new StringBuilder(nap1);
		
		for (int i = 0; i < sb.length(); i++)
		{
			//char h = Character.toLowerCase(sb.toString().charAt(i));
			if (sb.toString().charAt(i) == z)
			{
				
			}
		}
		
		System.err.println(sb.toString());
		
		
		
		
		
	}

	/*
	 * Zad 10 Pobieraj od użytkownika napis, dopóki nie będzie zawierał
	 * poprawnie zapisanej liczby. Zakładamy, że poprawnie zapisana liczba to
	 * taka, do której zapisu użyto „zwykłego” zapisu lub notacji naukowej.
	 * Przykłady poprawnie zapisanych liczb: 2.4, -12.45, 10E12, -5.45E9, 8E-3,
	 * 23.34e10, 24.3e-5.
	 */
	
	public static void nap10()
	{
		String nap;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj napis w notacji naukowej.");
			nap = sc.nextLine();
		} while (!nap.matches("-?[0-9]+[E]?-?[//.]?[0-9]*[Ee]?-?[0-9]*"));
		
	}

	/*
	 * Zad 1 Napisz funkcję, która przyjmuje jako argument współczynniki
	 * równania kwadratowego a, b, c i zwraca liczbę miejsc zerowych tego
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
	 * Zad 2 Napisz funkcję, która przyjmuje jako argument napis i zamienia w
	 * nim wszystkie duże litery na małe, a małe litery na duże. Funkcja zwraca
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
	 * Zad 3 Napisz funkcję, która przyjmuje jako argument trzy liczby typu
	 * double i zwraca największą z nich.
	 */
	public static double fun03(double a, double b, double c)
	{
		double[] tab = { a, b, c };
		double maxV = Arrays.stream(tab).max().getAsDouble();

		return maxV;
	}

	/*
	 * Zad 4 Napisz funkcję, która przyjmuje jako argument trzy liczby typu
	 * double – boki trójkąta i zwraca prawdę, jeżeli jest to trójkąt
	 * prostokątny lub fałsz, jeżeli nie jest to trójkąt prostokątny.
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

	/*
	 * Napisz funkcję, która przyjmuje dwie liczby typu int a i b. Funkcja
	 * zwraca sumę liczb z przedziału <a,b>.
	 */
	public static int fun05(int a, int b)
	{
		int sum = 0;

		for (int i = a; i <= b; i++)
		{
			sum += i;
		}

		return sum;
	}

	// Napisz funkcję, która przyjmuje tablicę elementów typu int
	// oraz liczbę typu int – zmienna a. Funkcja zwraca,
	// ile w tablicy jest elementów większych od podanej liczby.

	public static int fun06(int[] tab, int a)
	{
		int licznik = 0;

		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] > a)
			{
				licznik++;
			}
		}
		return licznik;
	}

	// Napisz funkcję, która pobiera jako argument tablicę elementów typu
	// int
	// i zwraca trzeci co do wielkości element tablicy.
	// POPRAWIC
	// NIE ZADZIALA DLA 1 1 1 2 2 2 4 4 4
	public static int fun07(int[] tab)
	{
		int[] dis = IntStream.of(tab).distinct().sorted().toArray();

		if (dis.length >= 3)
		{
			return dis[dis.length - 3];
		} else
		{
			return dis[0]; // zeby nie zwracac czegos innego niz jest w tablicy
							// umawiamy sie ze jak nie ma trzeciego co do
			// wielkosci elementu to zwraca element drugi lub pierwszy co do
			// wielkosci
		}

	}

	// Napisz funkcję, która jako argument przyjmuje dwa napisy
	// i zwraca napis o większej liczbie spółgłosek.

	public static String fun08(String nap1, String nap2)
	{

		int licznik1 = 0;

		for (int i = 0; i < nap1.length(); i++)
		{
			char z = Character.toLowerCase(nap1.charAt(i));

			if (Character.isLetter(z) && !(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'y'))
			{
				licznik1++;
			}
		}

		int licznik2 = 0;

		for (int i = 0; i < nap2.length(); i++)
		{
			char z = Character.toLowerCase(nap2.charAt(i));

			if (Character.isLetter(z) && !(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'y'))
			{
				licznik2++;
			}
		}

		if (licznik1 > licznik2)
		{
			return nap1;
		} else if (licznik2 > licznik1)
		{
			return nap2;
		} else
		{
			return "Rowne";
		}

	}

	/*
	 * Zad 9 Napisz funkcję, która przyjmuje jako argument napis oraz dwie
	 * liczby typu int a i b. Funkcja zwraca napis utworzony ze znaków napisu
	 * podanego jako argument o indeksach z przedziału <a,b>.
	 */

	public static String fun09(String nap, int a, int b)
	{
		String nap2 = "";
		if (b <= nap.length() && !(a < 0) && b > a)
		{
			nap2 = nap.substring(a, b + 1);
		}
		return nap2;
	}

	/*
	 * Zad 10 Funkcja przyjmuje jako argument dwie tablice elementów typu int o
	 * dowolnych rozmiarach i zwraca największy element tablicy, której średnia
	 * arytmetyczna jest większa
	 */

	public static int fun10(int[] tab1, int[] tab2)
	{

		if (Arrays.stream(tab1).average().getAsDouble() > Arrays.stream(tab2).average().getAsDouble())
		{
			return Arrays.stream(tab1).max().getAsInt();
		} else if (Arrays.stream(tab1).average().getAsDouble() < Arrays.stream(tab2).average().getAsDouble())
		{
			return Arrays.stream(tab2).max().getAsInt();
		} else
		{
			return 0;
		}
	}
	
/*	Zad 1
	Plik tekstowy ‘tablica.txt’ ma postać:
	8 3 2 1 4 3 2
	Pobierz liczby z pliku tekstowego do tablicy i wypisz na ekranie sumę
	elementów tej tablicy.*/
	
	public static void text01() throws FileNotFoundException
	{
		String path = "C:\\Users\\Korczi\\workspace\\H16_WakacyjnyZbiorZadan_1\\tablica.txt";
		File textFile = new File(path);
		Scanner sc = new Scanner(textFile);
		ArrayList<Integer> valArr = new ArrayList<>();
		while (sc.hasNextInt())
		{
			valArr.add(sc.nextInt());
		};
		
		int sum = valArr.stream().mapToInt(v -> v.intValue()).sum();
		System.out.println(valArr + "\n" + sum);
	}
	
	/*Zad 2
	Plik tekstowy ‘tablicaDwa.txt’ ma postać:
	3 4
	1 2 3 4
	5 6 7 8
	9 0 1 2
	Pierwsza linia w pliku tekstowym to informacje o ilości odpowiednio
	wierszy i kolumn tablicy dwuwymiarowej. Kolejne wiersze w pliku to
	kolejne wiersze tablicy dwuwymiarowej. Pobierz z pliku tekstowego dane
	do tablicy dwuwymiarowej i wyznacz kolumnę o największej sumie
	elementów.*/
	
	public static void text02() throws FileNotFoundException
	{
		String path = "C:\\Users\\Korczi\\workspace\\H16_WakacyjnyZbiorZadan_1\\tablicaDwa.txt";
		File textFile = new File(path);
		Scanner sc = new Scanner(textFile);
		
		
	}

	// ******** WAKACYJNY ZBIOR ZADAN 2***

	/*
	 * Pobierz od użytkownika listę dowolnych marek samochodów. Następnie
	 * stosując strumienie zwróć kolekcję Set marek, które mają w nazwie
	 * składającej się z samych dużych liter co najmniej 3 samogłoski, których
	 * suma kodów ASCII jest liczbą parzystą o niepa rzystej cyfrze dziesiątek.
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
	 * Pobierz od użytkownika listę dowolnych liczb całkowitych. Następnie
	 * stosując strumienie odrzuć liczby, których kwadraty są liczbą większą od
	 * 100 i posortuj pozostałe liczby według kryterium: największa liczba to
	 * ta, która posiada największą cyfrę dziesiątek. Posortowane elementy
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
		nap10();
		
		
		/*try
		{
			text01();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
}
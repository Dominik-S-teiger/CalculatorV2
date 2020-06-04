import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = 0, a = 0, i = 0, o;
		String b = "";
		String konec = "konec";
		boolean p;

		System.err.println("Kalkulaèka verze: 2.0");
		System.out.println("\nsèítání: \t+ ");
		System.out.println("odèítaní: \t-");
		System.out.println("násobení: \t*");
		System.out.println("dìlení: \t/");
		System.out.println("umocnìní \tmoc (a moc b (b=na kolikátou)");
		System.out.println("odmocnìní \todm (druhá odmocnina)");
		System.out.println("for exit: \tend ");
		System.out.println("nápovìda: \thelp (zobrazí se tento èlánek)");
		System.err.println("pøíklady pište v tomto formátu: A + B\n");
		while (konec.equalsIgnoreCase("konec")) {
			p = true;
			i = 0;
			do {
				o = 0;
				System.out.println("zadej pøíklad:");
				try {
					String MainIn = sc.nextLine();
					if (MainIn.equalsIgnoreCase("end")) {
						System.out.println("\nukonèuji program");
						System.exit(0);
					}
					if (MainIn.equalsIgnoreCase("help")) {
						MathAlgo.help();
						p = false;
					}

					String[] arrSplit = MainIn.split(" ");
					a = Double.valueOf(arrSplit[0] + " ");
					b = String.valueOf(arrSplit[1]);
					if (b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/") || b.equals("moc")) {
						c = Double.valueOf(arrSplit[2]);
						i = 1;
					}
				} catch (Exception e) {
					if (p == true) {
						System.err.println("»»»»CHYBA««««");
						o = 1;
					}
				}
			} while (o == 1);

			System.out.print(a);
			System.out.print(b);
			if (i == 1) {
				System.out.print(c);
			}
			System.out.println("\n\nvýsledek: ");
			switch (b) {

			case "+":
				System.out.println(MathAlgo.Mcount(a, c));
				break;

			case "-":
				double B = MathAlgo.Msubtra(a, c);
				System.out.println(B);
				break;

			case "moc":
				int pom = (int) c;
				System.out.println(MathAlgo.Msqrt(a, pom));
				break;

			case "/":
				System.out.println(MathAlgo.Mdiv(a, c));
				break;

			case "*":
				System.out.println(MathAlgo.Mmulti(a, c));
				break;

			case "odm":
				System.out.println(MathAlgo.Modm(a));
				break;

			}
		}
	}

}

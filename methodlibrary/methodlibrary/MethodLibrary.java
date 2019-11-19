package methodlibrary;

import java.util.Scanner;

public class MethodLibrary {

	public static void main(String[] args) {
		
		Fahren();
		Kelvin();
		KM();
		KE();
		PE();
		Tre();
		Pappa();
		Programmering();
		MS();
		Work();
		VtoH();
		VolymS();
		AreaC();
		KRtoEU();
	}
		public static void Fahren() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv ut Fahrenheit");
		double F = input.nextDouble();
		System.out.println(FtillK(F));
	}
		/**
		 * Skickar Fahren gör om fharen till kelvin sedan skickar tillbaks kelvin och skriver ut kelvin
		 * @param F
		 * @return
		 */
		public static double FtillK(double F) {
			double kelvin = (F - 32) * 5/9 + 273.15;
			return kelvin;	
}
		
		
		public static void Kelvin() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv ut Kelvin");
			double K = input.nextDouble();
			System.out.println(KtillC(K));
		}
		/**
		 * Skickar kelvin gör om kelvin till celcius sedan skickar tillbaks celcius och skriver ut celcius
		 * @param K
		 * @return
		 */
		public static double KtillC(double K) {
			double C = K - 273.15;
			return C;
}
			
		
		public static void KM() {
			Scanner input = new Scanner(System.in);
			System.out.println("Km/h");
			double km = input.nextDouble();
			System.out.println(kmtillms(km));
		}
		/**
		 * Skickar km/h gör om km/h till m/s sedan skickar tillbaks m/s och skriver ut m/s
		 * @param km
		 * @return
		 */
		public static double kmtillms(double km) {
			double ms = km / 3.6;
			return ms;
			
		}
		
		
		public static void KE() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv ut massa sen hastighet");
			double M = input.nextDouble();
			double V = input.nextDouble();
			System.out.println(KineticEnergi(M,V));
		}
		/**
		 * Skickar massa och hastighet sedan räknar ut KE skickar tillbaks KE och skriver ut KE
		 * @param M
		 * @param V
		 * @return
		 */
		public static double KineticEnergi(double M,double V) {
			double KinEn = (M *(Math.sqrt(V)))/2;
			return KinEn;
		}
		
		
		public static void PE() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv ut massa sen höjd");
			double Mass = input.nextDouble();
			double Height = input.nextDouble();
			System.out.println(MH(Mass,Height));
		}
		/**
		 * Skickar massa och höjd sedan räknar ut PE skickar tillbaks PE och skriver ut PE
		 * @param Mass
		 * @param Height
		 * @return
		 */
		public static double MH(double Mass, double Height) {
			double MassHeight = Mass * Height * 9.82;
			return MassHeight;
		}
		
		
		public static void Tre() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv ut tre tal");
			double First = input.nextDouble();
			double Second = input.nextDouble();
			double Third = input.nextDouble();
			System.out.println(TreTal(First, Second, Third));
		}
		/**
		 * Skickar tre tal och räknar ut medelvärdet returnar medelvärdet och skriver ut medelvärdet
		 * @param First
		 * @param Second
		 * @param Third
		 * @return
		 */
		public static double TreTal(double First, double Second, double Third) {
			double medel = (First + Second + Third) / 3;
			return medel;
		}
		
		
		public static void Pappa() {
			String Papa = "PaParaZZi";
			System.out.println(Mama(Papa));
		}
		/**
		 * Skickar Papa gör om Papa till små boksäver sedan returnar och skriver ut Mamma (Papa med små bokstäver)
		 * @param Papa
		 * @return
		 */
		public static String Mama(String Papa) {
			String Mamma = Papa.toLowerCase();
			return Mamma;
		}
		
		
		public static void Programmering() {
			String pgr = "Jag vill bli godkänd i programmering! <3";
			System.out.println(prog(pgr));
		}
		/**
		 * Skickar pgr gör om pgr till stora boksäver och gör om de o till 0 
		 * sedan returnar och skriver ut prog (pgr med stora bokstäver och 0 till 0)
		 * @param pgr
		 * @return
		 */
		public static String prog(String pgr) {
			String lower = (pgr.replace("o", "0").toUpperCase());
			return lower;
		}

		
		public static void MS() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv sträcka sedan hastighet");
			double S = input.nextDouble();
			double V = input.nextDouble();
			System.out.println(MdelaS(S,V));
		}
		/**
		 * Skickar sträcka och hastighet så tar den reda på hur lång tid det tar för fordonet att åka den sträckan
		 * sedan returnar den och skriver ut svaret 
		 * @param S
		 * @param V
		 * @return
		 */
		public static double MdelaS(double S, double V) {
			double MDS = S / V;
			return MDS;
		}

		
		public static void Work() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv kraften sen sträcka");
			double F = input.nextDouble();
			double S = input.nextDouble();
			System.out.println(Jobba(F,S));
		}
		/**
		 * skickar kraften och sträckan räknar ut arbete och returnar svaret och skriver ut det
		 * @param F
		 * @param S
		 * @return
		 */
		public static double Jobba(double F, double S) {
			double Jobb = F * S;
			return Jobb;
		}
		
		
		public static void VtoH() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv hastighet");
			double V = input.nextDouble();
			System.out.println(Hojd(V));
		}
		/**
		 * skickar hastighet räknar ut hur högt den kommer ut returnar svaret och skriver ut det
		 * @param V
		 * @return
		 */
		public static double Hojd(double V) {
			double VelocityHojd = Math.pow(V, 2) / (2 * 9.82);
			return VelocityHojd;
		}

		
		public static void VolymS() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv sfärens volym");
			double V = input.nextDouble();
			System.out.println(Volym(V));
		}
		/**
		 * Skickar en sfärs volym räknar ut radien på sfären, returnar svaret och skriver ut det
		 * @param V
		 * @return
		 */
		public static double Volym(double V) {
			double radie = (Math.cbrt((V*3) / (4*Math.PI)));
			return radie;
		}
		
		
		public static void AreaC() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv Radien på cirkeln");
			double Radie = input.nextDouble();
			System.out.println(Area(Radie));
		}
		/**
		 * Skickar radien och räknar ut en cirkels area returnar svaret och skriver ut svaret
		 * @param Radie
		 * @return
		 */
		public static double Area(double Radie) {
			double A = Math.pow(Radie, 2) * Math.PI;
			return A;
		}

		
		public static void KRtoEU() {
			Scanner input = new Scanner(System.in);
			System.out.println("Skriv hur många kronor");
			double KR = input.nextDouble();
			System.out.println(Euro(KR));
		}
		/**
		 * Skickar antal Kronor och räknar ut hur många Kronor är Euro returnar svaret och skriver ut svaret
		 * @param KR
		 * @return
		 */
		public static double Euro(double KR) {
			double EU = KR * 0.094;
			return EU;
		}
}


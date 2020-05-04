import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class ovning {

	public static void main(String[] args) {
		
        ArrayList<String> namn = new ArrayList<>();
        
        Collection<? extends String> namn1 = (Collection<? extends String>) Arrays.asList("Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle",
				"Gustafsson Emil", "Hasic Edvin", "Helenius Anton", "Jenslöv Max", "Jonsson Svante", "Kamo Vivian",
				"Khanzade Vakil Kandi Pedram", "Leisten David", "Lindqvist Lucas", "Lindström Linus",
				"Markström Stenhammar Zachris", "Nelin Jacob", "Niklasson Theodor", "Nilsson Fredrik", "Norberg Max",
				"Ohlsson Andreas", "Parsa Filip", "Richardsson Filippa", "Roman David", "Romland Linus",
				"Sandström Ludvig", "Simonsen Johan", "Simonsen Markus", "Tammpere Patrik", "Thilén Philip",
				"Utbult David", "Vins Andreas");
        
        namn.addAll(namn1);   
        
        for (int i = 0; i < namn.size(); i++) {
			System.out.print(namn.get(i) + ", ");
		}
        System.out.println();
        System.out.println();
        
        Collections.swap(namn, 4, 9);
        for (int i = 0; i < namn.size(); i++) {
			System.out.print(namn.get(i) + ", ");
		}
        
        System.out.println();
        System.out.println();
        namn.add(0, "Gustafsson Emil");
    
        for (int i = 0; i < namn.size(); i++) {
			System.out.print(namn.get(i) + ", ");
		}
        
        System.out.println();
        System.out.println();
        ((String) namn).startsWith("P")
        for (int i = 0; i < namn.size(); i++) {

			System.out.print(namn.get(i) + ", ");
		}

		

	}
}

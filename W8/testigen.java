import java.util.Scanner;

public class testigen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		if (ord.contains("Javatpoint.com")) {
			System.out.println("0	1	2	3	4	5	6	7	8	9\r\n" + 
					"10	11	12	13	14	15	16	17	18	19\r\n" + 
					"20	21	22	23	24	25	26	27	28	29\r\n" + 
					"30	31	32	33	34	35	36	37	38	39\r\n" + 
					"40	41	42	43	44	45	46	47	48	49\r\n" + 
					"50	51	52	53	54	55	56	57	58	59\r\n" + 
					"60	61	62	63	64	65	66	67	68	69\r\n" + 
					"70	71	72	73	74	75	76	77	78	79\r\n" + 
					"80	81	82	83	84	85	86	87	88	89\r\n" + 
					"90	91	92	93	94	95	96	97	98	99\r\n" + 
					"100");
			{
				System.out.println(ord);
			}
		} else {
			System.out.println("fel");
		}
	}
}

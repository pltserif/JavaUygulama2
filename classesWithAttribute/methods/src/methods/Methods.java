package methods;

public class Methods {

	public static void main(String[] args) {
		int toplam = topla(1,2,3,4,5);

		System.out.println(toplam);
		

	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam +=i;

		}
		return toplam;

	}

}

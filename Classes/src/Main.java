
public class Main {

	public static void main(String[] args) {
		//Bellekte CustomerManager türünde bir nesne ürettik.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		//Bu işlemi yaparsam custumerManager sınıfımı tanımlamamın hiç bir anlamı yok. İki tanımlamada aynı referansa gider.
		customerManager = customerManager2;
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//ValueTypes
		//Ders 29 Youtube.
		int num1 = 10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);
		//Arrayler referans tiptir.
		int[] sayılar1 = new int[] {1,2,3};
		int[] sayılar2 = new int[] {4,5,6};
		sayılar2 = sayılar1;
		sayılar1[0] = 10;
		System.out.println(sayılar2[0]);
		
								
	}

}

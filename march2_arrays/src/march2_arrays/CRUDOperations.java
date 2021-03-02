package march2_arrays;

public class CRUDOperations {

	public static void main(String[] args) {
		int ar[] = new int[9];//create
		ar[0] = 49;
		ar[1] = 43;
		ar[2] = 198;
		ar[3] = 137;
		ar[4] = 95;
		int n = 5;
		System.out.println("Origional Array");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");//read
		}
		
		//update
		int ele = 420;
		int pos = 5;
		for(int i = n; i > pos - 1; i--) {
			ar[i] = ar[i-1];
		}
		ar[pos - 1] = ele; //insert
		n++;
		
		System.out.println("\nAfter Update");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		
		int delpos = 3; //delete
		for (int i = delpos - 1; i < n; i++) {
			ar[i] = ar[i + 1];
		}
		
		n--;
		System.out.println("\nAfter Delete");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}

public class sorting {
	public static void main(String[] args) {
		int [] list = {3,1,6,7,1,2};
		System.out.println();
		bubble(list);
		
	}

	public static boolean isSorted(int [] a) {
		for (int i = 0; i<a.length-1; i++) {
			if (a[i+1] < a[i]) {
				return false;
			}
		}

		return true;
	}

	public static void print(int [] a) {
		for (int i= 0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static int [] selection(int [] a) {
		
		
			
			for (int i = 0; i<a.length; i++) {
				int min = i;
				for (int j = i+1;j<a.length; j++) {
					if(a[j] < a[min]) {
						min = j;

					}	
				}

				if(min!= i) {
					int temp = a[i];
					a[i] = a[min];
					a[min] = temp;
			 		print(a);
			 		System.out.println();
				}


				
			}
						
			if (!isSorted(a)) {
				bubble(a);
			} else	{
				return a;
			}
			return a;
	}
	

	public static int [] insertion(int[] a) {
			for (int i = 0; i<a.length; i++) {
				if(a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					print(a);
					System.out.println();
					break;
				}
			}
		if (!isSorted(a)) {
			bubble(a);
		} else	{
			return a;
		}
		return a;
		
	}

	public static int [] bubble(int[] a) {
		
			for (int i = 0; i<a.length-1; i++) {
				if(a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					print(a);
					System.out.println();
					
				}
			}
		if (!isSorted(a)) {
			bubble(a);
		} else	{
			return a;
		}
		return a;
	}
}
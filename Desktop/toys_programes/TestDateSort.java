import java.util.*;

public class TestDateSort {

	public TestDateSort() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date[] days = new Date[5];
		days[0] = new Date(2006,5,4);
		days[1] = new Date(2006,7,4);
		days[2] = new Date(2008,5,4);
		days[3] = new Date(2004,5,9);
		
		Date d = new Date(2006,7,4);
		String str = String.valueOf(d);
		
	}
	public static Date[] bubbleSort(Date[] a){
		int len = a.length;
		for(int i=0;i <= len-2;i--){
			for(int j=1;j <= len-1;j++){
				
				if(a[i].compareTo(a[j]) > 0 ) {
					Date temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			
		}
		
	}
}

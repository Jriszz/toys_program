
public class NumSort02 {
	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
				int [] a = new int[args.length];
				for(int i = 0;i<args.length;i++) {
					a[i] = Integer.parseInt(args[i]); //解析字符串中的数字
					
		}
				selectionSort(a); //设置函数进行排序
				print(a);
				
	}
		private static void selectionSort(int[] a) {
				int  k,temp;
				for(int i=0; i < a.length;i++) {
					k = i;
					for(int j = k+1;j<a.length;j++){
						if(a[j] < a[k]) {
							k = j;
						}
					}
					if(k!=i){
						
						temp = a[i];
						a[i] = a[k];
						a[k] = temp;
					}
				}
	
	}
		
		private static void print(int[] a) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i] + "");
				
		}
		System.out.println();

		}
}

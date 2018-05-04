
public class TestArrayCopy {

	public TestArrayCopy() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//第一种情况,一维数组
		String [] arr1 = {"Mircrosoft","IBM","APPLE","AMAZOM"};
		String [] rec  =  new String[6];
		System.arraycopy(arr1, 0, rec, 0, arr1.length);
		for(int i=0;i<arr1.length;i++){
			System.out.println(rec[i] +"");
		}
		//二维数组
		int [][] intArray = {{1,2},{1,2,3},{3,4,5}};
		int [][] intArrayBak = new int[4][];
		System.arraycopy(intArray,0,intArrayBak, 0, intArray.length);
		
		for (int arg1 = 0;arg1<intArray.length;arg1++){
			for(int arg2 =0;arg2 < intArrayBak[arg1].length;arg2++){
				System.out.println(intArray[arg1][arg2]+" ");
			}
		}
			
		}
	
	}


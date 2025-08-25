package basics;

public class ForEachDemo {
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,6,7,8,9,10,50,60,61};
		
		for(int i:arr) {
			if(i%2==0) {
				System.out.println(i); //2 4
			}
		}
	}

}

/*
for(datatype variablename:array/collection){
 --
 --
 ---
 ---
}

*/

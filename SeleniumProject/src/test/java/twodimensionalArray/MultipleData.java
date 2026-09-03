package twodimensionalArray;

import org.testng.annotations.Test;

public class MultipleData {
	@Test(dataProvider="data")
	
	public void searchproduct(String username,String password,int noofuser) {
		
		System.out.println(username+""+password+""+noofuser);
	}
		public Object [][] data(){
		Object [] [] arr=new Object[2][2];
		arr [0] [0]="kaushal@gmail.com";
		
		arr [1] [0]="ramesh@gmail.com";
		
        arr [2] [0]="rahim@gmail.com";
		
		arr [0] [1]="kaushal@1234";
         arr [1] [1]="ramesh@1234l";
		
		arr [2] [1]="rahim@1234";
		return arr;
		
		
		public static void main(String[] args) {
			System.out.println(arr);
		}
		
		
	}

}

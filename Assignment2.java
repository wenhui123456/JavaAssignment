package assignment;

public class Assignment2 {

	public static void main(String[] args) {
		// 1) Write code convert String to a number. For example ¡°6778¡± would be 6778 as the number 
		int num = Integer.parseInt("6778");
		System.out.println(num); 
		// 2) Write code which reverse a given DNA string into AND.
		StringBuffer sb = new StringBuffer("DNA"); 
		sb.reverse(); 
		System.out.println(sb.toString());
		
		// 3) The aim of this task is to split a given string into different strings of equal size 3.  
		String str = "123456789"; 
		int n = str.length()
		int partitions = (int)Math.ceil((Double)n/3.0);
		String[] strs = new String[patitions];
		for(int i = 0; i < partitions; i++){
			strs[i] = str.substring(i*3, Math.min(n, (i+1)*3);
		}
		System.out.println(Arrays.toString(strs));
		
		// 4) Return index of substring in the String that search starts from start or end of string. For example: ¡°goMango¡±, for substring ¡°go¡± from beginning index = 0 and from end index = n-2. 
		String token = "goMangoffgoff"; 
		String strSub = "go"; 
		int startIndext = token.indexOf(strSub); 
		int endIndext = getFromLast(token, strSub);
		System.out.println("search starts from start:" + startIndext);
		System.out.println("search starts from end:" + endIndext);
	}
	
	//function that search starts from end.
	public static int getFromLast(String token, String strSub) {
		int endIndext = -1; 
		int len = strSub.length();
		for(int i = token.length()-1; i >= 0; i--){ 		 
			boolean has = false; 
			if(i-len+1>0 && token.charAt(i) == strSub.charAt(len-1)){
				has = true;
				for(int j = len-1, k = i; j >=0; j--, k--){ 
					if(token.charAt(k) != strSub.charAt(j)) {
						has = false;
						break;
					}
				} 
				if(has) {
					endIndext = i-len+1;
					break;
				}
			}
		}
		return endIndext;
	}
}



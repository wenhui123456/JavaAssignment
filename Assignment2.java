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
		String str1, str2, str3; 
		if(str.length()%3 == 0){ 
			int len = str.length()/3; 
			str1 = str.substring(0, len); 
			str2 = str.substring(len, len*2); 
			str3 = str.substring(len*2, len*3);
			System.out.println("str1: " + str1 + " str2: " + str2 + " str3: " + str3 );
		}else{ 
			System.out.println("Cannot  split to equal size 3."); 
		} 
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



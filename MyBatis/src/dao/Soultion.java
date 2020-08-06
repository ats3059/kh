package dao;


public class Soultion {

	public static void main(String[] args) {
		
		String answer = "";
		String s = "Z J B C";
		int n = 23;
		char c = ' ';
		
			for(int i = 0 ;i<s.length();i++) {
				
				if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					if(s.charAt(i) == 'Z') {
						answer += 'A';
					}else if(s.charAt(i) == ' ') {
						answer += " ";
					}else if(s.charAt(i)+n > 90){
						c = (char)(s.charAt(i)-25+1);
						answer += c;
					}else {
						c = (char)(s.charAt(i)+1);
						answer += c;
					}
					
				
			}
			}

		System.out.println(answer);
		
	}
}


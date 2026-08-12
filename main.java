public class Main
{
	public static void main(String[] args) {
		String s="abc";
		String t="ahbgv";
		int i=0;
		for(int j=0;j<t.length();j++){
		    if(i<s.length()&&s.charAt(i)==t.charAt(j)){
		        i++;
		    }
		}
		if(i==s.length()){
		    System.out.print(true);
		}else{
		    System.out.print(false);
		}
	}
}

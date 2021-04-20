package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {
		String S="1234";
		int len=S.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+S.charAt(i);
			//System.out.println(rev);
			
		}
		System.out.println(rev);
	}

}
//
//
//
//
//String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
//String language[] = lang.split("_");
//System.out.println(language.length);
//for(String e : language) {
//	System.out.println(e);
//}

//Reverse a String and then split
//public class ReverseString {
//
//	public static void main(String[] args) {
//		String S="JAVA_PYTHON_JAVASCRIPT_RUBY";
//		
//		int len=S.length();
//		
//		String rev="";
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+S.charAt(i);
//			}
//		System.out.println(rev);
//		String S1[] = rev.split("_");
//		for(String e : S1) {
//		System.out.println(e);
//		}
//		
//}
//}

package String;

public class CharArrayToString {
	public static void toStr() {
		//CharArray to String
		char[] ch=new char[4];
		ch[0]='j';
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		String str=new String(ch);
		System.out.println(str);
		
		//String to charArray
		String word="CORE";
		System.out.println(word);
		char[] arr=word.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

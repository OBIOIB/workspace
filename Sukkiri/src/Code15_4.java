
public class Code15_4 {

	public static void main(String[] args)throws Exception {
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<100;i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);

		String str = "こんにちはJava";
		char[] data1= str.toCharArray();
		System.out.println(data1[0]);
		byte[] data2 = str.getBytes("utf-8");
		System.out.println(data2[0]);
	}

}

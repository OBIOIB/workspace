import java.io.FileWriter;

public class Code17_1 {

	public static void main(String[] args) {
		/*FileWriter fw = null;
		try {
		fw = new FileWriter("data.txt");
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
			fw.close();
			}catch(IOException e) {
				
			}
			}
		}
		*/
		try(FileWriter fw = new FileWriter("data");){
			fw.write("hello");
		}catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}

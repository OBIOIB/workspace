
public class ExceptionLesson {

	public static void main(String[] args) throws InterruptedException {
		//methodA();
		Person p = new Person();
		try {
		p.setAge(-10);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("終了");
		try {
			String ext ="mp3";
			if(!ext.equals("mp3")) {
			throw new UnsupporttedMusicFileException("未対応のファイルです");
			}
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void methodA() throws InterruptedException {
		System.out.println("Start");
		Thread.sleep(3000);
		System.out.println("End");
	}

}
class Person{
	int age;
	public void setAge(int age) {
		if(age <0) {
			throw new IllegalArgumentException("年齢は0以上の数を指定すべきです。指定値="+age);
		}
		this.age=age;
	}
}

class UnsupporttedMusicFileException extends Exception{
	public UnsupporttedMusicFileException(String msg) {
		super(msg);
	}
}
package InitializationBolck;


class Entrance{
	static int count = 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수
	int number;				// 인스턴스 고유 번호
	
	{
		
		++count;			
		number = count; 
	}
}

public class initializationEx {

	public static void main(String[] args) {
		Entrance e1 = new Entrance();
		Entrance e2 = new Entrance();
		Entrance e3 = new Entrance();
		
		System.out.println(e1.number + "번 손님 입장");
		System.out.println(e2.number + "번 손님 입장");
		System.out.println(e3.number + "번 손님 입장");
		
		System.out.println("총 입장객은 " + Entrance.count + "명 입니다.");
		
	}

}

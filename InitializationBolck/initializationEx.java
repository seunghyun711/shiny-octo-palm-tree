package InitializationBolck;


class Entrance{
	static int count = 0;	// ������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int number;				// �ν��Ͻ� ���� ��ȣ
	
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
		
		System.out.println(e1.number + "�� �մ� ����");
		System.out.println(e2.number + "�� �մ� ����");
		System.out.println(e3.number + "�� �մ� ����");
		
		System.out.println("�� ���尴�� " + Entrance.count + "�� �Դϴ�.");
		
	}

}

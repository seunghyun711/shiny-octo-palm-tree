package InitializationBolck;

public class BlockEx {
	
	// Ŭ���� �ʱ�ȭ ��
	static {
		System.out.println("static initialization block");
	}
	
	
	// �ν��Ͻ� �ʱ�ȭ ��
	{
		System.out.println("instance initialization block");
	}
	
	public BlockEx() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		System.out.println("BlockEx be = new BlockEx();");
		BlockEx be = new BlockEx();
		
		System.out.println("BlockEx be2 = new BlockEx()");
		BlockEx be2 = new BlockEx();

	}

}

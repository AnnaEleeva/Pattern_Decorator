
public class Main {

	public static void main(String[] args) {
		Client cl1=new Client();
		
		IMessage mes=new Message("anya","yana","Hello");
		mes=new EncryptionDecorator(mes);
		mes=new SecretionDecorator(mes);
		cl1.sentMessage(mes);

	}

}

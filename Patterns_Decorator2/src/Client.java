
public class Client {
	private IMessage mes;

	IMessage getMessage() {
		return mes;
	}

	void sentMessage(IMessage mes) {
		System.out.println("Message"+"\nAuthor "+mes.getAuthor()+"\nAdressed "+mes.getAdressed()+"\nText "+mes.getText());
	};

}

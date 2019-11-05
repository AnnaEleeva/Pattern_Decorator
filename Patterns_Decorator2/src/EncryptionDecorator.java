
public class EncryptionDecorator extends MessageDecoratorBase{

	EncryptionDecorator(IMessage mes ){
		super(mes);
		mes.setText(Encrypte(mes.getText()));
	}
	private String Encrypte(String str){
		return "*encrypted* "+str+" *encrypted*";
	}
}

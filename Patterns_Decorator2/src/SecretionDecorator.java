
public class SecretionDecorator extends MessageDecoratorBase{
	SecretionDecorator(IMessage mes){
		super(mes);
		mes.setAuthor(Secretion(mes.getAuthor()));
		mes.setAdressed(Secretion(mes.getAdressed()));
	}
	
	private String Secretion(String str) {
		String newStr="";
		for(int i=0;i<str.length();i++) {
			newStr=newStr+(int)str.charAt(i);
		}
		return newStr;
	}
}

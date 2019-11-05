
public class MessageDecoratorBase implements IMessage{
	private IMessage Decoratee;

	public MessageDecoratorBase(IMessage mes) {
		Decoratee=mes;
	}

	@Override
	public String getAuthor() {
		return Decoratee.getAuthor();
	}

	@Override
	public void setAuthor(String str) {
		Decoratee.setAuthor(str);	
	}

	@Override
	public String getAdressed() {
		return Decoratee.getAdressed();
	}

	@Override
	public void setAdressed(String str) {
		Decoratee.setAdressed(str);
	}

	@Override
	public String getText() {
		return Decoratee.getText();
	}

	@Override
	public void setText(String str) {
		Decoratee.setText(str);
	}

}

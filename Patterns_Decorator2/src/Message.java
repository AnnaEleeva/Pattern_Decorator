
public class Message implements IMessage {
	String author;
	String adressed;
	String text;
	Message(String author, String adressed,String text){
		this.text=text;
		this.author=author;
		this.adressed=adressed;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String str) {
		author=str;
	}
	
	public String getAdressed() {
		return adressed;
	}
	
	public void setAdressed(String str) {
		adressed=str;
		
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String str) {
		text=str;
	}

}

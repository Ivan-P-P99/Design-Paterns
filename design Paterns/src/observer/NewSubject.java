package observer;

public class NewSubject implements Observer {

	private String name;
	private Observable subjectt;
	
	
	public NewSubject(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.subjectt == null) {
			
			System.out.println(this.getName()+ " Has no title");
			return; 
		}
		String latestTitle = this.subjectt.getUpdate();
		System.out.println(this.getName()+ " New update: " + latestTitle);
	}

	@Override
	public void setTitle(Observable title) {
		this.subjectt = title;

	}

	public String getName() {
		return name;
	}
	
}
package observer;

import java.util.ArrayList;
import java.util.List;

public class subject implements Observable {
	
	private List<Observer> observers;
	private String subjectt;
	
	public subject() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void CreateObserver(Observer observer) {
		this.observers.add(observer);
		observer.setTitle(this);

	}

	@Override
	public void DeleteObserver(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void UpdateObservers() {
		for(Observer observer: this.observers) {
			observer.update();

		}
	}

	@Override
	public String getUpdate() {
		return this.subjectt;
	}
	
	public void setSubject(String Subject) {
		this.subjectt = Subject;
		this.UpdateObservers();
		}
		
}

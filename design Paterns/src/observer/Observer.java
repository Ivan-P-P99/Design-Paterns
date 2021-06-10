package observer;

import observer.Observable;

public interface Observer {

	void update();
	void setTitle(Observable title);
	
}
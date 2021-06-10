package observer;


public class SubjectMain  {

	public static void main(String[] args) {
		
		
		subject subject = new subject();
		Observer obs1 = new NewSubject("sub1");
		Observer obs2 = new NewSubject("sub2");
		Observer obs3 = new NewSubject("sub3"); 
		
		subject.CreateObserver(obs1);
		subject.CreateObserver(obs2);
		subject.CreateObserver(obs3);
		
		subject.setSubject("Хитове до скъсване!");

	}

}

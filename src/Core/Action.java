package Core;

import Gear.Animal;

public class Action {
	private Animal subject;
	
	public Action(Animal a) {
		this.subject=a;
	}
	
	public Animal getSubject() {
		return this.subject;
	}
	
	public void run() {
		//todo
	}
	
	public void setSubject(Animal a) {
		this.subject=a;
	}
}

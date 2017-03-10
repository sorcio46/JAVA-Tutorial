package Utils;

public class Position {
	private int x;
	private int y;
	
	public Position(int a, int b) {
		this.x=a;
		this.y=b;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int a){
		this.x=a;
	}
	
	public void setY(int a) {
		this.y=a;
	}
	
	public void sum(Position p) {
		this.x=this.x+p.getX();
		this.y=this.y+p.getY();
	}
	
	public String toString() {
		String des=this.x+" orizzontale "+this.y+" verticale";
		return des;
	}
}

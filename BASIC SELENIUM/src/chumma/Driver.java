package chumma;

public class Driver {
	Parent p;

	public static void main(String[] args) {
		Parent p = new Parent();
		p.demo();
		p = new Child();
		Child c = (Child) p;
		c.demo();
	}

}

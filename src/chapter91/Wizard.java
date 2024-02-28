package chapter91;

//import chapter9.Hero;

public class Wizard {

	String name;
	int hp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}

}

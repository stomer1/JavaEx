package com.javaex.oop.summary;

public class SummaryApp {
	static KungFuSkill dojang[];
	
	public static void main(String[] args) {
		Human h1 = new Human("고길동", 50);
		Human h2 = new TheOne("레오", 48);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungFuPanda("포", 15);

		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		// kungfu 할 수 있는 객체를 dojang
		dojang = new KungFuSkill[] {
//				(KungFuSkill)h1, // ->KungFuSkill 구현 X
				(KungFuSkill)h2,
//				(KungFuSkill)p1,
				(KungFuSkill)p2
		};
		for (KungFuSkill actor:dojang) {
			actor.kungFu();
		}
	}
	
	private static void fight(Animal actor) {
		if (actor instanceof KungFuSkill) {
			((KungFuSkill)actor).kungFu();
		}else {
			System.out.println(actor.name + ": 쿵후 못해요!");
		}
	}
	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable)actor).fly();
			
		}else {
			System.out.println(actor.name + ": 하늘 못날아요");
		}
	}

}

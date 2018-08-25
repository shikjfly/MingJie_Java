package com;

import cominterface.IMonst;

public class SnakeHuge extends Snake implements IMonst {
	public boolean hasAntler; //有脚
	public boolean hasLegs; //有腿
	//攻击技能
	@Override
	public void attack() {
		System.out.println("我在飞踢");
	}
	public void doI() {
		super.attack();
	}
}

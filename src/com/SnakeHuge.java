package com;

import cominterface.IMonst;

public class SnakeHuge extends Snake implements IMonst {
	public boolean hasAntler; //�н�
	public boolean hasLegs; //����
	//��������
	@Override
	public void attack() {
		System.out.println("���ڷ���");
	}
	public void doI() {
		super.attack();
	}
}

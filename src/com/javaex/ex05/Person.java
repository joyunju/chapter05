package com.javaex.ex05;

public class Person {

	// 필드
	private String name;
	private String hp;
	private String company;

	// 생성자
	public Person() {
		super();
		// 부모를 만들지 않았기때문에 기본 부모 설정인 Object class를 기본 디폴트 값으로 부모로 설정되어 있음
	}

	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드 - gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// 메소드 - 일반

	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
}

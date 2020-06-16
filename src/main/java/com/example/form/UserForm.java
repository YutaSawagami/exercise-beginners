package com.example.form;
import javax.validation.constraints.NotBlank;

public class UserForm {
	@NotBlank(message="名前は必須です。" )
	private String name;
	
	@NotBlank(message="年齢は必須です。" )
	private int age;
	
	@NotBlank(message="コメントは必須です。" )
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

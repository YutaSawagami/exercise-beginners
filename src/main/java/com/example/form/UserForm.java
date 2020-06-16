package com.example.form;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserForm {
	@NotBlank(message="名前は必須です。" )
	private String name;
	
	@Pattern(regexp = "^[0-9]*$")
	@NotBlank(message="年齢は必須です。" )
	private String age;
	
	@NotBlank(message="コメントは必須です。" )
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

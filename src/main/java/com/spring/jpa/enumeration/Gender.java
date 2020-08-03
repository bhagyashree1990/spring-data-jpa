package com.spring.jpa.enumeration;

import java.util.stream.Stream;

public enum Gender {
	MALE('m'),FEMALE('f'),OTHER('o');
	
	private Character code;
	
	private Gender(Character code) {
		this.code = code;
	}
	
	public Character getCode() {
		return code;
	}
	
	public static Gender fromCode(Character code) {
		return Stream.of(Gender.values())
				.filter(gender->gender.code.equals(code))
				.findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}

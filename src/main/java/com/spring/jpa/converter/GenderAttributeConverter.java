package com.spring.jpa.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.spring.jpa.enumeration.Gender;
@Converter(autoApply = true)
public class GenderAttributeConverter implements AttributeConverter<Gender, Character>{

	@Override
	public Character convertToDatabaseColumn(Gender gender) {
		return gender.getCode();
	}

	@Override
	public Gender convertToEntityAttribute(Character code) {
		return Gender.fromCode(code);
	}

}

package com.wolf.mongodbit.converter;

import org.bson.types.Decimal128;
import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

/**
 * 自定义的类型转换器Decimal128ToBigDecimal
 */

public class Decimal128ToBigDecimalConverter implements Converter<Decimal128, BigDecimal> {

	public BigDecimal convert(Decimal128 decimal128) {
		return decimal128.bigDecimalValue();
	}
	
	

}

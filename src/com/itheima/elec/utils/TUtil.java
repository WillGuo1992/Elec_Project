package com.itheima.elec.utils;

import java.lang.reflect.ParameterizedType;

public class TUtil {

	public static Class getActualType(Class class1) {
		ParameterizedType parameterizedType = (ParameterizedType) class1.getGenericSuperclass();
		Class class2 = (Class) parameterizedType.getActualTypeArguments()[0];
		return class2;
	}

}

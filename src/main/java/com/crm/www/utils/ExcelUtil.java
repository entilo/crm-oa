package com.crm.www.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcelUtil<T> {
	// 表名
	private String excelName;
	// 表创建时间
	private Date excelCreateDate;
	// 表格描述
	private String excelDescribe;

	/**
	 * 普通对象的屬性转化为Excel表中的列明
	 */
	public List<String> getExcelFields(T t) {
		Class cla = t.getClass();
		List<String> strlist = new ArrayList<>();
		Field[] fields = cla.getDeclaredFields();
		String reg = cla.getName().toString() + ".";
		for (int i = 0; i < fields.length; i++) {
			strlist.add((fields[i].toString().split(reg))[1].toString());
		}
		System.out.println(strlist);
		return strlist;
	}

	/**
	 * 
	 */
	public static void setExcel() {

	}

}

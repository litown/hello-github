package com.baidu.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
/**
 * 集合相关
 */
public class Test3 {
	/**
	 * 集合中迭代器的使用
	 * 默认游标在第一个元素之前的位置
	 * 调用hasNext()如果游标后一个位置有元素,就返回true.
	 * 调用next()就返回游标后一个位置的元素,并且游标向右移动一位(相当于第一个元素的位置)
	 */
	@Test
	public void testName() throws Exception {
		List list = new ArrayList();
		list.add("11");
		list.add("22");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
		}
	}
	/**
	 * Double使用intValue()返回int类型的值
	 * 精度怎么算?
	 * Double对象调用intValue方法,直接返回整数部分,没有四舍五入.
	 * 如果float,double想要四舍五入, 可以使用Math类中的round方法
	 */
	@Test   
	public void test3() throws Exception {
		Double d = new Double(2.32);
		int intValue = d.intValue();
		System.out.println(intValue); //2
	}
	/**
	 * Map中的entrySet()
	 * 
	 */
	@Test
	public void test_map_entry() throws Exception {
		Map map = new HashMap();
		map.put("1", "小白");
		map.put("2", "小黑");
		map.put("3", "小明");
		Set<Entry<String,String>> entrySet = map.entrySet();  //entrySet就是一个Set集合,集合内的元素类型是Entry
		System.out.println(entrySet);
		/*
		 * entrySet就是一个set集合,取值方式:1.使用迭代器  2.使用for循环
		*/
		
	}
	/**
	 * Set集合只有两种取值方式
	 * 1.使用迭代器
	 * 2.使用for循环迭代.
	 * 
	 * Set中没有像list一样不能取出某一个特定的值.
	 */
	@Test
	public void test_set() throws Exception {
		Set set = new HashSet();
		set.add("hello");
		set.add(11);
		//方式一:使用迭代器
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object next = it.next();
			System.out.println(next);
		}
		//方式二:使用for循环迭代
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

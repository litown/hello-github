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
 * �������
 */
public class Test3 {
	/**
	 * �����е�������ʹ��
	 * Ĭ���α��ڵ�һ��Ԫ��֮ǰ��λ��
	 * ����hasNext()����α��һ��λ����Ԫ��,�ͷ���true.
	 * ����next()�ͷ����α��һ��λ�õ�Ԫ��,�����α������ƶ�һλ(�൱�ڵ�һ��Ԫ�ص�λ��)
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
	 * Doubleʹ��intValue()����int���͵�ֵ
	 * ������ô��?
	 * Double�������intValue����,ֱ�ӷ�����������,û����������.
	 * ���float,double��Ҫ��������, ����ʹ��Math���е�round����
	 */
	@Test   
	public void test3() throws Exception {
		Double d = new Double(2.32);
		int intValue = d.intValue();
		System.out.println(intValue); //2
	}
	/**
	 * Map�е�entrySet()
	 * 
	 */
	@Test
	public void test_map_entry() throws Exception {
		Map map = new HashMap();
		map.put("1", "С��");
		map.put("2", "С��");
		map.put("3", "С��");
		Set<Entry<String,String>> entrySet = map.entrySet();  //entrySet����һ��Set����,�����ڵ�Ԫ��������Entry
		System.out.println(entrySet);
		/*
		 * entrySet����һ��set����,ȡֵ��ʽ:1.ʹ�õ�����  2.ʹ��forѭ��
		*/
		
	}
	/**
	 * Set����ֻ������ȡֵ��ʽ
	 * 1.ʹ�õ�����
	 * 2.ʹ��forѭ������.
	 * 
	 * Set��û����listһ������ȡ��ĳһ���ض���ֵ.
	 */
	@Test
	public void test_set() throws Exception {
		Set set = new HashSet();
		set.add("hello");
		set.add(11);
		//��ʽһ:ʹ�õ�����
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object next = it.next();
			System.out.println(next);
		}
		//��ʽ��:ʹ��forѭ������
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

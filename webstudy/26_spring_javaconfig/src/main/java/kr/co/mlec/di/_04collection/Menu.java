package kr.co.mlec.di._04collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Menu {
	private Properties sandProp;
	public void setSandProp(Properties sandProp) {
		System.out.println("setSandProp");
		this.sandProp = sandProp;
	}
	public void printProp() {
		Set<Object> keys = sandProp.keySet();
		for (Object key : keys) {
			String sand = (String)sandProp.get(key);
			System.out.println(sand);
		}
		/*
		String ham = sandProp.getProperty("ham");
		System.out.println(ham);
		*/
	}
	
	private Map<String, ISand> sandMap;
	public void setSandMap(Map<String, ISand> sandMap) {
		System.out.println("setSandMap");
		this.sandMap = sandMap;
	}
	public void printMap() {
		Set<String> keys = sandMap.keySet();
		for (String key : keys) {
			ISand sand = sandMap.get(key);
			sand.info();
		}
	}

	private Set<ISand> sandSet;
	public void setSandSet(Set<ISand> sandSet) {
		System.out.println("setSandSet");
		this.sandSet = sandSet;
	}
	public void printSet() {
		for (ISand sand : sandSet) {
			sand.info();
		}
	}
	
	
	private List<ISand> sandList;
	public void setSandList(List<ISand> sandList) {
		System.out.println("setSandList");
		this.sandList = sandList;
	}
	public void printList() {
		for (ISand sand : sandList) {
			sand.info();
		}
	}
}











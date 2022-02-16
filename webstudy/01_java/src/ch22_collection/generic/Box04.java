package ch22_collection.generic;
                //여러개의 타입을 줄 수 있다. key, value
public class Box04<K, V> {
	private K key;
	private V value;
	
	public Box04(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	

}

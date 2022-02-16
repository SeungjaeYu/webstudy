/**
     설명
     - 제주지역과 가장 가까운 순으로 출력하는 프로그램을 작성한다.
     - 위치정보를 처리하기 위해서 위도와 경도를 활용한다.
     - 특정 위치와의 거리를 측정하기 위해서 피타코라스의 정리를 활용
       (두점사이의 거리를 구한다.)
     - 정보를 표현하는 클래스 작성 : LocationVO  
     - LocationVO("제주", 33.403931, 126.617432)
       : 제주 - 지역명
       : 33.403931 - 위도
       : 126.617432 - 경도  
                                                                                                                                                                                                                                                        
     출력결과 > 
    
     제주와 가까운 지역
	 1 : 안양
	 2 : 인천
	 3 : 춘천
 */
package ch22_collection03.sort.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class LocationVO{
	private String name;
	private double latitude; //위도
	private double longitude; //경도
	private double distance;
	
	
	protected double getDistance() {
		return distance;
	}


	protected void setDistance(double distance) {
		this.distance = distance;
	}


	LocationVO(String name, double latitude,double longitude ) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;

	}
	
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getLatitude() {
		return latitude;
	}
	protected void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	protected double getLongitude() {
		return longitude;
	}
	protected void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public String toString() {
		return name;
	}

}

public class Quiz03 {	
	public static void main(String[] args) {
		try {
		new Quiz03().service();
		}
		catch (Exception e){
			
		}
	}
	
	private List<LocationVO> list = new ArrayList<>();
	private void service() throws Exception {
		System.out.println("제주와 가까운 지역");
		fileLoading();
		
	}
		
	void fileLoading() throws FileNotFoundException { 
		File f = new File("data\\ch22\\sort\\exam\\quiz03.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] arr = line.split(":");
			list.add(new LocationVO(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
			
		}
		
		for(int i =0 ; i < list.size(); i++) {
			double s = Math.pow(list.get(0).getLatitude()-list.get(i).getLatitude(),2.0)
					+ Math.pow(list.get(0).getLongitude() - list.get(i).getLongitude(), 2.0);
			list.get(i).setDistance(s);
		}
		Collections.sort(list, new Comparator<LocationVO>(){

			@Override
			public int compare(LocationVO o1, LocationVO o2) {
				return (int) (o1.getDistance()-o2.getDistance());
			}
			
		});
		
		list.remove(0);
		int num = 1;
		for(LocationVO vo : list) {
			System.out.println(num++ +"." + vo);
		}
		
		
	}
		
		
		
		
		
		
	

}

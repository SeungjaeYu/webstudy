package ch08_method.exam;

public class TV {
	
	/**
	 * 기능목록
	 * 티비 켜기
	 * 채널
	 * 채널변경
	 * 볼륨
	 * 볼륨변경
	 * 음소거
	 * 시청종료
	 * 
	 */
	
	int volume = 20;
	int channel = 7;
	boolean power = false;
	
	
	//채널증가
	void channelUp() {
		channel++;
	}
	
	/**채널 증가*/
	void setChannel(int cha) { 
		channel = cha;}
	
	/**시청종료*/
	void powerOff() {
		power = false;
		System.out.println("티비전원을 끕니다");
	}
	void mute() {
		volume = 0;
	}
	
	
	/**볼륨 변경*/
	void volumeUp() {
		volume++;
	}
	
	

	
	/**티비 온 = 현재의 티비볼륨 채널*/
	void powerOn() {
		power =true;
		System.out.println("티비 전원을 켭니다");
	}
	
	
	/**현재의 볼륨*/
	int getVolume() {
		return volume;
	}
	
	/**현재의 채널*/
	int getChannel() {
		return channel;
		
	}
	
	}
	



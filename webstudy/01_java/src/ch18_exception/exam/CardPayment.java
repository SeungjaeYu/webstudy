package ch18_exception.exam;

public class CardPayment extends Payment {
	private String cardNumber;
	private String cardPassword;
	private int monthlyinstallyment;
//	String shop;
//	String product;
//	int price; 
	

	
	CardPayment(){}
	CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyinstallyment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyinstallyment = monthlyinstallyment;

	}
	
	
	
	public String toString() {
		return "신용카드가 정상적으로 지불되었습니다." +
		        "\n [ 신용카드 결제 정보 ]" +
				"\n 상점명 : " + this.shopName + 
				"\n 상품명 : " + this.productName +
				"\n 상품가격 : " + this.productPrice +
				"\n 신용카드번호 : " + this.cardNumber+
				"\n 할부개월 : " + this.monthlyinstallyment;
	}
	@Override
	public void pay() throws PayException {
		// TODO Auto-generated method stub
		if(productPrice<0 || monthlyinstallyment < 0) {
		String msg2 = "가격이나 할부개월수가 잘못되었습니다";
		throw new PayException(msg2);
		}
	}
	
	
	

}

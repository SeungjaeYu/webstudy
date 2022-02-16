package ch18_exception.exam;

public class CashPayment extends Payment {
	private String cashReceiptNumber;

	CashPayment(){
		
	}
	CashPayment(String shopName,String productName, long productPrice, String cashReceiptNumber){
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	@Override
	public void pay() throws PayException {
		// TODO Auto-generated method stub
		if(productPrice<0) {
		String msg = "가격이 잘못되었습니다";
		throw new PayException(msg); 
		}
	}
	
	
	public String toString(){
		
		return "현금이 정상적으로 지불되었습니다." +
		        "\n [ 현금 결제 정보 ]" +
				"\n 상점명 : " + this.shopName + 
				"\n 상품명 : " + this.productName +
				"\n 상품가격 : " + this.productPrice + 
				"\n 현금영수증번호 : " + this.cashReceiptNumber;
	}

}

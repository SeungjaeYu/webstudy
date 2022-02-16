package kr.co.mlec.aop._03basic;


// Controller controller = new ProxyController(new BoardController());
// controller.service();
public class ProxyController implements Controller {
	Controller controller;
	
	public ProxyController(Controller controller) {
		this.controller = controller;
	}
	
	@Override
	public void service() {
		try {
			controller.service();
		} catch (Exception e) {
			System.out.println("-----------------------------");
			System.out.println("실행 중 예외 발생함");
			e.printStackTrace();
			System.out.println("-----------------------------");
		}
	}
}

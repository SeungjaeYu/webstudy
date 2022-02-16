package ch19_inner_final;
/*
class R {
	static Layout layout;
	static Drawable drawable;
	static Strings strings;
}
class Layout {
	public static final int main_layout = 0x00001;
	public static final int sub_layout = 0x00002;
}

class Drawable {
	public static final String img1 = "a.png";
	public static final String img2 = "b.png";
	
}

class Strings {
	public static final String hello = "안녕하세요";
	public static final String title = "내부 클래스 테스트 중..";
	
}
*/





class R {
//	static Layout layout;
	static class Layout {
		public static final int main_layout = 0x00001;
		public static final int sub_layout = 0x00002;
	}

//	static Drawable drawable;
	static class Drawable {
		public static final String img1 = "a.png";
		public static final String img2 = "b.png";
	}

//	static Strings strings;
		static class Strings {
			public static final String hello = "안녕하세요";
			public static final String title = "내부 클래스 테스트 중..";

	}

}

public class Test04 {
	public static void main(String[] args) {
		System.out.println(R.Drawable.img1);
		System.out.println(R.Strings.title);
		System.out.println(R.Layout.main_layout);
	}

}


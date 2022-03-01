package org.cap.labPrograms.interfac;


public class multiple_ineri implements demo,demo1 {

	@Override
	public void display1() {
		System.out.println("method from demo1");
	}

	@Override
	public void display2() {
		System.out.println("method from demo1");
	}

	@Override
	public void test() {
		System.out.println("method from demo");
		
	}
	public void show() {
		System.out.println("subclass specifed method");
	}

	@Override
	public void display() {
		System.out.println("method from demo");
		
	}
	public static void main(String[] args) {
	demo h=new multiple_ineri();
	h.display();
    h.test();
    
    
     multiple_ineri ref=  new  multiple_ineri();
     ref.show();
     ref.default_method("bhod");
     
    demo1 h2=new multiple_ineri();
    h2.display1();
    h2.display2();
h2.default_method("san");
demo1.showName("bhadri");
}
}
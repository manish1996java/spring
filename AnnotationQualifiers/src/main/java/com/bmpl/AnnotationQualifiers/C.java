package com.bmpl.AnnotationQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class C implements Z {

/*remove comment and Run*/
//	@Autowired
//	@Qualifier("b")
	@Qualifier("d")
	private Y y;
	
	public C() {
		System.out.println("C constructor");
	}
	
/*remove comment and Run*/
//	@Autowired
//	public C(@Qualifier("b")Y y) {      /*you can add @Qualifier in constructor argument*/
//		this.y = y;
//	}
	
/*remove comment and Run*/	
//	@Autowired
//	public void setY(@Qualifier("d")Y y) {    /*you can add @Qualifier in constructor argunment*/
//		this.y = y;
//	}
	
	public String show() {
		
		return "C show method";
	}

	public String print() {
		
		return y.print();
	}

}

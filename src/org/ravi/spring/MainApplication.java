package org.ravi.spring;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

//@SuppressWarnings("deprecation")
public class MainApplication {

	public static void main(String[] args) {
		//Triangle t = new Triangle();
		//t.draw();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle t = (Triangle) factory.getBean("triangle");
		//t.draw();
		
		/*The ApplicationContext container includes all functionality of the BeanFactory container, 
		so it is generally recommended over the BeanFactory. 
		BeanFactory can still be used for light weight applications like mobile devices or applet based applications where data volume and speed is significant.
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle) context.getBean("triangle");
		t.draw();
		t.setType("Isoceles");
		t.draw();
		Triangle t1 = (Triangle) context.getBean("triangle");
		t1.draw();
		
		Circle c = (Circle) context.getBean("circle");
		c.draw();
		c.setColor("red");
		c.draw();
		Circle c1 = (Circle) context.getBean("circle");
		c1.draw();
	}

}

package spring2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		//Employee emp=(Employee)context.getBean("emp");
		//System.out.println(emp.toString());
		
		Employee emp1=(Employee)context.getBean("object1");
		System.out.println(emp1.toString());	

}
	
}

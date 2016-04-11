import java.lang.reflect.Method;


public class JavaReflectionTraining {
	public static void main(String[] args) {
		System.out.println("Java Reflection Training.");
		
		Method [] methods = MyClass.class.getMethods();
		for (Method method : methods) {
			System.out.println("Method: " + method.getName());
		}
	}
}

class MyClass {
	public void funcA() {
		System.out.println("I am funcA.");
	}
	public void funcB() {
		System.out.println("I am funcB.");
	}
	void funcC() {
		System.out.println("I am funcC.");
	}
}

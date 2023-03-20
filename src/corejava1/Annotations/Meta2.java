package corejava1.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Meta2 {
	
	@MyAnnotation(val = 10)
	@What(Desc = "trying to load custo annotation properties")
	public static void anno2(String str,int val) {
		Meta2 me2=new Meta2();
		Class<? extends Meta2> class1=me2.getClass();
		try {
			Method method=class1.getMethod("anno2", String.class,int.class);
			Annotation[] annotation=method.getAnnotations();
			for(Annotation ann:annotation) {
				System.out.println(ann)
				;
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		anno2("custom annotation",25);
//		Scanner sc=new Scanner(System.in)
	}
}

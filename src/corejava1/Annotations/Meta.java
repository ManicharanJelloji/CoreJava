package corejava1.Annotations;

import java.lang.reflect.Method;

public class Meta {
	

	@MyAnnotation(str = "Annotation Example", val = 10)
	public static void Anno() {
		Meta me=new Meta();
		
		try {
			Method class1=me.getClass().getMethod("Anno");
//			Class<? extends Meta> class1=me.getClass();
//			Method method=class1.getMethod("anno",null);
			MyAnnotation annotation=class1.getAnnotation(MyAnnotation.class);
			System.out.println(annotation.str()+" "+ annotation.val());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Anno();
	}
}

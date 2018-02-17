package annotations;

import java.lang.annotation.Annotation;

import annotations.Identity;

public class People {
	
		@Identity(first="abc", last="efg")
		public String getPerson(){
			
			return "";
		}
		
		public static void main(String[] args){
			
			
			People p = new People();
			
			Annotation[] a = p.getClass().getAnnotations();
			if (a != null){
				for(Annotation annotation: a){
					
				}
			}
			
		}
	
}

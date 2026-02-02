package com.ibm.annotations;

import java.lang.reflect.Constructor;

public class Application
{
	public static void main( String[] args )
	{
	
		System.out.println("Annotation Information");
		Class<CustomAnnotationUsage> clazz = CustomAnnotationUsage.class;
		CustomAnnotation classAnn = clazz.getAnnotation(CustomAnnotation.class);
		if(classAnn !=null)
		{
			printAnnotation("Class",classAnn);
		}
		
		try
		{
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			CustomAnnotation constrAnn = constructor.getAnnotation(CustomAnnotation.class);
			if(constrAnn !=null)
			{
				printAnnotation("Constructor",constrAnn);
			}
		}catch(NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch(SecurityException e)
		{
			e.printStackTrace();
		}
	}

	private static void printAnnotation(String element, CustomAnnotation ann) {
		System.out.println("Element "+element);
		System.out.println("Name: "+ann.name());
		System.out.println("Duration "+ann.duration());
		System.out.println("Version "+java.util.Arrays.toString(ann.version()));
		System.out.println();
		
	}
}
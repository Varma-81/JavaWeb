package com.ibm.internationalization;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class Application
{
	public static void main( String[] args )
	{
		
		Locale defaultLocale = new Locale("es");
		System.out.println(defaultLocale);
		System.out.println("Default Locale");
		System.out.println("Language: "+defaultLocale.getLanguage());
		System.out.println("Country: "+defaultLocale.getCountry());
		System.out.println("DisplayName: "+defaultLocale.getDisplayName());
		System.out.println("Variant: "+defaultLocale.getVariant());
		
		
		ResourceBundle resourceBundle=ResourceBundle.getBundle("Messages",defaultLocale);
		System.out.println(resourceBundle);
		printMessages(resourceBundle);
		
//		double d = 123456.789;
//		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
//		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
//		NumberFormat nf2 = NumberFormat.getInstance(Locale.CHINA);
//		
//		System.out.println("ITALY representation of "+d+" : "+nf.format(d));
//		System.out.println("USA representation of "+d+" : "+nf1.format(d));
//		System.out.println("CHINA representation of "+d+" : "+nf2.format(d));
				
		
	}
	
	public static void printMessages(ResourceBundle bundle)
	{
		System.out.println("Greeting: "+bundle.getString("greeting"));
		System.out.println("Question: "+bundle.getString("question"));
		System.out.println("Farwell: "+bundle.getString("farewell"));
	}
}
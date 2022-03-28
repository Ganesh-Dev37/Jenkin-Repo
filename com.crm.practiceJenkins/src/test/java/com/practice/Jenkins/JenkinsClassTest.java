package com.practice.Jenkins;

import org.testng.annotations.Test;

public class JenkinsClassTest {
	@Test
	public void jenkin()
	{
		System.out.println("Jenkins Class Created");
		
		System.out.println("Jenkins class added");
		
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}

}

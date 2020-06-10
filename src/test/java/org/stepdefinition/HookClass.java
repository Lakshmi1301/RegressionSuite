package org.stepdefinition;

import java.io.IOException;

import org.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	@Before
	public void beforeExe()  
	{
		System.out.println("welcome");
		
	}

     @After
     public void afterExe() throws IOException 
    {
	System.out.println("end");	
    }
     
}

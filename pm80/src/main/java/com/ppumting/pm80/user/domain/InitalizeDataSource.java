package com.ppumting.pm80.user.domain;

import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitalizeDataSource implements ServletContextListener {
	private static final String JDBC_FILE_PATH = "/WEB-INF/classes/jdbc.properties";
		
    public void contextInitialized(ServletContextEvent event)  { 
    	ServletContext context = event.getServletContext();
    	InputStream is = null;
    	try {
			is = context.getResourceAsStream(JDBC_FILE_PATH);
			Properties prop = new Properties();
			prop.load(is);
			
			String Driver = prop.getProperty("driver");
			String Url = prop.getProperty("url");
			String Name = prop.getProperty("username");
			String password = prop.getProperty("password");
		} catch (Exception e) {
			
		}
    }

	public void contextDestroyed(ServletContextEvent event) {
		
	}
	
}

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
			
			String jdbcDriver = prop.getProperty("jdbc.driver");
			String jdbcUrl = prop.getProperty("jdbc.url");
			String userName = prop.getProperty("jdbc.username");
			String password = prop.getProperty("jdbc.password");
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

	public void contextDestroyed(ServletContextEvent event) {
		
	}
	
}

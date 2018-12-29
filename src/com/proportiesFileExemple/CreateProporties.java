package com.proportiesFileExemple;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateProporties {
	
	private String url;
	private String user;
	private String password;

	public void create() {
		Properties prop = new Properties();
		OutputStream output = null;
		
		try {

			output = new FileOutputStream("config.properties");
//			output = new FileOutputStream("C:\\Users\\Mychel\\Desktop\\config.properties");

			// set the properties value
			prop.setProperty("database", url);
			prop.setProperty("dbuser", user);
			prop.setProperty("dbpassword", password);

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public CreateProporties setUrl(String url) {
		this.url = url;
		return this;
	}

	public CreateProporties setUser(String user) {
		this.user = user;
		return this;
	}

	public CreateProporties setPassword(String password) {
		this.password = password;
		return this;
	}
}

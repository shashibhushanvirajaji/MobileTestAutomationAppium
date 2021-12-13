package com.home.constants;

import lombok.Getter;

@Getter
public class FrameworkConstants {

	private FrameworkConstants() {}
	
	private static final String resources = System.getProperty("user.dir")+"/src/test/resources";
	private static final String configFilePath = resources+"/config/config.properties";
	
	public static String getConfigfilepath() {
		return configFilePath;
	}



}

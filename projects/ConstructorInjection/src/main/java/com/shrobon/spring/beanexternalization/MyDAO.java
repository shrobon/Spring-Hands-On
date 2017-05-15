package com.shrobon.spring.beanexternalization;

public class MyDAO {
	private String dbServer;
	
	//Here the constructor injection will be performed
	public MyDAO(String dbServer){
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}
	
}

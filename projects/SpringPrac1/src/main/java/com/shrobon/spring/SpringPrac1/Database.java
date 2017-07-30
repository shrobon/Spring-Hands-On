package com.shrobon.spring.SpringPrac1;

public class Database {
	private String dbUser;
	private String dbServer;
	private String dbPort;
	private String dbPassword;

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	@Override
	public String toString() {
		return "Database [dbUser=" + dbUser + ", dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbPassword="
				+ dbPassword + "]";
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

	public String getDbPort() {
		return dbPort;
	}

	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
}

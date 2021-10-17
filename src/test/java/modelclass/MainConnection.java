package modelclass;

import java.util.List;


public class MainConnection {

	private List<SubConn> connection = null;
	private String hostnm;
	private Integer time;

	public List<SubConn> getConnection() {
	return connection;
	}

	public void setConnection(List<SubConn> connection) {
	this.connection = connection;
	}

	public String getHostnm() {
	return hostnm;
	}

	public void setHostnm(String hostnm) {
	this.hostnm = hostnm;
	}

	public Integer getTime() {
	return time;
	}

	public void setTime(Integer time) {
	this.time = time;
	}

}

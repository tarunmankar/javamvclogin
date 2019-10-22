package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model {
   String name;
   String usn;
   String pwd;
   String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="SYSTEM";
	String password="system";
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
   
   public String getName() {
	return name;
    }
   
   public void setName(String name) {
	this.name = name;
    }

   public String getUsn() {
	return usn;
    }

    public void setUsn(String usn) {
	this.usn = usn;
    }

    public String getPwd() {
	return pwd;
    }

    public void setPwd(String pwd) {
	this.pwd = pwd;
    }

    public Model() throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);
}
    boolean register() throws Exception{
	String s="INSERT INTO student1 VALUES(?,?,?)";
	pstmt=con.prepareStatement(s);
	pstmt.setString(1,name);
	pstmt.setString(2,usn);
	pstmt.setString(3,pwd);
	int x=pstmt.executeUpdate();
    if(x==1) {
    	return true;
    }
    else {
    	return false;
    }
  }
    
    boolean login() throws Exception{
    	String s1="SELECT * FROM student1 WHERE usn=? AND pwd=?";
    	pstmt=con.prepareStatement(s1);
    	pstmt.setString(1,usn);
    	pstmt.setString(2,pwd);   
    	res=pstmt.executeQuery();
    	while(res.next()==true) {
    		return true;
    	}
    	return false;
    }
}

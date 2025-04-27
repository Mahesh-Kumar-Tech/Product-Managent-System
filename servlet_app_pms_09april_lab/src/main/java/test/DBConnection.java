package test;

import java.sql.*;
public class DBConnection {
	
	private static Connection con=null;
	private DBConnection() {}
		static
		{
			try {
				Class.forName(DBInfo.driver);
				con=DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUName, DBInfo.dbPWord);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	    public static Connection getCon()
	    {
	          return con;
	    }
}



/*  
 create table admin40(
   FullName varchar2(20),
   Email varchar2(25),
   Phone number(10),
   Password varchar2(20),
   CPassword varchar2(20),
   primary key(FullName,Password));
   
   
create table product40(
ProductCode varchar2(10)  primary key,
ProductName varchar2(20),
ProductPrice number(10,2),
ProductStock number(10));



create table customer40(
username varchar2(20),
password varchar2(20),
firstname varchar2(15),
lastname varchar2(15),
mail varchar2(25),
phone number(10),
primary key(username,password));


 */
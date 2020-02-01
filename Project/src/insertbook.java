import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/insertbook")

public class insertbook extends HttpServlet {

public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
	
PrintWriter out=resp.getWriter();
resp.setContentType("text/html");
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smd","root","");
String value1=req.getParameter("bsn");
String value2=req.getParameter("bname");
String value3=req.getParameter("bdoi");
String value4=req.getParameter("bauthor");
String value5=req.getParameter("bpub");
String value6=req.getParameter("noc");
int val=Integer.parseInt(value6);
PreparedStatement stmt=con.prepareStatement("insert into book values(?,?,?,?,?,?)");
stmt.setString(1,value1);
stmt.setString(2,value2);
stmt.setString(3,value3);
stmt.setString(4,value4);
stmt.setString(5,value5);
stmt.setInt(6, val);
stmt.execute();

out.println("Values Inserted !, Choose next <br/>");

RequestDispatcher rd= req.getRequestDispatcher("/ownermenu.jsp");
rd.include(req, resp);
}
catch(ClassNotFoundException e) {e.printStackTrace();}
catch(SQLException e) {e.printStackTrace();}
catch (Exception e) {e.printStackTrace();}
}

}


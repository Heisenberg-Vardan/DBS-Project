import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/searchbook")

public class searchbook extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
PrintWriter out=resp.getWriter();
resp.setContentType("text/html");
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smd","root","");
String c=req.getParameter("choice");
String v=req.getParameter("val");
String sql="select * from book where "+c+"="+v;
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery(sql);
while(rs.next())
{
out.println("Book Serial Number:"+rs.getString(1)+"  ");
out.println("Book Name:"+rs.getString(2)+" ");
out.println("Book Date of Issue:"+rs.getString(3)+"  ");
out.println("Author:"+rs.getString(4)+"  ");
out.println("Publisher:"+rs.getString(5)+"  ");
out.println("Number of copies:"+rs.getInt(6)+"<br/>");
}
}
catch(ClassNotFoundException e) {e.printStackTrace();}
catch(SQLException e) {e.printStackTrace();}
catch (Exception e) {e.printStackTrace();}
}
}

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/getbook")

public class getbook extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
PrintWriter out=resp.getWriter();
resp.setContentType("text/html");
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smd","root","");
String v=req.getParameter("val");
String n=req.getParameter("name");
String b=req.getParameter("SN");
String sql="select * from book where BName =";
String sql2="select* from distributor where DName = ";
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery(sql2+v);
String i= rs.getString(1);
ResultSet r1=st.executeQuery(sql+n);
String s= r1.getString(1);
String sql1="insert into borrows values(?,?)";
PreparedStatement p=con.prepareStatement(sql1);
p.setString(1,s);
p.setString(2, "");
p.setString(3,i);
p.setString(4, b);
p.execute();

out.println("Done! <br/>");
RequestDispatcher rd= req.getRequestDispatcher("/main_menu.jsp");
rd.include(req, resp);
}
catch(ClassNotFoundException e) {e.printStackTrace();}
catch(SQLException e) {e.printStackTrace();}
catch (Exception e) {e.printStackTrace();}
}
}
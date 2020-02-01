import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/deletenotes")

public class deletenotes extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
PrintWriter out=resp.getWriter();
resp.setContentType("text/html");
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smd","root","");

Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs;

String val=req.getParameter("nid");
PreparedStatement ps=con.prepareStatement("delete from notes where nsn=?");
ps.setString(1, val);
ps.executeUpdate();
}
catch(ClassNotFoundException e) {e.printStackTrace();}
catch(SQLException e) {e.printStackTrace();}
catch (Exception e) {e.printStackTrace();}
}
}
import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/insertdist")

public class insertdist extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
PrintWriter out=resp.getWriter();
resp.setContentType("text/html");
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smd","root","");
String value1=req.getParameter("dname");
String value2=req.getParameter("dph");
String value3=req.getParameter("dmd");
String value4=req.getParameter("bsn");
String value5=req.getParameter("nsn");

PreparedStatement stmt=con.prepareStatement("insert into distributor values(?,?,?,?,?)");
stmt.setString(1,value1);
stmt.setString(2,value2);
stmt.setString(3,value3);
stmt.setString(4,value4);
stmt.setString(5, value5);
stmt.execute();

out.println("Inserted!");
RequestDispatcher rd=req.getRequestDispatcher("/distmenu.jsp");
rd.include(req,resp);
}
catch(ClassNotFoundException e) {e.printStackTrace();}
catch(SQLException e) {e.printStackTrace();}
catch (Exception e) {e.printStackTrace();}
}

}

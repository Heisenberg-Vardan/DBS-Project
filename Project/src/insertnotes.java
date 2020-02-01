import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/insertnotes")

public class insertnotes extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
PrintWriter out=resp.getWriter();
resp.setContentType("text/html");
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smd","root","");
String value1=req.getParameter("ntop");
String value2=req.getParameter("nsn");
String value3=req.getParameter("ndoi");

PreparedStatement stmt=con.prepareStatement("insert into notes values(?,?,?)");
stmt.setString(1,value1);
stmt.setString(2,value2);
stmt.setString(3,value3);
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


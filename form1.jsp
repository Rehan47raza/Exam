
<%@page import="java.sql.*"%>
<%
int book_id=Integer.parseInt(request.getParameter("book_id"));
int bookid=0;
String book_name=null;
String book_author=null;
int yop=0;
int bookcost=0;
try{
	
   //Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection(
		"jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP", "aja185core",
		"aja185core");
	
		
//out.println(connection);
	
    Statement statement = connection.createStatement() ;
 
    ResultSet resultset = statement.executeQuery("select * from  TBL_BOOKX_1293131 where BookId='"+book_id+"'") ;
  
while(resultset.next())
{
 bookid=resultset.getInt(1);
book_name=resultset.getString(2);
 book_author=resultset.getString(3);
 yop=resultset.getInt(4);
 bookcost=resultset.getInt(5);
 out.println("Book_id:"+bookid+"Book_Name:"+book_name+"Book_author:"+book_author+"Year Of Publish:"+yop+"Book_cost:"+bookcost);
}
//RequestDispatcher view = request.getRequestDispatcher("/DataGet.jsp");
//view.include(request, response);
//out.println("Book_id:"+bookid+"Book_Name:"+book_name+"Book_author:"+book_author+"Year Of Publish:"+yop+"Book_cost:"+bookcost);

}catch(SQLException e){
	e.printStackTrace();
	
	
}


%>
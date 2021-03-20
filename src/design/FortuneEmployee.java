package MidtermJanuary2021.src.design;


import com.sun.org.apache.xml.internal.serialize.EncodingInfo;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

				ResultSet rs;


		PrintWriter out=res.getWriter();

				res.setContentType("text/html");

				out.println("<html><body>");

				try

				{

					EmployeeInfo info=new EmployeeInfo();


					info.setid(Integer.parseInt(request.getParameter("Emp_id")));

					Class.forName("oracle.jdbc.driver.OdbcDriver");

					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"."system","abc123");

					PreparedStatement ps=con.prepareStatement("Select * from employee where Emp_id=?");

					rs=ps.executeQuery();

					ps.setInt(1,info.getid());

					System.out.println("table border=1 width=50% height=50%>");

					System.out.println("<tr><th>Employee name</th><th>Employee age</th></tr>");

					while(rs.next())

					{

						String name=rs.getString("Emp_name");

						int age=rs.getInt("Emp_age");

						System.out.println("<tr><td>" + name + "</td><td>" + age + " </td> </tr>");

					}

					System.out.println("</table>);

						System.out.println("</html></body>");

					con.close();

				}

				catch(Exception e)

				{

					System.out.println("error");

				}

			}

		}


	}

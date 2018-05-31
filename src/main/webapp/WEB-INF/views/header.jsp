headerheaderheaderheaderheaderheader Login/Logout....


<% Object objUser = session.getAttribute("user");
	String user = "";
	if( objUser != null){
		user = (String)objUser;
	}
	if(user.isEmpty())
		out.print("<a href=/loginForm>login</a>");
	else
		out.print("Connect: "+ user + "<a href=/logout>logout</a>");
%>


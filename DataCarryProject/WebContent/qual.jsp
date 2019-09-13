<form action = "qual">
<%


String skillName = (String)request.getAttribute("skillForNextPage");
%>

<input type= "hidden" name = "skillName" value = "<%=skillName%>"/>

Qualification : <input type = "text" name = "qualName">

<!-- if u click this i will send jsession id to server again whichever i have  -->
<input type = "submit" value = "click here to add your prieview "/>
 </form>
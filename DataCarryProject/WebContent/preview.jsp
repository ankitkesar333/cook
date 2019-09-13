<form>
Skill :: 
<%
String skill = (String)request.getAttribute("skillForPreview");
 out.println(skill);
%>


<br>


</br>
Qual ::<%
String qual = (String)request.getAttribute("qualForPreview");
 out.println(qual);
%>




<input type = "submit" value = "save to DB "/>
 </form>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>I tuoi dati</h1>
<s:property value="testform.nome"/><br/>
<s:property value="testform.anni"/><br/>
<s:property value="testform.nascita"/><br/>
<s:property value="testform.altezza"/><br/>
<s:property value="testform.basso"/><br/>
<s:property value="testform.latoX"/><br/>
<s:property value="testform.latoY"/><br/>

<s:iterator begin="1" end="testform.latoX" step="1" var="i">
	<s:iterator begin="1" end="testform.latoY" step="1" var="j">
		<%="*"%>
	</s:iterator>
	<br/>
</s:iterator><br/>

<s:iterator begin="1" end ="testform.latoY" step ="1" var="s"> 
	<s:iterator begin="1" end="s" step="1" var="z">
		<%="*"%>
	</s:iterator>
	<br/>
</s:iterator><br/>

<s:iterator begin="1" end ="testform.latoX" step ="1" var="a"> 
	<s:iterator begin="1" end="testform.latoY" step="1" var="b">
	<c:choose>
	<c:when test='${a==1 or a== testform.latoX }' >
	<%="*"%>
	</c:when>
	<c:when test='${b==1 or b== testform.latoY }'>
	<%="*"%>
	</c:when>
	<c:otherwise><%="#" %>
	</c:otherwise>
	</c:choose>
	</s:iterator>
	<br/>
</s:iterator>



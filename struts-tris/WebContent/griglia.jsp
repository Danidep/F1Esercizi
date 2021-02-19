<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<h1>Tic-Tac-Toe</h1>
	<div class="play-area">
		<s:iterator begin="0" end="8" step="1" var="i">
			<s:include value="quadrato.jsp">
				<s:param name="blockIdx">
					<c:out value="${i}" />
				</s:param>
			</s:include>
		</s:iterator>
		<s:form name="playerActionForm" action="index">
			<s:hidden name="trisform.x" value="%{trisform.x}" />
			<s:hidden name="trisform.o" value="%{trisform.o}" />
			<s:hidden name="trisform.id" value="%{trisform.id}"/>
			<s:hidden value="trisGrigliaForm.contaTurni" />
		</s:form>
	</div>
</div>

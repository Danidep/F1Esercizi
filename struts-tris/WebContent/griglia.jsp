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
			<s:hidden value="trisform.x" />
			<s:hidden value="trisform.o" />
			<s:hidden value="trisform.contaTurni" />
			<s:hidden name="trisform.id" value="%{trisform.id}"/>
			<s:hidden value="lastBlockValue" />
		</s:form>
	</div>
</div>

<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="block_${param.blockIdx}" class="block" style="width: 100%; height: 100%;" onclick="submit('index', ${param.blockIdx})">
	<c:if test="${param.blockIdx == trisform.id}">
		<c:out value="${lastBlockValue}" />
	</c:if>
</div>
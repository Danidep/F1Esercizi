<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	var submit = function(elem) {
		var myForm = document.getElementById(elem);
		myForm.id = parseInt(myForm.parentNode.parentNode.id.split('_')[1]);
		myForm.submit();
	};
</script>

<div style="width: 100%; height: 100%;" onclick="submit('index')">
	<s:form name="playerActionForm" action="index">
		<s:hidden value = "trisform.x"/>
		<s:hidden value = "trisform.o"/>
		<s:hidden value = "trisform.contaTurni"/>
		<s:hidden value = "trisform.id"/>
	</s:form>
</div>
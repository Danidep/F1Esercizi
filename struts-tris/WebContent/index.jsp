<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta http-equiv="X-UA-Compatible" content="ie=edge" />
	<title>Tic-Tac-Toe</title>
	<link rel="stylesheet" href="areaGioco.css" />
	<link rel="stylesheet" href="quadrato.css" />
	<script type="text/javascript">
		var submit = function(elem, i) {
			var myForm = document.getElementById(elem);
			myForm["trisform.id"].value = i;
			myForm.submit();
		};
	</script>
	</head>
	<body>
		<s:include value="griglia.jsp"></s:include>
	</body>
</html>


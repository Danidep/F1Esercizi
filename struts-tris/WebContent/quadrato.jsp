<%@page import="org.apache.struts2.components.Param"%>
<%@page import="it.struts_tris.form.TrisGrigliaForm"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="block_${param.blockIdx}" class="block" style="width: 100%; height: 100%;" onclick="submit('index', ${param.blockIdx})">
		<%= ((TrisGrigliaForm)session.getAttribute("SalvaGriglia")).get(Integer.parseInt(request.getParameter("blockIdx"))) %>
</div>
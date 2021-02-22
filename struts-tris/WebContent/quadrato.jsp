<%@page import="org.apache.struts2.components.Param"%>
<%@page import="it.struts_tris.form.TrisGrigliaForm"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="block_${param.blockIdx}"class="block 
 	<%if("X".equals(((TrisGrigliaForm)session.getAttribute("SalvaGriglia")).get(Integer.parseInt(request.getParameter("blockIdx")))))
 		out.println("red");
 	else if ("O".equals(((TrisGrigliaForm)session.getAttribute("SalvaGriglia")).get(Integer.parseInt(request.getParameter("blockIdx")))))
 		out.println("navy");%>"
	
	onclick="submit('index', ${param.blockIdx})">

  <%= ((TrisGrigliaForm)session.getAttribute("SalvaGriglia")).get(Integer.parseInt(request.getParameter("blockIdx")))==null ? " " :
		((TrisGrigliaForm)session.getAttribute("SalvaGriglia")).get(Integer.parseInt(request.getParameter("blockIdx"))) %>
</div>
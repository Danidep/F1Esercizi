<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="stampa">
  <s:textfield name="testform.nome" label="Nome"/>
  <s:textfield name="testform.anni" label="Anni"/>
  <s:textfield name="testform.nascita" label="Nascita"/>
  <s:textfield name="testform.altezza" label="Altezza"/>
  <s:textfield name="testform.latoX" label="LatoX"/>
  <s:textfield name="testform.latoY" label="LatoY"/>
  <s:submit value="submit" />
  <a href="<s:url action='dati'/>">Dati </a> 
</s:form>
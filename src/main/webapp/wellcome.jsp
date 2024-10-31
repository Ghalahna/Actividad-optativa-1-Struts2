<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>

</body>
    <p> Concepto : <s:text name="invoiceBean.subject"/> </p>
    <p> Importe  : <s:text name="invoiceBean.amount"/> &euro;</p>
    <p> IVA : <s:text name="IVA"/> % </p>
    <p> Importe Total : <s:text name="invoiceBean.importemasiva"/> &euro;</p>
</html>
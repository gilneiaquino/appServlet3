<html>
  <head> servlet cadastrar cliente em JSP</head>
  <body>
   <form method="post"	action="cadastrarCliente" >
   		<div>Nome:<input type="text" name="nome"></div>
   		<div>Idade:<input type="text" name="idade"></div>
   		<input type="submit" value="Salvar">
   </form> 
   
   <%@ include file="paginaIncluida.jsp"%>   
</html>
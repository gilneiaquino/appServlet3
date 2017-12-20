<%@ page errorPage="/paginasDeErro/erroCode.jsp" %>
<html>
  <head> servlet cadastrar cliente em JSP</head>
  <body>
   <form method="post"	action="cadastrarCliente" >
   		<div>Nome:<input type="text" name="nome"></div>
   		<div>Idade:<input type="text" name="idade"></div>
   		<input type="submit" value="Salvar">
   </form>  
   <% String teste = null;%>
   <%out.println(teste);%>
  </body>
</html>
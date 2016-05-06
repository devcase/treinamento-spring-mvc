<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset= "UTF=8">

<style type="text/css">
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
}
th, td {
    padding: 5px;
}
h3{
	font-weight: bold;
	color:#bbcbff;
	text-align: center;
}
</style>
<title> Informações gerais</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>


</head>
<body>
<h3>Lista do pessoal cadastrado</h3>

<table style="width:100%">
<tr>
	<th>Nome</th>
	<th>Data de Nascimento</th>
</tr>
<c:forEach var= "item" items="${listaPessoas}">
<tr>
	<td>${item.getNome()}</td> 	
	<td>${item.getDataNascimento()}</td>
</tr>

</c:forEach>
</table>

</body>
</html>
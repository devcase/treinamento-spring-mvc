<!DOCTYPE html>
<html>
<head>
<meta charset= "UTF=8">
<title> Pagina de Cadastro</title>
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
<h1>Digite o seu nome:</h1>
<form action="/salvar" method="post">
<fieldset>
<label>Nome:<input type="text" name="nome"></label><br>
<label>Idade:<input type="text" name="idade"></label>
<label>Data de Nascimento:<input type="text" name="dataNascimento"></label>
<input type="submit" value="salvar">
<input type="reset" value="limpar">
</fieldset>
</form>
</body>
</html>
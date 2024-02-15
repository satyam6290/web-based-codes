
<html>
<head>
<script language="javascript">
function colorchoice(color)
{
switch(color)
{
case "red":document.body.style.backgroundColor="red";alert("the choosen color is red");break;
case "blue":document.body.style.backgroundColor="blue";alert("the choosen color is blue");break;
case "green":document.body.style.backgroundColor="green";alert("the choosen color is green");break;
case "yellow":document.body.style.backgroundColor="yellow";alert("the choosen color is yellow");break;
case "orange":document.body.style.backgroundColor="orange";alert("the choosen color is orange");break;
default:alert("the choosen color doesnt exist");
break;
}}
</script>
</head>
<body>
<form name="f1">
<input type="radio" name="x" value="red" onclick="colorchoice('red')">RED<br>
<input type="radio" name="x" value="blue" onclick="colorchoice('blue')">BLUE<br>
<input type="radio" name="x" value="green" onclick="colorchoice('green')">GREEN<br>
<input type="radio" name="x" value="yellow" onclick="colorchoice('yellow')">YELLOW<br>
<input type="radio" name="x" value="orange" onclick="colorchoice('orange')">ORANGE<br>
</form>
</body>
</html>

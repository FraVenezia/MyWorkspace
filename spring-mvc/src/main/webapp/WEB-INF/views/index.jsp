<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Maven + Spring MVC</title>
</head>

<body>
	<h1>Prova</h1>
	<div>
		<button id="micro">Try it</button>
	</div>
	<div id="nuovo"></div>
</body>

<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous">
	
</script>

<script type="text/javascript">
	$(function($) {
		$("#micro").click(function(event) {

			$.ajax({
				url : "/spring-mvc/micro"
			}).then(function(data) {
				$("#nuovo").append(data);
			});

		});
	});
	
	</script>
	<script type="text/javascript">
	  function loadData(e) {
	    e.preventDefault();
	    $.ajax({
	    type: "POST",
	    contentType: "application/json; charset=utf-8",
	    url: "/spring-mvc/microutenti",
	    data: "",
	    dataType: "json",
	    success: function (data) {
	      $.map(data.d, function (product) {
	         $('<tr> <td>' + product.nome + '</td> <td>' + product.cognome + ' </td> <td>' + product.età).appendTo("#nuovo");
	  });
	  },
	  error: function (response) {
	    alert("Error" + response.responseText);
	  }
	});
	 
	}
	 
	</script>

</html>
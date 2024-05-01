<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Platypi:ital,wght@0,300..800;1,300..800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="../css/style.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

</head>
<body>
	<div class="navbar">
		<h2>Employee CRUD</h2>
	</div>
	
	<div class="con">
		<div class="content cd">
			<label>Emp Id:</label>
			<input type="text" id="empid" disabled>
		</div>
		<div class="content cd">
			<label>Name:</label>
			<input type="text" id="name">
		</div>
	</div>
	
	<div class="con">
		<div class="content">
			<label>Department Name:</label>
			<input type="text" id="dname">
		</div>
		<div class="content">
			<label>Phone Number:</label>
			<input type="tel" id="phno">
		</div>
	</div>
	
	<div class="con">
		<div class="content">
			<label>HireDate:</label>
			<input type="date" id="hrdt">
		</div>
		<div class="content">
			<label>Designation:</label>
			<input type="text" id="design">
		</div>
	</div>
	
	<div class="btns">
		<button id="first">First</button>
		<button id="last">Last</button>
		<button>Previous</button>
		<button>Next</button>
	</div>
	<div class="btns">
		<button id="#add">Add</button>
		<button>Save</button>
		<button>Clear</button>
		<button>Exit</button>
	</div>
	
	<table class="table" style="margin-top:50px;width:800px;margin-left:300px">
  <thead>
    <tr>
      <th scope="col">EmpId</th>
      <th scope="col">Name</th>
      <th scope="col">Department Name</th>
      <th scope="col">Phone</th>
      <th scope="col">Hiredate</th>
      <th scope="col">Designation</th>
    </tr>
  </thead>
  <tbody id="tbody">

  </tbody>
</table>
<script src="../javascript/script.js"></script>
</body>
</html>
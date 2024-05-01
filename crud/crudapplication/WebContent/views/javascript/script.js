$(document).ready(function(){
	$.ajax({
		url:"http://localhost:8080/crudapplication/DisplayServlet",
		method:'GET',
		success:function(data){
			data=JSON.parse(data);
			console.log(data);
			$.each(data.employees,function(index,ele){
				console.log(data.employees[index].empid)
				var tr='<tr>'+
				      '<th scope="row">'+data.employees[index].empid+'</th>'+
				      '<td>'+data.employees[index].name+'</td>'+
					  '<td>'+data.employees[index].department+'</td>'+
					  '<td>'+data.employees[index].phno+'</td>'+
					  '<td>'+data.employees[index].hdate+'</td>'+
					  '<td>'+data.employees[index].designation+'</td>'+
				    +'</tr>'

				$('tbody').append(tr);
			})
			var k=$('tbody tr').length;
		},
	})
})

$(document).on('click',"#add",function(){
	var empid=($('#empid').val())+1;
	var name=$('#name').val();
	var dname=$('#dname').val();
	var phno=$('#phno').val();
	var hrdt=$('#hrdt').val();
	var design=$('#design').val();
	
	$.ajax({
		url:"http://localhost:8080/crudapplication/AddServlet",
		method:'POST',
		data:{"empid":empid,"name":name,"dname":dname,"phno":phno,"hrdt":hrdt,"design":design},
	})
})

$(document).on('click',"#first",function(){
	$.ajax({
		url:"http://localhost:8080/crudapplication/FirstServlet",
		method:'GET',
		success:function(data){
			data=JSON.parse(data);
			$.each(data.employees,function(index,ele){
					$('#empid').attr('value',data.employees[index].empid);
					$('#name').attr('value',data.employees[index].name);
					$('#dname').attr('value',data.employees[index].department);
					$('#phno').attr('value',data.employees[index].phno);
					$('#hrdt').attr('value',data.employees[index].hdate);
					$('#design').attr('value',data.employees[index].designation);
			})
			
			var k=$('tbody tr').length;
			console.log(k);
		},
	})
})

$(document).on('click',"#last",function(){
	$.ajax({
		url:"http://localhost:8080/crudapplication/LastServlet",
		method:'GET',
		success:function(data){
			data=JSON.parse(data);
			$.each(data.employees,function(index,ele){
					$('#empid').attr('value',data.employees[index].empid);
					$('#name').attr('value',data.employees[index].name);
					$('#dname').attr('value',data.employees[index].department);
					$('#phno').attr('value',data.employees[index].phno);
					$('#hrdt').attr('value',data.employees[index].hdate);
					$('#design').attr('value',data.employees[index].designation);
			})
			
			var k=$('tbody tr').length;
			console.log(k);
		},
	})
})


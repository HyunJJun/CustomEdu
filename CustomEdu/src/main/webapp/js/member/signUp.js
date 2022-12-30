function join(){
	
	
	let user_id = 	$('#id').val();
	let user_nm=  	$('#name').val();
	let user_pwd = 	$('#pwd').val();
	let user_email= $('#email').val();
	let user_birth= $('#birth').val();
	let user_tel =	$('#tel').val();
	let user_addr =	$('#addr').val();
	alert(user_id);
	let obj = {
		name : user_nm ,
		id : user_id, 
		pwd : user_pwd, 
		email : user_email,
		birth :  user_birth,
		tel : user_tel,
		addr: user_addr
	}

	$.ajax({
		url : "/insertMember",
		data : JSON.stringify(obj),
		type : "POST",
		dataType:"JSON",
		contentType: 'application/json',
		success : function(obj){
			console.log(obj);
			alert("성공")
		},
		error : function(e){
			console.log(obj);
			alert("실패")
		}
	});
		
	
	
}

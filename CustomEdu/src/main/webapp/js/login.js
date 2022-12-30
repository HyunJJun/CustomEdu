function login(){
	let id =$("#id").val();
	let pwd=$("#pwd").val();
	
	let data ={id :id, 
			   pwd :pwd}
	
	$.ajax ({
		url : "Dologin",
		type: "POST",
		data : data,
	    dataType:"JSON",
		contentType: 'application/json',
		success : function(data){
			console.log(data);
			alert("성공")
		},
		error : function(e){
			console.log(data);
			alert("실패")
		}
	});
	 
}


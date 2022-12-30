<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
	<!-- Header -->
	<jsp:include page="../common/Header.jsp"></jsp:include>
	<script src="../../js/member/signUp.js"></script>

	<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<!-- OVERVIEW -->
					<div class="panel panel-headline">
						<div class="panel-heading">
							<h3 class="panel-title">Sign Up</h3>
						</div>
						<div class="panel-body">
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="NAME" id="name"></p></div>
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="ID" id="id"></p></div>
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="Pwd" id="pwd"></p></div>
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="Email" id="email"></p></div>
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="Birth" id=birth></p></div>
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="Tel" id="tel"></p></div>
								<div><p><input style ="width:70%;" type= "text" class="form-control" placeholder="Addr" id="addr"></p></div>
							<button type="button" class="btn btn-primary btn-block" onclick="join()">join</button>
						</div>
					</div>
					<!-- END OVERVIEW -->
				</div>
			</div>
		</div>
		
<jsp:include page="../common/Footer.jsp"></jsp:include>
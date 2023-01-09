<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
	<!-- Header -->
	<jsp:include page="../common/Header.jsp"></jsp:include>
	<script src="js/jqGrid/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
	<script src="js/jqGrid/js/minified/jquery.jqGrid.min.js" type="text/javascript"></script>
	<script src="js/jqGrid.js"></script>
	<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<!-- OVERVIEW -->
					<div class="panel panel-headline">
						<div class="panel-heading">
							<h3 class="panel-title">Board List</h3>
							  <table class="table table-striped" style="text-align:center; border:1px solid #dddddd">
				                <!-- thead는 테이블의 제목부분에 해당함 -->
				                <thead>
				                	<!-- 테이블의 하나의 행을 말함(한 줄)-->
				                    <tr>
				                    	<!-- 게시판의 속성을 하나씩 명시 해준다. -->
				                        <th style="background-color:#eeeeee; text-align:center;">번호</th>
				                        <th style="background-color:#eeeeee; text-align:center;">제목</th>
				                        <th style="background-color:#eeeeee; text-align:center;">작성자</th>
				                        <th style="background-color:#eeeeee; text-align:center;">작성일</th>
				                    </tr>
				                </thead>
				                <!-- tbody 같은 경우는 위에 지정해준 속성 아래에 하나씩 출력해주는 역할 -->
				                <tbody>
				                <!--임시 데이터 삽입 -->
				                <tr>
				              	 
				                    	</tr>
				                </tbody>
				            </table>
						</div>
					</div>
					<!-- END OVERVIEW -->
					</div>
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		
<jsp:include page="../common/Footer.jsp"></jsp:include>
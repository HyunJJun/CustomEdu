<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko" class="fullscreen-bg">
<head>
	<title>Dashboard | Klorofil - Free Bootstrap Dashboard Template</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="/assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="/assets/vendor/linearicons/style.css">
	<link rel="stylesheet" href="/assets/vendor/chartist/css/chartist-custom.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="/assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="/assets/css/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="/assets/img/favicon.png">
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
	<script src="js/index.js"></script>
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<c:choose>
			<c:when test="${empty sessionScope.ses_id}">
				<nav class="navbar navbar-default navbar-fixed-top">
					<div class="brand">
						<a href="/board">THE CUSTOM</a>
					</div>
					<div class="container-fluid">
						<div class="navbar-btn">
							<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
						</div>
						
						<form class="navbar-form navbar-left">
						</form>
							<div class="navbar-btn navbar-btn-right">
									<a  href ="/login" class="btn btn-success update-pro"> <span>Login</span></a>
									<a  href ="/signup" class="btn" style="background-color: white;"> <span>Sign Up</span></a>
							</div>
						<div id="navbar-menu">
							<ul class="nav navbar-nav navbar-right">
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="assets/img/user.png" class="img-circle" alt="Avatar"> <span>로그인이 필요합니다.</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
									<!-- <ul class="dropdown-menu">
										<li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
										<li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
										<li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
										<li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
									</ul> -->
								</li>
							</ul>
						</div>
					</div>
				</nav>
			</c:when>
			<c:otherwise>
				<nav class="navbar navbar-default navbar-fixed-top">
					<div class="brand">
						<a href="/board">THE CUSTOM</a>
					</div>
					<div class="container-fluid">
						<div class="navbar-btn">
							<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
						</div>
							<div class="navbar-btn navbar-btn-right">
								<a href ="/Logout" class="btn btn-success update-pro"> <span>Logout</span></a>
							</div>
						<div id="navbar-menu">
							<ul class="nav navbar-nav navbar-right">
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="assets/img/user.png" class="img-circle" alt="Avatar"> <span>${sessionScope.ses_id}</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
									<ul class="dropdown-menu">
										<li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
										<li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
										<li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
										<li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
									</ul>
								</li>
							</ul>
						</div>
					</div>
				</nav>
			</c:otherwise>
		</c:choose>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<c:choose>
			<c:when test="${empty sessionScope.ses_id}">
				<div id="sidebar-nav" class="sidebar">
					<div class="sidebar-scroll">
						<nav>
							<!-- <ul class="nav">
								<li><a class="active"><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
								<li><a href="/board" class=""><i class="lnr lnr-dice"></i> <span>Tables</span></a></li>
								<li><a href="/Jqgrid" class=""><i class="lnr lnr-text-format"></i> <span>JqGrid</span></a></li>
								<li><a href="/api" class=""><i class="lnr lnr-linearicons"></i> <span>API</span></a></li>
							</ul> -->
						</nav>
					</div>
				</div>
			</c:when>
			<c:otherwise>
				<div id="sidebar-nav" class="sidebar">
						<div class="sidebar-scroll">
							<nav>
								<ul class="nav">
									<li><a class="active"><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
									<li><a href="/board" class=""><i class="lnr lnr-dice"></i> <span>Board</span></a></li>
									<li><a href="/Jqgrid" class=""><i class="lnr lnr-text-format"></i> <span>JqGrid</span></a></li>
									<li><a href="/api" class=""><i class="lnr lnr-linearicons"></i> <span>API</span></a></li>
								</ul>
							</nav>
						</div>
					</div>
			</c:otherwise>
		</c:choose>
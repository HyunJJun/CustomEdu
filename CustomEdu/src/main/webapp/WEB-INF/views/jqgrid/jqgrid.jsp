<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel = "stylesheet" type = "text/css" media = "screen" href = "js/jqGrid/css/jquery-ui-1.10.4.custom.min.css"/>
<link rel = "stylesheet" type = "text/css" media = "screen" href = "js/jqGrid/css/ui.jqgrid.css"/>

<script src = "js/jqGrid/jquery-1.7.2.min.js" type = "text/javascript"></script>
<script src = "js/jqGrid/i18n/grid.locale-kr.js" type = "text/javascript"></script>
<script src = "js/jqGrid/jquery.jqGrid.min.js" type = "text/javascript"></script>

<script>
    $(window.document).ready(      
	    function gridTable(grid, array) {
	    	var firstGridColNames = [ 'seq', '2번', '3번', '4번', '5번', '6번', '7번', '8번', '9번' ];
		    var firstGridColModel = [
		                { name : 'seq',             index : 'seq',              width : 40,        	align : 'center' },
		                { name : 'num2',         	index : 'num2',            	width : 100,    	align : 'left'   },
		                { name : 'num3',            index : 'num3',             width : 100,    	align : 'left'   },
		                { name : 'num4',         	index : 'num4',            	width : 200,    	align : 'left'   },
		                { name : 'num5',            index : 'num5',            	width : 100,    	align : 'center' },
		                { name : 'num6',    		index : 'num6',    			width : 100,    	align : 'center' },
		                { name : 'num7',     		index : 'num7',         	width : 100,    	align : 'center' },
		                { name : 'num8',         	index : 'num8',         	width : 100,    	align : 'center' },
		                { name : 'num9',         	index : 'num9',         	width : 100,    	align : 'center' }
		                ];
	        var dataArr = [
						 {seq:"1",num2:"80",num3:"60",num4:"50",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"2",num2:"57",num3:"80",num4:"50",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"3",num2:"90",num3:"40",num4:"85",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"4",num2:"67",num3:"84",num4:"76",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"5",num2:"35",num3:"83",num4:"85",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"6",num2:"90",num3:"67",num4:"56",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"7",num2:"80",num3:"60",num4:"50",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"8",num2:"45",num3:"67",num4:"10",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
						 {seq:"9",num2:"90",num3:"40",num4:"68",num5:"80",num6:"60",num7:"50",num8:"60",num9:"50"},
	        			];     
	        			   
	        $("#grid").jqGrid({
	            url : 'http://localhost:8085/Jqgrid',
	            caption : 'Custom_edu_first_jqgrid',    	// caption : 그리드의 제목을 지정한다.
	            datatype : 'local',               			// datatype : 데이터 타입을 지정한다.
	            data : dataArr,
	            mtype : 'post',                    			// mtype : 데이터 전송방식을 지정한다.
	            height : '500px',                 			// height : 그리드의 높이를 지정한다.
	            pager : '#pager',                 			// pager : 도구 모임이 될 div 태그를 지정한다.
	            rowNum : 3,                       			// rowNum : 한 화면에 표시할 행 개수를 지정한다.
	            loadonce : true,                  			// loadonce : rowNum 설정을 사용하기 위해서 true로 지정한다.
	            rowList : [3, 6, 10],          				// rowList : rowNum을 선택할 수 있는 옵션을 지정한다.
	            colNames : firstGridColNames , 				// colNames : 열의 이름을 지정한다.
	            colModel : firstGridColModel ,
	           
	            // jqGrid 에서 default 형태의 JSON 이 아닌 소셜픽만의 고유의 json 형태로 날아오기에.
	            // 소셜픽의 API 를 바꿀 순 없어, jqGrid 에서 json을
	            // customizing하여 사용하기 위해 jsonReader를 사용했다.
	            jsonReader : {
	                            repeatitems : false,
	                            id : "rank",
	                            root : function (obj) { return obj.socialpick.item; },
	                            page : function (obj) { return 1; },
	                            total : function (obj) { return 1; },
	                            records : function (obj) {return obj.socialpick.item.length; }
	            }
	
	        }).navGrid('#pager', {							// navGrid() 메서드는 검색 및 기타기능을 사용하기위해 사용된다.
	            search : true,
	            edit : true,
	            add : true,
	            del : true
	        });
	        
	        for(var i in array){
	           $("#grid").jqGrid('addRowData',i+1,array[i]);
	      	}
	      	
	    }
    );
</script>
<title>jqGrid</title>
</head>
<body>

     // JQgrid 첫번째 테스트 그리드
	<div class="tableWrap">
	    <table id = "grid"></table>
	    <div id = "pager"></div>
	</div>
	
</body>
</html>
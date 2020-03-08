<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<style>
#resultDiv {
	width: 880px;
}

#wrap {
	width: 990px;
	margin: 0 auto;
}

.result {
	margin: 0 auto;
}

.row {
	height: 250px;
	width: 700px;
	border: 1px solid black;
	margin: 0 auto;
}

.summoners {
	width: 700px;
}

.summoners > div {
	float: left;
	border: 1px solid red;
	width: 80px;
	height: 45px;
}
.summoners span{
	font-size:12px;
	display:block;
}

.itemDiv{
	width: 400px;
	height: 45px;
}

.item {
	width: 20px;
	height: 20px;
	float: left;
	border: 1px solid white;
	background-size: contain;
}
.item:last-child{
	clear:both;
}
.summoner{
	width:200px;
}
.clear {
	clear: both;
}
</style>
<article>
	<div id="wrap">
		<div id="searchDiv">
			<input type="text" name="name" id="name" placeholder="" size="25">
			<button id="search">검색</button>

		</div>
		<div id="resultDiv">
			
		</div>
	</div>
</article>
<%@include file="/WEB-INF/views/footer.jsp" %>
    </body>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
var jsonArray = {};
$(document).on("click", "#search", function() {
	var summonerName = $("#name").val();

	$.post('/trollPolice1/getList', {
		name : summonerName
	}, function(txt) {
		console.log(txt);
		jsonArray = {};
		jsonArray = txt;
		//중간에 실패 처리 작업 ex api키 만료 등등 ... 서버 에러 처리 
		showMatchOverview(jsonArray);
	}, "json").fail(function() {
		alert("실패했습니다.")
	}).done(function() {
		alert("끝남");
	})
})

function showMatchOverview(jsonArray) {
		$("#resultDiv").empty();
        
        var blueChampImg = "<div class ='summoners'>" + "<div class='champ'>"; // champImg
		var blueSummonerName = "</div><div class='summoner'>"
								+"<span class='summonerName'>"; //summonerName
		var blueKda = "</span><span class='kda'>";
		var blueItem0 = "</span></div>"+
						"<div class='itemDiv'><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var blueItem1 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var blueItem2 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var blueItem3 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var blueItem4 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var blueItem5 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var blueItem6 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		
		
		var redItem0 = ".png')></div></div>" // blue팀 itemDiv close
				+ "<div class='itemDiv'><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redItem1 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redItem2 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redItem3 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redItem4 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redItem5 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redItem6 = ".png')></div><div class='item' style=background-image:url('${pageContext.request.contextPath}/resources/img/items/";
		var redSummonerName = ".png')></div></div>"+
					"<div class='summoner'><span class='summonerName'>";
		var redKda = "</span><span class='kda'>";
		var redChampImg = "</span></div>"+
						  "<div class='champ'>";
		var summonerSchemeEnd = "</div>"+ //class = champ close
							"</div>"+//class = summoners close
							"<div class='clear'></div>";
        //var rowScheme = "<div class='row'>"; var rowSchemeEnd = "</div>"
        for(var match=0;match<10;match++){        

            $("#resultDiv").append("<div class='row'></div>");
            for (var blue = 0; blue < 5; blue++) {
                var red = blue + 5;
                var participants = jsonArray[match]['participantVOList'];

                $("#resultDiv > .row:last-child").append(blueChampImg+
                participants[blue]['championId']+
                blueSummonerName+participants[blue]['summonerName']+
                blueKda+participants[blue]['kills']+"/"+
                participants[blue]['deaths']+"/"+
                participants[blue]['assists']+
                blueItem0+participants[blue]['item0']+
                blueItem1+participants[blue]['item1']+
                blueItem2+participants[blue]['item2']+
                blueItem3+participants[blue]['item3']+
                blueItem4+participants[blue]['item4']+
                blueItem5+participants[blue]['item5']+
                blueItem6+participants[blue]['item6']+
                redItem0+participants[red]['item0']+
                redItem1+participants[red]['item1']+
                redItem2+participants[red]['item2']+
                redItem3+participants[red]['item3']+
                redItem4+participants[red]['item4']+
                redItem5+participants[red]['item5']+
                redItem6+participants[red]['item6']+
                redSummonerName+participants[red]['summonerName']+
                redKda+participants[red]['kills']+"/"+
                participants[red]['deaths']+"/"+
                participants[red]['assists']+
                redChampImg+participants[red]['championId']+
                summonerSchemeEnd);
            }

        }
    }
</script>
</html>
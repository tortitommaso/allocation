<!DOCTYPE html>
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.min.js"
        type="text/javascript"></script>
<script language="Javascript"> 
function timeout_trigger() {
	var urlToCall = '/allocation/servlet';
	$.getJSON(urlToCall, function(data) { 
		for (var i in data) {
		  var truck = data[i];
		  move_truck(truck.trucknumber, truck.status);
	    }
    });
	timeout_init(); 
}

function move_truck(truckid, status) {
	var classToMove = ".truck" + truckid;
	if ($.trim(status)=='inprogress') {
	       $(classToMove).animate({left:'170px'});
    } else if ($.trim(status)=='exit') {
	       $(classToMove).animate({left:'320px'});
    } else if ($.trim(status)=='start') {
		   $(classToMove).animate({left:'0px'});
    }
}

function timeout_init() {
    setTimeout('timeout_trigger()', 2000);
}

$(document).ready(function(){
  timeout_init();
});
</script> 
</head>
 
<body>
<table border="1" cellpadding="10">
<tr>
<td style="left:250px">
<img src="http://scoobygo.com/en/files/2012/05/parking-128x128.png"/>
</td>
<td style="left:250px">
<img src="http://cdn1.iconfinder.com/data/icons/iconslandgps/PNG/128x128/Places/GasStation.png"/>
</td>
<td>
<img src="http://www.mricons.com/store/png/2125_3226_128_exit_power_quit_icon.png"/>
</td>
</tr>
</table>
<%
for ( int i = 0; i < 4; i++ ) {
%>
    <div class="truck<%=i%>" style="position:relative;">
	<% if (i % 3 == 0) { %>
	<img src="http://png-5.findicons.com/files/icons/978/cem_transport/128/truck.png" />
	<% } else if (i % 2 == 0) { %>
	<img src="http://findicons.com/files/icons/2527/hand_drawn_e_commerce/128/truck.png"  />
	<% } else { %>
	<img src="http://findicons.com/files/icons/914/cemagraphics/128/tanker_truck.png" />
	<% } %>
	</div>
<% } %>

</body>
</html>

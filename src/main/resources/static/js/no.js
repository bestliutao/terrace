/*标签页title传递*/
$(document).ready(function () {
        	var qu = decodeURI(location.search.split("=")[1]);        	
            $('.title_iframe').text( qu);
        });   
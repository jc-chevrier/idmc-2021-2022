$(() => {
	$.ajax({
		"cache": false,
        "dataType": "jsonp",
        "async": true,
        "crossDomain": true,
	    "method": "GET",
    	"headers": {
              "accept": "application/json",
              "Access-Control-Allow-Origin":"*"
        },
	    "url": "https://api.aniapi.com",
	    "data": {},
	    "success": (json) => console.log(json)
	});
});
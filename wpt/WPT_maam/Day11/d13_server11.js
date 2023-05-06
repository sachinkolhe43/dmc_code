const http = require('http')
var server = http.createServer(function (req, resp) {
    console.log("received request" + req.url + "----" + req.method);
    resp.writeHeader(200, { "content-type": "text/html" });
    resp.write("<h1>Hello world</h1>");
    resp.write("<h3>Welcome to nodejs web application</h3>")
    resp.end("<h4>this is end event</h4>");

});
//this will start the server on port 4000
server.listen(4001, function () {
    console.log("server running on port 4000");
});

// end() is function of write


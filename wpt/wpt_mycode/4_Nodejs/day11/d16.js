const http=require("http");
const fs=require("fs");

var server=http.createServer(function(req,resp){
    console.log("server running on the port 4000")
    console.log("Recieved: "+req.url+"----"+req.method);
    resp.writeHeader(200,{"content-type":"text/html"});
    req.url("/index");
    resp.end();

});

server.listen(3000);
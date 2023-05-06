const http=require("http");

var server = http.createServer(function(req,resp){
    console.log(req.url+"----"+req.method);
    resp.writeHeader(200,{"content-type":"text/html"})
    resp.write("<h1>Hello</h1>");
    resp.end("");

})

server.listen(4000,function(){
    console.log("server running on port 4000");
});
const http=require("http");
var server=http.createServer(function(req,resp){
    console.log("received request"+req.url+"----"+req.method);
    resp.writeHeader(200,{"content-type":"text/html"});
    if(req.url==="/home" && req.method==='GET'){
        resp.write("<h1>in home page</h1>")
        resp.write("<h1>how can I help you></h1>")
        resp.end();
    }else{
        resp.write("<h1>in some other page</h1>")
        resp.write("<h1>It will handle all the requests</h1>")
        resp.end();
    }

});
server.listen(4000)
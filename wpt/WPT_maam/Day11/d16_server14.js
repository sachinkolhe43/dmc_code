const http=require("http");
const fs=require("fs");
var server=http.createServer(function(req,resp){
    console.log("received request"+req.url+"----"+req.method);
    resp.writeHeader(200,{"content-type":"text/html"});
    switch(req.url){
        case "/home":
            resp.write("<h1>in home page");
            resp.end();
            break;
        case "/hello":
              rs=fs.createReadStream("./public/index.html");
              rs.pipe(resp);
              rs.on("error", function(err){
                   resp.writeHeader(404,{"content-type":"text/html"});
                   resp.write("<h3>error oocured</h3>");
                   resp.end();
              })
              break;
        case "/about":
            resp.write("<h1>about us</h2>");
            resp.end();
            break;
       default:
            resp.write("<h1>in some other page</h2>");
            resp.end();
            break;

    }
});
server.listen(4000)
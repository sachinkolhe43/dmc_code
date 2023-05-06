const http=require("http");
const fs=require("fs");
const url=require("url");
var m1=require("./formmodule1")
var server=http.createServer(function(req,resp){
    var q=url.parse(req.url,true);  //q{pathname:"/submit-data", query:{num1:100,num2:100}}
    resp.writeHeader(200,{"content-type":"text/html"})
    switch(q.pathname){
        case "/home":
            rs=fs.createReadStream("./public/formdata.html")
            rs.pipe(resp);
            break;
        case "/submit-data":
            resp.write("num1: "+q.query.num1+"<br>");
            resp.write("num2: "+q.query.num2+"<br>");
            if(q.query.btn==="add"){
               var ans=m1.addition(parseInt(q.query.num1),parseInt(q.query.num2))
               resp.end("addition : "+ans+"<br>");
            }
            else{
               ///to calculate factorial of num1 
            }

            break;
        default:
            resp.write("<h1>on other page</h1>")
            resp.end();
    }
})
server.listen(4001,function(){
    console.log("server running at port 4001")
})
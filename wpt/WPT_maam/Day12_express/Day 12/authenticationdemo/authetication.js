var http=require("http");
var fs=require("fs");
var url=require("url");
var m1=require("./module1")

var server=http.createServer(function(req,resp){
   var q=url.parse(req.url,true);
   resp.writeHeader(200,{"content-type":"text/html"});
   //console.log(q);
   switch(q.pathname){
    case "/register":
        rs=fs.createReadStream("./public/registration.html");
        rs.pipe(resp);
        break;
    case "/submit-data":
        //name=kishori+&addr=Baner&gender=female&uname=user1&pass=pass1&btn=btn
          //var ob={name:req.query.name,addr:req.query.addr,gender:req.query.gender,uname:req.query.uname,password:req.query.pass}
          console.log("in submit data");
         // console.log(ob)
          m1.writeData(q.query);
          resp.write("</h2>Registered successfully</h2>")
          resp.write("<a href='/login'>Login</a><br><a href='/register'>register</a>") 
          resp.end();
          break;
    case "/login":
        rs=fs.createReadStream("./public/Login.html");
        rs.pipe(resp);
        break;
    case "/validate":
        var flag=m1.validateUser(q.query);
        if(flag){
            resp.write("</h2>Successful login</h2>")
            
        }
        else{
            resp.write("</h2>Unsuccessful login</h2>")
        }
        resp.write("<a href='/login'>Login</a><br><a href='/register'>register</a>") 
            resp.end();
        break;
    default:
        resp.write("<h1>in some other page</h1>");
        resp.end("<h2>in authentication system</h2>")

   }
   
});

server.listen(3002,function(){
    console.log("server is running on port 3002")
})
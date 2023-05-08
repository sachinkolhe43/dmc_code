//import libraries
const express=require("express");
const app=express();
var bodyparser=require("body-parser");
var m1=require("./module1");


//define middleware
//this moddleware will seprate url and query string
app.use(bodyparser.urlencoded({extended:false}));
app.use(function(req,resp,next){
   console.log("In my first middleware"+req.url);
   next();
});


//define request handlers
app.get("/home",function(req,resp){
    resp.sendFile("/public/calculate.html",{root:__dirname});
});
app.get("/submit-data",function(req,resp){
    var num1=parseInt(req.query.num1);
    if(req.query.btn==="add"){
       var num2=parseInt(req.query.num2);
       var ans=m1.addition(num1,num2);
       resp.send("<h2>Addition: "+ans+"</h2>")
    }else{
        var ans=m1.factorial(num1);
        resp.send("<h2>Factoprial: "+ans+"</h2>")
    }
})

//start the server
app.listen(3003);
console.log("server started at port 3003")
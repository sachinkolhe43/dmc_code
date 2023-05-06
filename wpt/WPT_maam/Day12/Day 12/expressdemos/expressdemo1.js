//import express library
var express=require("express");
//create express object
var app=express();
//define middleware
var a;
app.use(function(req,resp,next){
    console.log("in forst middleware")
    a=100;
    next();
})
app.get("/hello",function(req,resp){
     resp.send("<h1>Hello world!!"+a+"</h1>")
})
app.get("/welcome",function(req,resp){
    resp.send("<h1>Welcome to express application</h1>")
})
app.listen(3003);
console.log("server is running at port 3003")
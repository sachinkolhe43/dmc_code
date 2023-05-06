//import library
const mysql = require('mysql');
var express=require("express");
var app=express();
var bodyparser=require("body-parser");
var connection=require("./db/dbconnect");
var path=require("path");

//define middleware
app.use(bodyparser.json());
app.use(bodyparser.urlencoded({extended:false})); //req.query, req.body
//configure the setting
app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs")
//define request handler
app.get("/products",function(req,resp){
   //retrieve the data from products table
   connection.query("select * from product",(err,data)=>{
    if(err){
        console.log("error occured");
        resp.send("<h4>error occured</h4>")
    }else{
        resp.send(data);
    }
   }) 
})
app.get("/displayadd",function(req,resp){
    resp.sendFile("/public/addproduct.html",{root:__dirname});
})

app.post("/addproducts",function(req,resp){
   //resp.send(req.body);
   var cid=1;
   connection.query("insert into product values(?,?,?,?,?)",[req.body.pid,req.body.pname,req.body.qty,req.body.price,cid],function(err,result){
    if(!err){
        console.log(result);
        resp.send("<h3>added successfully</h3>")
    }else{
        console.log(err);
        resp.send("<h3>error occured</h3>")
    }
   })
});


//start the server
app.listen(3003);
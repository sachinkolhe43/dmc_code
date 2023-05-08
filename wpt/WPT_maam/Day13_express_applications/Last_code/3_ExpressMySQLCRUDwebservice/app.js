//add all libraries
var express=require("express");
var app=express();
var path=require("path")
var bodyparser=require('body-parser');
var mysql=require('mysql');
var routes=require("./routes/routers")
//configure the application
//app.set("views",path.join(__dirname,"views"))
//app.set("view engine","ejs")

//to add static references
//app.set(express.static(path.join(__dirname,"public")))

app.use(function(req, res, next) {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type');
    res.setHeader('Access-Control-Allow-Credentials', true);
    next();
});


//define middlewaredata in the request body
//into req.query object if method is get
//or into req.body object if method is post
//urlencoded function will conver querystring or 
app.use(bodyparser.urlencoded({extended:false}));
//app.use(bodyparser.json())

//to use css or js
//app.use("/css",express.static(path.resolve(__dirname,"public/css")))
//app.use("/js",express.static(path.resolve(__dirname,"public/js")))
//app.use("/img",express.static(path.resolve(__dirname,"public/img")))
app.use("/",routes);

//start the server
app.listen(3003);
console.log("server is running on port 3003")

module.exports=app

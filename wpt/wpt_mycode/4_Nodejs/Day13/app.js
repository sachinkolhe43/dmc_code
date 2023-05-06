// add libraries
var express = require("express");
var app = express();

var bodyparser = require("body-parser");

var mysql = require("mysql");

var path = require("path");

var routes = require("./routes/routers")

// Define Middleware 

app.use(bodyparser.urlencoded({ extended: false }));

app.use("/", routes);

// Start the Server

//start the server
app.listen(4000);
console.log("server is running on port 4000")



module.exports = app
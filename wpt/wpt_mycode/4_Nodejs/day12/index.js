// import express library
const mysql = require('mysql');
var express=require("express");
var app=express();
var bodyparser=require("body-parser");
var connection=require("./db/dbconnect");
var path=require("path");

// define middleware



app.listen(4000);
console.log("Server started at port no 4000");
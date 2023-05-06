// import all libraries

var express = require("express");

var router = express.Router();

const connection = require("../db/dbconnect");

// to retrive all the employee records

router.get("/employees",function(req, resp){
    connection.query("select * from employee", function(err, data, fields){
        if(err){
            resp.status(500).send("no data found");
        }
        else{
            resp.render("index",{empdata:data});
        }
    })
})

// display empty form

router.get("/displayaddform",function(req,resp){
    
    resp.render("add-emp");
})
module.exports = router


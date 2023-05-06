//import all libraries
var express=require("express");
//to take of all URLs user express router
var router=express.Router()
var mysql
const connection=require("../db/dbconnect")

//to retrieve all the employee records
router.get("/employees",function(req,resp){
      connection.query("select * from employee",function(err,data,fields){
        if(err){
             resp.status(500).send("no data found");
        }
        else{
            //to create a index.ejs file in views folder
            //resp.render("index",{empdata:data})
            resp.send(data);
        }

      })
})



//add data into datanbase
router.post("/employee",function(req,resp){
    //insertquery
    connection.query("insert into employee values(?,?,?)",[req.body.empid,req.body.ename,req.body.sal],function(err,result){
        if(err){
            resp.status(500).send("no data found");
       }else if(result.affectedRows>0){
            resp.send("Message: data added successfully")
        }

    })
})

router.get("/employee/:empid",function(req,resp){
    connection.query("select * from employee where empid= ?",[req.params.empid],function(err,data,fields){
        if(err){
            resp.status(500).send("no data found");
        }
        else{
            resp.send(data[0]);
        }
    })

    })

router.put("/employee",function(req,resp){
      connection.query("update employee set ename=?,sal=? where empid=?",[req.body.ename,req.body.sal,req.body.empid],function(err,result){
        if(err){
            resp.status(500).send("no data found");
        }
        else{
            resp.status(200).send("data updated successfully")
        }
      })
})

router.delete("/employee/:empid",function(req,resp){
    connection.query("delete from employee where empid=?",[req.params.empid],function(err,result){
        if(err){
            resp.status(500).send("no data found");
        }
        else{
            resp.redirect("/employees");
        }
    })

})



module.exports=router;
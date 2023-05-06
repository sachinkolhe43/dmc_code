//import all libraries
var express = require("express");
//to take of all URLs user express router
var router = express.Router()

const connection = require("../db/dbconnect")

//to retrieve all the employee records
router.get("/emp", function (req, resp) {
    connection.query("select * from employee", function (err, data, fields) {
        if (err) {
            resp.status(500).send("no data found");
        }
        else {
            //to create a index.ejs file in views folder
            resp.render("index", { empdata: data })
        }

    })
})

//display empty form 
router.get("/displayaddform", function (req, resp) {
    // to display empty form for adding data
    resp.render("add-emp")
})

//add data into datanbase
router.post("/addemp", function (req, resp) {
    //insertquery
    connection.query("insert into employee values(?,?,?)", [req.body.empid, req.body.ename, req.body.sal], function (err, result) {
        if (err) {
            resp.status(500).send("no data found");
        } else if (result.affectedRows > 0) {
            resp.redirect("/employees")
        }

    })
})

router.get("/edit/:empid", function (req, resp) {
    connection.query("select * from employee where empid= ?", [req.params.empid], function (err, data, fields) {
        if (err) {
            resp.status(500).send("no data found");
        }
        else {
            resp.render("update-emp", { emp: data[0] })
        }
    })

})

router.post("/updateemp", function (req, resp) {
    connection.query("update employee set ename=?,sal=? where empid=?", [req.body.ename, req.body.sal, req.body.empid], function (err, result) {
        if (err) {
            resp.status(500).send("no data found");
        }
        else {
            resp.redirect("/employees");
        }
    })
})

router.get("/delete/:empid", function (req, resp) {
    connection.query("delete from employee where empid=?", [req.params.empid], function (err, result) {
        if (err) {
            resp.status(500).send("no data found");
        }
        else {
            resp.redirect("/employees");
        }
    })

})



module.exports = router;
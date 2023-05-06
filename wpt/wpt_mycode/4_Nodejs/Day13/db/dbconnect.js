const mysql = require('mysql');

//databse connection
//MySQL details
var mysqlConnection = mysql.createConnection({
    host: '127.0.0.1',
    user: 'root',
    password: 'manager',
    database: 'test',
    port:3306
   /* multipleStatements: true*/
    });
    mysqlConnection.connect((err)=> {
        if(!err)
        console.log('Connection Established Successfully');
        else
        console.log('Connection Failed!'+ JSON.stringify(err,undefined,2));
        });

        module.exports=mysqlConnection;
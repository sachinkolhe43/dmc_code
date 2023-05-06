var fs=require("fs");

fs.writeFileSync("test.txt","text written in file");

var data=fs.readFile("test.txt",function(err,data){
    if(err){
        console.log("error occureed",err);
    }else{
        console.log("Asynchronous read\n"+data.toString());
    }
    
});


const fs=require("fs");
fs.copyFile("sampledata.txt","targetdata.txt",function(err){
 if(err){
    console.log("error occured");
 }else{
    console.log("copy done");
    fs.readFile("targetdata.txt",function(err,data){
        if(err){
            console.log("error occured");
        }
        else{
            console.log(data.toString());
        }
    })
 }
})

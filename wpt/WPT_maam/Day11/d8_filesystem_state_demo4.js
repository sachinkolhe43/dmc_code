var fs=require('fs');
console.log("get file information");
fs.stat("test.txt",function(err,status){
    if(err){
        console.log("Error : "+err.code+"--->"+err.message);
        console.log("error occured")
    }
    else{
        console.log(status);
        console.log("is file?"+status.isFile());
        console.log("is directory?"+status.isDirectory());
        console.log("size: "+status.size)
    }
})
console.log("after state called")
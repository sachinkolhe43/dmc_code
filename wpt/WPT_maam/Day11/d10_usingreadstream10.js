//readStream events data, error, end

const fs=require('fs');

var rs=fs.createReadStream("sampledata.txt","utf8");
var value="";
rs.on("data",function(chunk){
    console.log("in data event handler")
   value=value+chunk;
})
rs.on("end",function(){
    console.log("reached to end of file");
    console.log(value);
})
rs.on("error",function(){
    console.log("error occured")
})

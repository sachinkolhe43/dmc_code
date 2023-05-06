var fs=require("fs");
console.log("before read async")
fs.readFile("sampledata.txt",function(err,data){
   if(err){
    console.log("error occureed",err);
   } else{
    console.log("Asynchronous read\n"+data.toString());
   }
})
console.log("after read async")
//synchronous read
console.log("before readFilesync")
var d=fs.readFileSync("test.txt");
console.log("synchronous read"+d.toString())
console.log("after readFilesync")


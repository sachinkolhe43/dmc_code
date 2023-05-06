var fs=require("fs");
//write to file
fs.writeFileSync("test.txt","The text to be written in the file")

//read data from the file
var data=fs.readFileSync("test.txt");
console.log(data.toString());
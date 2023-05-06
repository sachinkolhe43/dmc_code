const fs=require("fs");
rs=fs.createReadStream("sampledata.txt");
ws=fs.createWriteStream("targetdata.dat")
//pipe the data between readstream and writestream
rs.pipe(ws);
console.log("end of the program")
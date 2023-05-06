var fs = require('fs');
var m1 = require("./module1");
var fname = "test.txt";
fs.exists(fname, function (exist) {
    if (!exist) {
        console.log("file not found")
    } else {
        fs.open(fname, "r", function (err, fd) {
            buffer = Buffer.alloc(40);

            fs.read(fd, buffer, 0, 40, null, function (err, bytesread, buffer) {
                if (err) {
                    console.log("error occured")
                }
                else {

                    console.log("count :" + bytesread);
                    console.log(buffer.toString());
                    fs.close(fd);
                }
            })
        })
    }

})
console.log("permutation: " + m1.permutation(6, 5))
const http = require("http");
const url = require("url");
const fs = require("fs");

var server = http.createServer(function (req, resp) {
    var q = url.parse(req.url, true);  //q{pathname:"/submit-data", query:{num1:100,num2:100}}
    resp.writeHeader(200, { "content-type": "text/html" })
    switch (q.pathname) {
        case "/index":
            rs = fs.createReadStream("index.html")
            rs.pipe(resp);
            break;
    }
})

server.listen(4000, function () {
    console.log("Server is running at port no. 4000....")
});
var buf=Buffer.alloc(80);
for(var i=0;i<26;i++){
    buf[i]=i+97
}
console.log(buf.toString('ascii'))
console.log(buf.toString('utf8',0,5))
console.log(buf.toString('utf8',5,8))

var buf1=new Buffer("node");
console.log(buf1.toString());

var buff2=new Buffer("Hello All");
var portion=buff2.slice(6,9);
console.log(buff2.toString());
console.log(portion.toString());

var target=Buffer.alloc(buff2.length);
buff2.copy(target,0,0,5);
console.log(buff2.toString());
console.log(target.toString());

//write a code for allocating 100 location for a buffer
//and ator capital alphabets in it
var buff=Buffer.alloc(100);
for(var i=0;i<26;i++){
    buff[i]=i+65;
}
console.log(buff.toString());
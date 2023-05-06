var m3=require("./module3");
var s=m3.f1(1,2,3,4,5);
console.log(`Addition : ${s}`);
var flag=m3.f2(7);
if(flag){
    console.log("it is prime number");
}else{
    console.log("it is not a prime number")
}
console.log(m3.user.uname);
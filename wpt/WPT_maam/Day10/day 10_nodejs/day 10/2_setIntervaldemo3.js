function f1(){
    for(var i=0;i<3;i++){
       console.log("hello");
    }
}
function f3(data){
    clearInterval(data);
}

console.log("testing before interval")
var a=setInterval(f1,1000);
setTimeout(f3,4500,a);
a=34;
b=50;
console.log("addition :"+(a+b))
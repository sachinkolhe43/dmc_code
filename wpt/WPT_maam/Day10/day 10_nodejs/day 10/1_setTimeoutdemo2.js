function f1(){
    console.log("hello");
}
function printtable(n){
    for(var i=1;i<=10;i++){
        console.log(i+" * "+ n+" = "+(n*i))
    }
}

console.log("before settimeout")
setTimeout(f1,2000);
setTimeout(printtable,1000,7);
console.log("after setTimeout")
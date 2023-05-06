function addition(a,b,...c){
    s=a+b;
    for(var x of c){
        s=s+x;
    }
    return s;
}

function prime(num){
    for(var i=2;i<num;i++){
        if(num%i===0){
            return false;
        }
    }
    return true;
}
var user={userid:12,uname:"Kishori"}

module.exports={
    f1:addition,
    f2:prime,
    user:user
}
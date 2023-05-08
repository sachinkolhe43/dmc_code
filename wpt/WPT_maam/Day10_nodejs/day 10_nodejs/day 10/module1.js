exports.addition=function(a,b){
    return a+b;
}

exports.factorial=function(n){
    f=1;
    for(var i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}


//console.log(addition(12,13));
//console.log(factorial(5));
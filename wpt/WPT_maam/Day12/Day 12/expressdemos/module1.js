exports.addition=function(a,b){
    return a+b;
}

exports.factorial=function(num){
    var f=1;
    for(var i=1;i<=num;i++){
        f=f*i;
    }
    return f;
}
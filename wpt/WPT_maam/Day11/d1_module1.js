function factorial(n){
    f=1;
    for(var i=1;i<=n;i++){
        f=f*i
    }
    return f;
}
exports.combination=function(n,r){
    //n!/(n-r)!r!
    var ans=factorial(n)/(factorial(n-r)*factorial(r));
    return ans;
}
exports.permutation=function(n,r){
    //n!/(n-r)!
    var ans=factorial(n)/factorial(n-r)
    return ans;
}
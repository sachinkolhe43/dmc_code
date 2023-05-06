table=function(n){

    for(var i=1; i<=10; i++){

        console.log(n+" * "+i+" = "+(n*i));
    }
}

// setTimeout(table,1000,4);
var v=setInterval(table,4000,4);
clearInterval(v,7000);
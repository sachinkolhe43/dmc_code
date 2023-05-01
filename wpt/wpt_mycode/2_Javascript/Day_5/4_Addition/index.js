function sum(){
    var a=parseInt(document.getElementById("num1").value);
    var b=parseInt(document.getElementById("num2").value);

    var sum=a+b;
    document.getElementById("result").value=sum;
}

function sub(){
    var a=parseInt(document.getElementById("num1").value);
    var b=parseInt(document.getElementById("num2").value);

    var sub=a-b;
    document.getElementById("result").value=sub;
}

function multi(){
    var a=parseInt(document.getElementById("num1").value);
    var b=parseInt(document.getElementById("num2").value);

    var multi=a*b;
    document.getElementById("result").value=multi;
}

function sum(){
    var a=parseInt(document.getElementById("num1").value);
    var b=parseInt(document.getElementById("num2").value);

    var sum=a+b;
    document.getElementById("result").value=sum;
}

function fact(){
    var a=parseInt(document.getElementById("num1").value);
    var b=parseInt(document.getElementById("num2").value);

    var fact=1;

    for(var i=1; i<=a; i++){
        fact=fact*i;
    }
    document.getElementById("result").value=fact;
}
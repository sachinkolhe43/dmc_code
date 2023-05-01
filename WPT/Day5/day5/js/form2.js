function factorial(n){
    var f=1;
    for(var i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}
var calculate=function(){
  var a=parseInt(document.getElementById("num1").value);
  var b=parseInt(document.getElementById("num2").value);
  //to select all radio buttons with same name, and store in the arr
  var op;
  var arr=document.getElementsByName("operation")
  //to find which radio button is selected
  for(var i=0;i<arr.length;i++){
    if(arr[i].checked){  //checked property true means the button is selcted
        //assign the value of selected radio button to op variable
       op=arr[i].value;
       //alert(op);
       break;
    }
  }
  switch(op){
    case "add":
        result=a+b;
        break;
    case "sub":
        result=a-b;
        break;
    case "f":
        result=factorial(a);
        break;
  }
  document.getElementById("result").value=result;
}
function checkdisplay(event){
    console.log(event);
    if(document.getElementById("sel").checked){
        var d=document.getElementById("mydiv");
        d.classList.replace("myclass","myshow");
    }else{
        var d=document.getElementById("mydiv");
        d.classList.replace("myshow","myclass");
    }
}

function showcourse(){
    var arr=document.getElementsByName("course");
    for(var ob of arr){
        if(ob.checked){
            alert(ob.value);
            break;
        }
    }
}

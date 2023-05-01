function validateData(){
    console.log("In validate method");
    var flag=validateuname();
    var flag2=validatePass();
    var a=document.getElementById("uname").value;
    
}

function validateuname(){
    console.log("Inside validation method");
    var name=document.getElementById("uname").value;
    console.log("name="+name);
    if(name.trim().length>3){

        document.write("erruname").innerHTML=""
        return true;

    }
    else{
        document.write("erruname").innerHTML="Enter character more than 3";
        return false;
    }
    
}
//closure function
function displayname(first,last){
    fname=first;
    lname=last;
    //
    function showname(){
        return fname+" "+lname;
    }

    return showname();

}

displayname("Kishori","Khadilkar");
console.log(__dirname);
console.log(__filename);
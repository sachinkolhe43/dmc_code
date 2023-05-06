arr=[];

exports.writeData=function(ob){
    //convert javascript object into json format
    jsonob=JSON.stringify(ob);
    arr.push(jsonob);
    console.log(arr)
}


exports.validateUser=function(user){
    for(var data of arr){
        //convert jsondata into javascript object
        ob=JSON.parse(data);
        if(ob.uname===user.uname && ob.pass===user.pass){
            return true;
        }
    }
    return false;
}
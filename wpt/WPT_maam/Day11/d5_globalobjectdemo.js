global.bird="sparrow";
global.companyName='sunbeam';
function getglobal(var_name){
    console.log(global[var_name]);
}

getglobal("bird"); //sparrow
getglobal("companyName"); //sunbeam
getglobal("xxxx"); //undefined

//to find names of all global variables

for(var p in global){
  console.log(p);
}
class Product{
    constructor(pid,pname,qty,pr){
        this.pid=pid;
        this.pname=pname;
        this.qty=qty;
        this.price=pr;

    }
    display(){
        document.write("pid : "+this.pid+"<br>");
        document.write("pname : "+this.pname+"<br>");
        document.write("Quantity : "+this.qty+"<br>");
        document.write("Price : "+this.price+"<br>");

    }
}

class PerishableProduct extends Product{
    constructor(pid,nm,q,pr,duration,mfg){
        super(pid,nm,q,pr);
        this.duration=duration;
        this.mfg=mfg;

    }
    display(){
          super.display();
          document.write("Duration : "+this.duration+"<br>");
          document.write("Manufacture : "+this.mfg);
    }
}
//write a class NonPerishableProduct to store
//pid,pname,qty,pr, availableat
class NonPerishable extends Product{
    constructor(pid,nm,q,pr,av){
        super(pid,nm,q,pr);
        this.availableat=av;
    }
    display(){
        super.display();
        document.write("Available at: "+this.availableat);
    }
}
var p1=new Product(12,'chair',45,4567);
var p2=new Product(13,'table',67,6666);
var pp1=new PerishableProduct(13,'milk',67,6666,3,new Date(2023,04,27));
var np1=new NonPerishable(13,'table',67,6666,"pune deccan")
p1.display();
p1.prop1=34;
p2.display();
console.log("pid",p1.pid);
pp1.display();
np1.display();
document.write("object for loop<br>");
//to navigate through all properties of objects
for(var p in np1){   //{pid:1,pname:'xxx',qty:45}
    document.write(p+"----->"+np1[p]+"<br>");

}
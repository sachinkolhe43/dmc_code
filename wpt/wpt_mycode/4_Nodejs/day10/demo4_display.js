display = function (first, second) {
    fname = first;
    lname = second;

    function showname() {

        return fname + " " + lname;
    }

    return showname();
}

console.log(display("Sachin", "Kolhe"));
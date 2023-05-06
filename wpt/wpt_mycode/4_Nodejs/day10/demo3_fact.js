exports.fact = function (n) {
    f = 1;
    for (var i = 1; i <= n; i++) {

        f = f * i;
    }
    console.log("Factorial is: " + f);
}

fact(5);
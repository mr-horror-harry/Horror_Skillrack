var readline = require('readline');
var reader = readline.createInterface({
  input: process.stdin,
  terminal: true
});

var lines = [];

reader.on('line', function (line) {
    lines.push(line);
});

reader.on('close', function () {
    const ar = lines[0].split(" ");
    var ct=0;
    ar.forEach(function(val){
        f=0;
        val.split("").forEach(function(chr){  // convert each string to charArray by split with no space
            if( !(chr>='a' && chr<='z') ){
                f=1;
                return;
            }
        });
        f==0 ? ct++ : ct;
    });
    console.log(ct);
});
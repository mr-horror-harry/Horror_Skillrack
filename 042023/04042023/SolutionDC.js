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
    
    const n = parseInt(lines[0].trim());
    const ar = lines[1].split(" ");
    const x = parseInt(lines[2].trim());
    
    var f=0;
    ar.forEach(function(val){
        if(val < x){
            f=1;
            return;
        }
    });
    console.log(f==1 ? "no" : "yes");
    return;
});
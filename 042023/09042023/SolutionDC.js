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
    
    var n = Number(lines[0].trim());
    var d=2;
    while(n-->0){
        console.log("-".repeat(n) + "*".repeat(d) + "-".repeat(n));
        d+=2;
    }
    
});
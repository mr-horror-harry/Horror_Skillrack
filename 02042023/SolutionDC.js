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
    const max = Math.max(...ar);
    var res="";
    
    ar.forEach(function(val){
        res += max-val + " ";
    });
    
    console.log(res);
});
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
    
    const n = parseInt(lines[1].split(" ")[0])
    const x = parseInt(lines[1].split(" ")[1])
    
    console.log(lines[0].substring(0,n).repeat(x))
    
});
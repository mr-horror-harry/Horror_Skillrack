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
    
    const m = lines[0].split(" ")[0]
    const n = lines[0].split(" ")[1]
    
    console.log(
        n.charAt(0)==m.charAt(0) || n.charAt(0)==m.charAt(1) || n.charAt(1)==m.charAt(0) || n.charAt(1)==m.charAt(1) ? "Valid" : "Invalid")
});
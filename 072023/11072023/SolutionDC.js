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
    
    let l = lines[0].length, x
    
    let u = lines[0].charAt(l-1)-'0'
    
    x = lines[0].charAt(l-2)-'0'
    if(x>u) u=x
    x = lines[0].charAt(l-3)-'0'
    if(x>u) u=x
    
    console.log(u)
    
});
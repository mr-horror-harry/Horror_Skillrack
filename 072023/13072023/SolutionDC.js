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
    
    m = parseInt(lines[0].split(' ')[0])
    n = parseInt(lines[0].split(' ')[1])
    
    while(m <= n){
        process.stdout.write( (m%10 + Math.trunc(m/10)%10)%2==0 ? m +" " : "")
        m++
    }
    
});
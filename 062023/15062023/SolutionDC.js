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
    
    const s1 = lines[0]
    const s2 = lines[1]
    
    for(i=0; i<s1.length; i++){
        process.stdout.write( i%2==0 ? s1[i] : s2[i])
    }
    
});
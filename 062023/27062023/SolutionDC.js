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
    
    let ar = lines[0].split(" ")[0].split("")
    let n = parseInt(lines[0].split(" ")[1])
    
    const x = ar.filter((elt, i) => (i+1)%n!=0 )
    
    x.forEach((elt) => {
        process.stdout.write(elt)
    })
    
});
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
    
    var m = parseInt(lines[0].split(" ")[0])
    var n = parseInt(lines[0].split(" ")[1])
    
    var min = m<n ? m : n
    
    for(let i=2; i<=min; i++){
        if(m%i==0 && n%i==0){
            console.log(i)
            return
        }
    }
    console.log(-1)
});
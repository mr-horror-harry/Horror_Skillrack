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
    
    let n = parseInt(lines[0])
    let st=0
    while(n>0){
        
        process.stdout.write("*".repeat(st))
        
        for(let i=1; i<=n; i++)
            process.stdout.write(i!=n ?  i+"*" : i+"")
            
        console.log("*".repeat(st++))
        n--;
    }
    
});
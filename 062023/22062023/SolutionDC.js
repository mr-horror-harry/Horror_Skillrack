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
    
    var x=lines[0].trim()
    let overAll=0
    
    for(let i=x.length-1; i>=0; i--){
        
        let inF=0;
        for(let j=i; j>=0; j--){
            if((x.charAt(j)-'0')%2==1){
                process.stdout.write(x.charAt(j) + " ")
                inF=1
                overAll=1
            }
        }
        
        if(inF==0){
            break;
        }
    }
    
    if(overAll==0){
        console.log(-1)
    }
    
});
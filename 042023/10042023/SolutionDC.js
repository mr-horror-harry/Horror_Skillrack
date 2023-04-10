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
    var ar = lines[0].trim().split("");
    
    for(i=0; i<ar.length-2; i++){
        if(ar[i]==ar[i+1] && ar[i]==ar[i+2]){
            console.log("invalid");
            return;
        }
    }
    console.log("valid");
    return;
});
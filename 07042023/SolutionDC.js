//tmp variable method by js

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
    
    var ar = lines[0].split("");
    
    var res=0;
    for(i=0; i < ar.length; i+=2){
        res = (res*10) + parseInt(ar[i+1]);
        res = (res*10) + parseInt(ar[i]);
    }
    console.log(res);
    
});
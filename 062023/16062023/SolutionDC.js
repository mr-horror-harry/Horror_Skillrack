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
    
    const m = parseInt(lines[0].split(" ")[0])
    const n = parseInt(lines[0].split(" ")[1])
    
    function isPrime(val){
        val = parseInt(val)
        
        for(let i=2; i*i<=val; i++){
            if(val%i==0){
                return false
            }
        }
        return true
    }
    
    for(var i=1; i<=m; i++){
        
        ar = lines[i].split(" ")
        
        for(let j=0; j<n; j++){
            process.stdout.write( isPrime(ar[j]) ? "1 " : "0 ") 
        }
        console.log()
    }
    
});
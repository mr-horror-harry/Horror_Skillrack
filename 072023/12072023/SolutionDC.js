var readline = require('readline');
var reader = readline.createInterface({
  input: process.stdin,
  terminal: true
});

var lines = [];

reader.on('line', function (line) {
    lines.push(line);
});

const isPrime = (val) => {
    n = parseInt(val)
    for(let i=2; i*i<=n; i++)
        if(n%i==0)
            return false
    return true
}

reader.on('close', function () {
    
    if( !isPrime(lines[0]) ){
        console.log("NO")
        return
    }
    if( !isPrime(lines[0].split('').reverse().join('')) ){
        console.log("NO")
        return
    }
    console.log("YES")
    
});
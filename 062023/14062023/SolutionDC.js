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
    
    var s = lines[0]
    var odd = "", eve = "", vow=0, ct=1
    
    for(const c of s){
        
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') vow++
        ct%2==1 ? odd+=c : eve+=c 
        
        ct++;
        
    }
    
    console.log(vow==0 ? "-1" : vow%2==0 ? eve : odd)
    
});
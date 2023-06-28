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
    
    const m = parseInt(lines[0].split(" ")[0]) + 1
    const n = lines[0].split(" ")[1]
    
    for(let i=1; i<m; i++){
        lines[i] = lines[i].split(" ")
    }
    
    let maxCt = 0, res
    
    for(let j=0; j<n; j++){
        ct = 0
        for(let i=1; i<m; i++){
            if(parseInt(lines[i][j]) < 0){
                ct++
            }
        }
        if(ct > maxCt){
            maxCt = ct
            res = j
        }
    }
    
    console.log(maxCt!=0 ? res+1 : -1)
    
});
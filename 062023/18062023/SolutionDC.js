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
    
    function isSame(x, y){
        return x==y
    }
    
    const m=parseInt(lines[0].split(" ")[0])
    const n=parseInt(lines[0].split(" ")[1])
    
    var mat = []
    
    for(let i=1; i<=m; i++){
        let ar = lines[i].split(" ")
        mat.push(ar)
    }
    
    for(let i=m+1; i<=2*m; i++){
        let ar = lines[i].split(" ")
        for(let j=0; j<n; j++){
            process.stdout.write(isSame(ar[j], mat[i-m-1][j]) ? ar[j]+" " : "* ")
        }
        console.log()
    }
    
});
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
    
    let n = parseInt(lines[0].split(" ")[0])
    let x = parseInt(lines[0].split(" ")[1])
    
    let f=0;
    let tmp;
    
    lines[1].split(" ").forEach((num) => {
            
        if(parseInt(num)%x==0){
            f=1
            process.stdout.write((tmp = num) + " ")            // or num
        }
        else
            process.stdout.write(f==1 ? tmp+" ": num+" ")
    })
    
});
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
    
    s = lines[0]
    n=s.length
    
    function isCons(val){
        return !(val=='a' || val=='e' || val=='i' || val=='o' || val=='u')
    }
    
    var k=0
    for(let i=0; i<n; i++){
        if(isCons( s.charAt(i) )){
            let j=i+1;
            while( isCons(s.charAt(j) ) && j<n){
                j++
            }
            if(!isCons(s.charAt(j))){
                process.stdout.write(s.charAt(j))
            }
        }
        else{
            k=1
            process.stdout.write(s.charAt(i))
        }
    }
    
    console.log(k==0 ? -1 : " hi")
});
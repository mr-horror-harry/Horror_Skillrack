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
    
    
    function isVowel(c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
    }
    
    let s = lines[0].split(" ")[0].split("")
    let c = lines[0].split(" ")[1]
    
    let pos=0, vow='', f;
    
    for(let i=0; i<s.length; i++){
        f=0
        if(s[i]==c){
            for(let j=i+1; j<s.length; j++){
                if(isVowel(s[j])){
                    process.stdout.write(s[j])
                    f=1
                    break;
                }
            }
            if(f==0){
                process.stdout.write(s[i])
            }
        }
        else{
            process.stdout.write(s[i])
        }
    }
});
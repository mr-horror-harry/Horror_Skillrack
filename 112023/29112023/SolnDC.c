void hidePassword(char s[])
{
    int med=0;
    for(int i=0; i<strlen(s); i++)
        med+=s[i]>='0' && s[i]<='9' ? -1 : +1;
    
    for(int i=0; i<strlen(s); i++){
        if(med>=0){
            if(!(s[i]>='0' && s[i]<='9'))
                s[i]='*';
        }
        else{
            if(s[i]>='0' && s[i]<='9')
                s[i]='*';
        }
    }
}
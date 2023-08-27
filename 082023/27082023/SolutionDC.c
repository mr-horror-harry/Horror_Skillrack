int isVowel(char c){
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
}

void removeVowels(char* s){
    char res[strlen(s)];
    int p=0;
    
    for(int i=0; i<strlen(s); i++)
        if(!isVowel(tolower(s[i])))
            res[p++]=s[i];
            
    res[p]='\0';
    strcpy(s, res);
}
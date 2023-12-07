char* getStringOfABC(int n)
{
    char *s=(char*)malloc(n+1), c;
    int i=0;
    short f=1;
    while(n-->0){
        if(f==1){
            f=2;
            c='a';
        }
        else if(f==2){
            f=3;
            c='b';
        }
        else{
            f=1;
            c='c';
        }
        s[i++]=c;
    }
    return s;
}
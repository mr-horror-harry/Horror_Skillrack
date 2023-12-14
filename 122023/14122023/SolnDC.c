int* getArrayOfOddOrEven(int n)
{
    int* ar = (int*) malloc(n*sizeof(int));
    int beg = n%2==0 ? 2 : 1, i=0;
    while(n-->0){
        ar[i++]=beg;
        beg+=2;
    }
    return ar;
}
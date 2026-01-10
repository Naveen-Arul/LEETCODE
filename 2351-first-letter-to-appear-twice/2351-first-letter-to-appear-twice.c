char repeatedCharacter(char* s) {
    int n=strlen(s);
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            if(s[i]==s[j]){
                return s[i];
            }
        }
    }
    return -1;
}
bool isValid(char* s) {
    char a[10000];
    int top=-1;
    for(int i=0;s[i]!='\0';i++)
    {
        char ch=s[i];
        if(ch=='{')
        {
            a[++top]='}';
        }
        else if(ch=='(')
        {
            a[++top]=')';
        }
        else if(ch=='[')
        {
            a[++top]=']';
        }
        else {
            if(top==-1 || a[top--]!=ch)
            {
                return false;
            }
        }
    }
            return top==-1;
}

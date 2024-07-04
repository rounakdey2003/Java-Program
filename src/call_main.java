class MainCall
{
    static String s[]={"Java","Is","Fun"};
    static int c;
    public static void main(String args[])
    {

        System.out.print(c+" ");
        System.out.println(s[c]);
        c=c+1;
        if(c==3)
            System.exit(0);
        else
            main(s);
    }
}

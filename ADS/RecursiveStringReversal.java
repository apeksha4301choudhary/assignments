class RecursiveStringReversal{
    public static String rev(String s){
        int n = s.length();
        if(n == 0){
            return s;
        }
        else
            return rev(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String s = "recursion";

        System.out.println("Reversed : " + rev(s));
    }
}
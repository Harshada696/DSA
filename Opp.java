Class Opp{
    String name ="name";
    int num=1;
    public void add(){
        System.out.println("name"+name+"num"+num);
    }
}
Class New extends Oppw{
    public static void main(){
        Opp op=new Opp("harshu",10);
        op.add();
    }
}
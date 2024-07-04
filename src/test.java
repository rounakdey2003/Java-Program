class test{
    String name;
    int id;

    test(String name, int id){
        this.name = name;
        this.id = id;
    }
};
class display {
    public static void main(String[] args) {

        test test1 = new test("aaa",1);
        System.out.println("Name: "+test1.name+"Id: "+test1.id);

    }
}
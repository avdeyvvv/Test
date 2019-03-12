public class Cat {
    private String name;

//    public Cat (String name){
//        this.name = name;
//    }
    public String getName() {
        return "Vaska";
    }
    public Cat parent;

    public Object getMyParent (){
        return this.parent;
    }
    public void setMyParent (Cat cat){
        this.parent = cat;
    }
}


//interface HasName {
//    String getName();
//    int getWeight();
//}

class Tiger extends Cat {
//    @Override
//    public int getWeight() {
//        return 115;
//    }

public String getName (){
    return "Tiger Petka";
}

    public synchronized Object getMyParent()
    {
        if (this.parent != null)
            return this.parent;
        else
            return "я - сирота";
    }

}

class Solo extends Cat {

    public Solo (){

    }
    public static void main(String[] args) {

        Tiger parent = new Tiger();

        Cat me = new Tiger();
        Cat myParent = (Cat) me.getMyParent();
        System.out.println(myParent.getMyParent());

    }

}
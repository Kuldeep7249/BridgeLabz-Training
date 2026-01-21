public class BookCategory implements Category {
    private String name;
    public BookCategory(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

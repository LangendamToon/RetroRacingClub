public class Tag {
    private Integer maanden;
    private String tag;

    public Tag(Integer maanden){
        this.maanden = maanden;
    }

    public String giveTag(){
        if(maanden < 12){
            tag = "Amateur";
        } else if(maanden < 48){
            tag = "Hobbyist";
        } else if(maanden > 47){
            tag = "Professional";
        }
        return tag;
    }
}

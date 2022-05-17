public enum StateType{
    R("운행중"), W("일반"), P("차고지행");
    private final String name;
    private StateType(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
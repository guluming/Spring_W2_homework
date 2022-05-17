package BusStatePkg;

public enum StateType {
    R("운행"), P("차고지행");
    final private String name;
    private StateType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
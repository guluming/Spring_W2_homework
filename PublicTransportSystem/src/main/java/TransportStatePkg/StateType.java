package TransportStatePkg;

public enum StateType {
    R("운행"), W("일반"), P("차고지행");
    final private String name;
    private StateType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
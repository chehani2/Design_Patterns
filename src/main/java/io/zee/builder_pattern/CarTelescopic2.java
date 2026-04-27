package io.zee.builder_pattern;

//Not a best practice. Bit complicated
public class CarTelescopic2 {

    private String insurance;

    private boolean etc;

    private String dropOffLocation;

    private String roadAssistance;

    public CarTelescopic2(String insurance, boolean etc, String dropOffLocation, String roadAssistance) {
        this.insurance = insurance;
        this.etc = etc;
        this.dropOffLocation = dropOffLocation;
        this.roadAssistance = roadAssistance;
    }

    public CarTelescopic2(String insurance, boolean etc, String dropOffLocation) {
        this(insurance, etc, dropOffLocation, null);
    }

    public CarTelescopic2(String insurance, boolean etc) {
        this(insurance, etc, null, null);
    }

    public CarTelescopic2(String insurance) {
        this(insurance, false, null, null);
    }

    @Override
    public String toString() {
        return "CarTelescopic2{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", roadAssistance='" + roadAssistance + '\'' +
                '}';
    }
}


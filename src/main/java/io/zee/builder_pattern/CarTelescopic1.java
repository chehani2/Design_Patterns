package io.zee.builder_pattern;

//Not a best practice. Bit complicated
public class CarTelescopic1 {

    private String insurance;

    private boolean etc;

    private String dropOffLocation;

    private String roadAssistance;

    public CarTelescopic1(String insurance) {
        this.insurance = insurance;
    }

    public CarTelescopic1(String insurance, boolean etc) {
        this(insurance);
        this.etc = etc;
    }

    public CarTelescopic1(String insurance, boolean etc, String dropOffLocation) {
        this(insurance, etc);
        this.dropOffLocation = dropOffLocation;
    }

    public CarTelescopic1(String insurance, boolean etc, String dropOffLocation, String roadAssistance) {
        this(insurance, etc, dropOffLocation);
        this.roadAssistance = roadAssistance;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public boolean isEtc() {
        return etc;
    }

    public void setEtc(boolean etc) {
        this.etc = etc;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getRoadAssistance() {
        return roadAssistance;
    }

    public void setRoadAssistance(String roadAssistance) {
        this.roadAssistance = roadAssistance;
    }

    @Override
    public String toString() {
        return "CarTelescopic1{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", roadAssistance='" + roadAssistance + '\'' +
                '}';
    }
}

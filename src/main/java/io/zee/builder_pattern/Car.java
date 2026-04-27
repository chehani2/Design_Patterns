package io.zee.builder_pattern;

public class Car {

    private final String insurance;
    private final Boolean etc;
    private final String dropOffLocation;
    private final String roadAssistance;

    public Car(Builder builder) {
        this.insurance = builder.insurance;
        this.etc = builder.etc;
        this.dropOffLocation = builder.dropOffLocation;
        this.roadAssistance = builder.roadAssistance;
    }

    static class Builder {
        private final String insurance;
        private Boolean etc;
        private String dropOffLocation;
        private String roadAssistance;

        public Car build() {
            return new Car(this);
        }

        public Builder(String insurance) {
            this.insurance = insurance;
        }

        public Builder etc(Boolean etc) {
            this.etc = etc;
            return this;
        }

        public Builder dropOffLocation(String dropOffLocation) {
            this.dropOffLocation = dropOffLocation;
            return this;
        }

        public Builder roadAssistance(String roadAssistance) {
            this.roadAssistance = roadAssistance;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", roadAssistance='" + roadAssistance + '\'' +
                '}';
    }
}

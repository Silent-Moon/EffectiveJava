package ch2.item2;

class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // Default

        Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() { // Note that the method signature is different from its parent, this is known as covariant return typing
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}

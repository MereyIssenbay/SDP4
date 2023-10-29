class NikeJerseyFactory implements JerseyFactory {
    @Override
    public Jersey createJersey() {
        return new NikeJersey();
    }
}
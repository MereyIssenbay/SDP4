class AdidasJerseyFactory implements JerseyFactory {
    @Override
    public Jersey createJersey() {
        return new AdidasJersey();
    }
}
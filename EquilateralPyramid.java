class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double side) {
        super(side, 0, 0);
    }

    @Override
    public double calculateArea() {
        double baseArea = dim_one * dim_one;
        double lateralArea = Math.sqrt(3) * dim_one * dim_one;
        return baseArea + lateralArea;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * dim_one;
    }

    @Override
    public double calculateVolume() {
        return (Math.sqrt(2) / 6) * Math.pow(dim_one, 3);
    }
}
